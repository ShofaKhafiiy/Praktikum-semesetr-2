package com.Role;

public class Hero extends Char{
    private String type = "Hero";
   public  Hero(String nama, double healthh, double attack){
        super(nama, healthh, attack);
    }


    @Override
    public void display(){
       super.display();
        System.out.println("Type: "+this.type);
    }
}
