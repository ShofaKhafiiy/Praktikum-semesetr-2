package com.function;

import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Panjang: ");
        int Panjang = input.nextInt();
        System.out.print("Masukan Lebar: ");
        int Lebar = input.nextInt();

        Gambar(Panjang,Lebar);

    }

    public static void Gambar(int Panjang, int Lebar){
        int i,j;
        for (i = 0; i < Lebar ; i++){
            for (j = 0; j < Panjang ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}