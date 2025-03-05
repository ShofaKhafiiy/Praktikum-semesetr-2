package com.Latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Program menghitung luas persegi");
        System.out.print("Masukan panjang persegi: ");
        int Panjang = UserInput.nextInt();
        System.out.print("Masukan Lebar Persegi: ");
        int Lebar = UserInput.nextInt();

        int total = Panjang * Lebar;

        System.out.println("Luas persegi panjangnya adalah: " + total);
        UserInput.close();



    }
}