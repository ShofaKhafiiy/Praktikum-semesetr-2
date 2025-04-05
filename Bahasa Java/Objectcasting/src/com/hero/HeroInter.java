package com.hero;

public class HeroInter extends Hero{
    private String type = "intel";
    public HeroInter(String name, double health){
        super(name, health);
    }


    public void display(){
        System.out.println(this.getNama() +" is an "+ this.type+" HERO");
    }

    public void castMagic(){
        System.out.println(this.getNama()+ "Mengeluarkan Magicc");
    }
}
