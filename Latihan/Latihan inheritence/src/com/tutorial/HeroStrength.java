package com.tutorial;

public class HeroStrength extends Hero{

    private String type = "Strength";
     double armor;

    //construktornya

    HeroStrength(String nameINput, double attackInput, double healthInput, Hero refrence){
        super(nameINput,attackInput,healthInput);
        this.armor = 10000;

    }

    @Override
    void display (){
        super.display();
        System.out.println("Class hero: "+type);
        System.out.println("Armor: "+this.armor);

    }

    @Override
    void takeDamage (double damage){
        double efectiveDamage = Math.max(damage - this.armor,0);
        this.health = Math.max(this.health - efectiveDamage,0);
        System.out.println(this.nama+" recive damage: "+ damage);
        System.out.println("Ali use armor: "+this.armor);
        System.out.println("Total recive damage: "+ efectiveDamage);
        System.out.println("Health now: "+this.health);
    }




}
