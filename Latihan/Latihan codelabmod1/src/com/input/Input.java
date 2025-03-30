package com.input;

import  com.Console.Console;
import java.util.Scanner;

public class Input {
    private static final Scanner input = new Scanner(System.in);


    private Input(){

    }

    private static String ambilNama(){

        return Console.log("Masukan Nama: ", input);
    }

    public static String getNama(){
        return ambilNama();
    }

    private static int inputTahunLahir(){

        return Integer.parseInt(Console.log("Masukan Tahun Lahir: ", input));
    }

    public static int ambilTahunLahir(){
        return inputTahunLahir();
    }

    private static char inputKelamin(){
        return Console.log("Masukkan Jenis kelamin (P/L): ", input, true );
    }

    public static char getKelamin(){
        return inputKelamin();
    }

    public static void closeScanner(){
        input.close();
    }


}
