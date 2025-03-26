package com.privatepublic;

import java.util.Scanner;

class Player{
    String nama; // default, akan bisa dibaca dan ditulis dari luar class (fleksibel)

    public int exp; // public, akan bisa dibaca dan ditulis sama seperti default (sama seperti default)

    private int nyawa;
    Player(String nama, int exp , int nyawa){
        this.nama = nama;
        this.exp = exp;
        this.nyawa = nyawa;
    }

    void Display(){
        tambahExp(); //contoh mengakses private method
        System.out.println("\nNama\t: "+this.nama);
        System.out.println("exp\t: "+this.exp);
        System.out.println("nyawa\t: "+this.nyawa);
    }

    public void GantiNama(String ubahNama){
        this.nama = ubahNama;
    }

    private void tambahExp()
    {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player pemain1 = new Player("Shofa", 20, 100);

        //default
        System.out.println("Data sebelum di ubah: " + pemain1.nama); //Membaca data
        pemain1.nama = "Khafidin"; //menulis data
        System.out.println("Data sesudah diubah: " + pemain1.nama); // membaca data

        //public
        System.out.println("Data sebelum di ubah: " + pemain1.exp); //Membaca data
        pemain1.exp = 109; //menulis data
        System.out.println("Data sesudah diubah: " + pemain1.exp); // membaca data

        //private
        //tidak bisa diakses karena nyawa berada di private
//        System.out.println("Data sebelum di ubah: " + pemain1.nyawa); //Membaca data
//        pemain1.nyawa   = 1000; //menulis data
//        System.out.println("Data sesudah diubah: " + pemain1.nyawa); // membaca data

        //method modifer
        pemain1.Display();
        pemain1.GantiNama("Shofa");
        pemain1.Display();

        //private tidak bisa di akses
        //pemain1.tambahExp();
        pemain1.Display();



    }
}