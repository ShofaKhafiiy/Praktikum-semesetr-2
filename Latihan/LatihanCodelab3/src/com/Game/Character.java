package com.Game;

public class Character {
    private String nama;
    private int kesehatan;

    public Character(String nama, int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    public void display(){
        System.out.println("Status awal: ");
        System.out.println("\nKarakter: "+this.nama);
        System.out.println("Nyawa: "+this.kesehatan);
    }

    public String getNama(){
        return this.nama;
    }

    public int getKesehatan(){
        return this.kesehatan;
    }

    public void setKesehatan(int kesehatan){
        this.kesehatan = Math.max(kesehatan,0);
    }

    public void serang(Character musuh){
        System.out.println(this.nama + " menyerang " + musuh.getNama() + " !");
    }

    public void serang(Character musuh, int damage){
        System.out.println(this.nama + " menyerang " + musuh.getNama() + " dengan " + damage + " damage!");
        musuh.terimaSerangan(damage);
    }

    public void terimaSerangan(int damage){
        this.kesehatan = Math.max(this.kesehatan-damage, 0);
        System.out.println(this.nama + " menerima "+ damage+ " damage!");
        System.out.println("kesehatan sekarang: "+ this.kesehatan);
    }


}
