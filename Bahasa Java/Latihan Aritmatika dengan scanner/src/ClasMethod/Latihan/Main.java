package ClasMethod.Latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int Panjang, Lebar, total;

        System.out.println("Program menghitung luas persegi");
        System.out.print("Masukan panjang persegi: ");
         Panjang = UserInput.nextInt();
        System.out.print("Masukan Lebar Persegi: ");
         Lebar = UserInput.nextInt();
         total = Panjang * Lebar;

        System.out.println("Luas persegi panjangnya adalah: " + total);
        UserInput.close();



    }
}