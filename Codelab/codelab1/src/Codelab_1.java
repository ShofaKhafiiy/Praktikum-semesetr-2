import java.time.LocalDate;
import  java.util.Scanner;
import java.time.LocalDateTime;

public class Codelab_1 {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama anda: ");
        var Nama = input.nextLine();

        //input jenis kelamin
        System.out.print("Masukan jenis kelamin anda(P/L): ");
        var JenisKelamin = input.next().charAt(0);
        input.nextLine();

        //input tahun lahir(harus berupa angka)
        System.out.print("Masukan tahun lahir: ");
        int Tahun_lahir = input.nextInt();
        input.close();

        int tahunSekarang = LocalDate.now().getYear();
        int Umur = tahunSekarang - Tahun_lahir;

        //Validasi jenis kelamin berdasarkan input
        //menggunakan validasi
        var StringKelamin = "";
        if (JenisKelamin == 'L' ||JenisKelamin == 'l'){
            StringKelamin = "Laki-laki";
        } else if (JenisKelamin =='P' || JenisKelamin == 'p') {
            StringKelamin = "Perempuan";
        }
        else {
            StringKelamin = "Tidak diketahui";
        }

        //menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama         : " + Nama);
        System.out.println("Jenis Kelamin: " + StringKelamin);
        System.out.println("Umur         : " + Umur);


    }
}