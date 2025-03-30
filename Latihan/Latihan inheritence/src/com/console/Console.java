package com.console;

import java.util.Scanner;

public class Console {

    public static void log(String pesan){
        System.out.println(pesan);
    }

    public static String log(String pesan, Scanner inputScanner){
        System.out.println(pesan);
        return inputScanner.nextLine().trim();
    }

}
