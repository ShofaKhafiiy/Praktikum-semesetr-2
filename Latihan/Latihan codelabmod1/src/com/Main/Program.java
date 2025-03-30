package com.Main;


import java.time.LocalDateTime;
import com.Console.Console;

import com.input.Input;

 class Program {

    private final String nama;
    private final int tahunLahir;
    private final char Kelamin;

    public Program(){
        this.nama = Input.getNama();
        this.tahunLahir = Input.ambilTahunLahir();
        this.Kelamin = Input.getKelamin();
    }

    public  void tampilkanData(){
        System.out.println("\n");
        Console.log("=======Data Anda=======");
        Console.log("Nama Anda: " +this.nama);
        Console.log("Umur anda: "+ HitungUmur.hitung(tahunLahir));
        Console.log("Jenis Kelamin anda: "+InputGender.pickGender(Kelamin));
    }
}

 class HitungUmur{

    public static int hitung(int tahunLahir){
        int tahunSekarang = LocalDateTime.now().getYear();
        return tahunSekarang-tahunLahir;
    }
}

class InputGender{
     public static String pickGender(char Gender){
         if (Gender == 'l' || Gender == 'L'){
             return "Laki-Laki";
         }

         else if(Gender == 'p' || Gender == 'P'){
             return "Perempuan";
         }
         else {
             return "tidak diketahui";
         }
     }
}

