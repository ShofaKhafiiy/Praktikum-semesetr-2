package com.NestedRekursif;

import java.util.Scanner;


public class Nested {
    public static void main(String[] args) {
        // Ambil input dari user
        int n = getUserInput();

        // Cetak deret Fibonacci menggunakan rekursi bersarang
        System.out.println("Deret Fibonacci:");
        printFibonacci(n, 0);
    }

    // Fungsi untuk mengambil input dari pengguna
    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan Fibonacci: ");
        return input.nextInt();
    }

    // Fungsi untuk mencetak deret Fibonacci menggunakan rekursi bersarang
    public static void printFibonacci(int n, int i) {
        if (i < n) {
            System.out.print(fibonacci(i) + " ");
            printFibonacci(n, i + 1);  // Rekursi untuk mencetak angka berikutnya
        }
    }

    // Fungsi rekursif untuk menghitung nilai Fibonacci ke-n
    public static int fibonacci(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);  // Rekursi bersarang
    }
}
