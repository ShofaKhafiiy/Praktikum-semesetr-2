package com.forEach;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int []ArrayAngka={11,12,13,14,15,16,17,18,19,20};

        //Loop array sederhana
        for (int i = 0;i < ArrayAngka.length;i++){
            System.out.println("angka ke-"+i+" adalah: " +ArrayAngka[i]);
        }
        //loop array menggunakan foreach jauh lebih sederhana

        for (int angka:ArrayAngka){
            System.out.println(angka);
        }


    }
}