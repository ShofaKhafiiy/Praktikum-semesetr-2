package com.hero;

public class Agility extends Hero{
    private String type = "Agility";
    public Agility(String name, double health){
        super(name, health);
    }


    public void display(){
        System.out.println(this.getNama() +" is an "+ this.type+" HERO");
    }
}
