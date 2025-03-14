import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    // Memoization untuk menyimpan hasil perhitungan per eksponen
    static Map<Integer, Integer> memo = new HashMap<>();
    // Untuk melacak eksponen yang outputnya sudah dicetak
    static Set<Integer> printedExponents = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === [1] PROSES ENKRIPSI ===
        System.out.printf("Masukkan teks: ");
        String inputText = scanner.nextLine();

        System.out.printf("Masukkan exponent (e): ");
        int e = scanner.nextInt();
        System.out.printf("Masukkan modulus (m): ");
        int m = scanner.nextInt();

        // (1) Konversi teks ke kode ASCII (3 digit per karakter)
        StringBuilder asciiBuilder = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            // Setiap karakter diubah ke integer, lalu dikonkatenasi
            asciiBuilder.append((int) inputText.charAt(i));
        }
        String asciiStr = asciiBuilder.toString();
        System.out.printf("\nKode ASCII hasil konversi: %s\n", asciiStr);

        // (2) Pecah string ASCII menjadi kelompok 3 digit
        List<String> groups = new ArrayList<>();
        for (int i = 0; i < asciiStr.length(); i += 3) {
            String group;
            if (i + 3 <= asciiStr.length()) {
                group = asciiStr.substring(i, i + 3);
            } else {
                // Jika kurang dari 3 digit, tambahkan '0' di depan
                group = String.format("%3s", asciiStr.substring(i)).replace(' ', '0');
            }
            groups.add(group);
        }

        // Tampilkan x (kelompok 3 digit ASCII)
        System.out.printf("\nInisialisasi x dengan kelompok 3 digit kode ASCII:\n");
        for (int i = 0; i < groups.size(); i++) {
            System.out.printf("x%d = %s\n", i + 1, groups.get(i));
        }
        System.out.printf("\n");

        // (3) Enkripsi: hitung (b^e mod m) untuk setiap x
        List<String> encryptionFinalResults = new ArrayList<>();
        for (int i = 0; i < groups.size(); i++) {
            int b = Integer.parseInt(groups.get(i));
            // Reset memoization sebelum memproses base baru
            memo.clear();
            printedExponents.clear();

            System.out.printf("Proses modular untuk x%d (b = %d):\n", i + 1, b);
            int result = modExp(b, e, m);
            System.out.printf("Final result: %d\n\n", result);

            // Simpan final result apa adanya (tanpa format 3 digit)
            encryptionFinalResults.add(String.valueOf(result));
        }

        // (4) Buat ciphertext dengan memisahkan setiap final result dengan spasi
        String ciphertext = String.join(" ", encryptionFinalResults);
        System.out.printf("Ciphertext: %s\n", ciphertext);


        // === [2] PROSES DEKRIPSI ===
        System.out.printf("\n=== Proses DEKRIPSI ===\n");
        System.out.printf("Masukkan dekripsi exponent (d): ");
        int d = scanner.nextInt();

        // (1) Gunakan ciphertext (final result enkripsi) sebagai base (b)
        //     untuk dekripsi
        List<String> decryptionFinalResults = new ArrayList<>();

        // (2) Dekripsi: hitung (b^d mod m) untuk tiap final result
        for (int i = 0; i < encryptionFinalResults.size(); i++) {
            int b = Integer.parseInt(encryptionFinalResults.get(i));
            memo.clear();
            printedExponents.clear();

            System.out.printf("Proses dekripsi untuk final result x%d (b = %d):\n", i + 1, b);
            int result = modExp(b, d, m);
            System.out.printf("Final result: %d\n\n", result);

            // Kumpulkan final result dekripsi
            decryptionFinalResults.add(String.valueOf(result));
        }

        // (3) Gabungkan semua final result dekripsi menjadi satu string (tanpa spasi)
        StringBuilder plaintextNumberSB = new StringBuilder();
        for (String s : decryptionFinalResults) {
            plaintextNumberSB.append(s);
        }
        String plaintext = plaintextNumberSB.toString();

        // Tampilkan plaintext (gabungan final result dekripsi)
        // -> misal "7265827332..."
        System.out.printf("Plaintext: %s\n", plaintext);

        // (4) Konversi plaintext (deretan digit) menjadi karakter ASCII
        //     Setiap 2 digit -> satu karakter
        StringBuilder originalChars = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i += 2) {
            String pair;
            if (i + 2 <= plaintext.length()) {
                pair = plaintext.substring(i, i + 2);
            } else {
                // Jika sisa 1 digit, tambahkan '0' di depan
                pair = String.format("%2s", plaintext.substring(i)).replace(' ', '0');
            }
            int asciiVal = Integer.parseInt(pair);
            originalChars.append((char) asciiVal);
        }

        // Tampilkan karakter asli hasil interpretasi 2 digit ASCII
        System.out.printf("Karakter Asli: %s\n", originalChars.toString());

        scanner.close();
    }

    /**
     * Fungsi rekursif untuk menghitung (b^e) mod m dengan Pola Eksponen Dua Budi.
     * Mencetak 7 baris penjelasan hanya sekali per eksponen e.
     */
    public static int modExp(int b, int e, int m) {
        // Cek memoization
        if (memo.containsKey(e)) {
            return memo.get(e);
        }

        int result;
        // Basis: e == 1
        if (e == 1) {
            if (!printedExponents.contains(e)) {
                System.out.printf("Base case: %d%s mod %d ≡ %d\n", b, toSuperscript(1), m, (b % m));
                printedExponents.add(e);
            }
            result = b % m;
            memo.put(e, result);
            return result;
        }

        // Dekomposisi e (Pola Eksponen Dua Budi)
        int e1, e2;
        if (e % 2 == 0) {
            e1 = e / 2;
            e2 = e / 2;
        } else {
            e1 = Integer.highestOneBit(e);
            e2 = e - e1;
        }

        // Rekursif
        int left = modExp(b, e1, m);
        int right = modExp(b, e2, m);
        int combined = (left * right) % m;

        // Cetak 7 baris penjelasan hanya sekali per e
        if (!printedExponents.contains(e)) {
            printedExponents.add(e);


            System.out.printf("%d%s mod %d = %d%s . %d%s mod %d\n", b, toSuperscript(e), m, b, toSuperscript(e1), b, toSuperscript(e2), m);
            System.out.printf("                   = [(%d%s mod %d)( %d%s mod %d)] mod %d\n",
                    b, toSuperscript(e1), m, b, toSuperscript(e2), m, m);
            System.out.printf("                   = (%d)(%d) mod %d\n", left, right, m);
            int multiplication = left * right;
            System.out.printf("                   = %d mod %d\n", multiplication, m);

            // Pembagian dan pengambilan angka depan koma
            int quotient = multiplication / m;
            int reductionValue = quotient * m;
            System.out.printf("                   = (%d)(%d)\n", quotient, m);
            System.out.printf("                   = %d\n", reductionValue);
            System.out.printf("%d%s mod %d = %d - %d.\n", b, toSuperscript(e), m, multiplication, reductionValue);
            System.out.printf("                = %d.\n\n", multiplication - reductionValue);
        }

        // Simpan di memo
        memo.put(e, combined);
        return combined;
    }

    // Helper method untuk mengubah integer ke string superscript
    public static String toSuperscript(int number) {
        String s = Integer.toString(number);
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            switch(c) {
                case '0': sb.append('\u2070'); break;
                case '1': sb.append('\u00B9'); break;
                case '2': sb.append('\u00B2'); break;
                case '3': sb.append('\u00B3'); break;
                case '4': sb.append('\u2074'); break;
                case '5': sb.append('\u2075'); break;
                case '6': sb.append('\u2076'); break;
                case '7': sb.append('\u2077'); break;
                case '8': sb.append('\u2078'); break;
                case '9': sb.append('\u2079'); break;
                default: sb.append(c); break;
            }
        }
        return sb.toString();
}
}