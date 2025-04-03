package com.Game;

public class Enemy extends Character{
    private int damage = 30;
    public Enemy (String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void display(){
        System.out.println("\n===== Hero =====");
        System.out.println("Nama: " + getNama());
        System.out.println("Kesehatan: " + getKesehatan());

    }

    @Override
    public void serang(Character musuh){
        System.out.println("\n" + this.getNama() + " menyemprotkan racun");
        super.serang(musuh, this.damage);
    }

}
