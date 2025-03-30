package com.Console;


import java.util.Scanner;

public class Console {


    public static void log(String pesan){
        System.out.println(pesan);
    }


    public static String log(String pesan, Scanner inputScanner){
        System.out.print( pesan);
        return inputScanner.nextLine().trim();
    }

    public static char log(String pesan, Scanner inputScanner, boolean isChar){
        System.out.print(pesan);
        return inputScanner.next().trim().toUpperCase().charAt(0);
    }

}

