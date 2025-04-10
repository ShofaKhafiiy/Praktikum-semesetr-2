package com.Role;

public class Villian extends Char{
    private String type = "Villian";
    public  Villian(String nama, double healthh, double attack){
        super(nama, healthh, attack);
    }


    @Override
    public void display(){
        super.display();
        System.out.println("Type: "+this.type);
    }
}
