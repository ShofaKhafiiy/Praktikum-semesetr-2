package com.rekursif;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner Input = new Scanner(System.in);
        System.out.print("Masukan nilai: ");
        int Nilai = Input.nextInt();
        System.out.println("Anda Memasukan nilai: " + Nilai);
        DisplayNilai(Nilai);
        int Jumlah = JumlahNilai(Nilai);
        System.out.println("Hasil rekursif = " + Jumlah);
        int Faktorial = Faktorial(Nilai);
        System.out.println("Hasil Faktorial = " + Faktorial);
    }

    private static int Faktorial (int Parameter){
        if (Parameter == 0){
            return 1; // Menggunakan return 1 karena jika menggunakan return 0 akan mengembalikan angka 0
        }
        return Parameter * Faktorial(Parameter - 1);
    }

    private static int JumlahNilai (int Parameter){

        if (Parameter == 0){
            return 0; // Menggunakan return 0 karena jika menggunakan return 1 maka hasil rekursif berbeda
        }
        return Parameter + JumlahNilai(Parameter - 1);
    }

    private static void DisplayNilai (int Parameter){
        System.out.println("Nilai = " + Parameter);
        if (Parameter == 0){
            return;
        }


        DisplayNilai(Parameter - 1);
    }
}