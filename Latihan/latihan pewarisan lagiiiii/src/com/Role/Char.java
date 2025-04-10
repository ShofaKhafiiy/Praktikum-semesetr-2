package com.Role;

public class Char {


    //atributenya
    private String name;
    private double health, attackPower;

    //construktornyaa
    public Char(String name, double health, double attackPower){
        this.name = name;
        this.attackPower= attackPower;
        this.health = health;
    }
    //Method attacknyaa

    public void attack(Char enemy){
        System.out.println("\n"+this.name + " Attack "+enemy.name);

        enemy.takeDamage(this.attackPower);
    }

    public void takeDamage( double damage){
        System.out.println(this.name +" recive damage " + damage);

        this.health -= damage;

    }

    public void display(){
        System.out.println("\nNama: "+this.name);
        System.out.println("health: "+ this.health);
        System.out.println("Power: "+this.attackPower);
    }


    //getter setter untuk memanipulasi private

    public String getName(){
        return this.name;
    }

    public double getHealth(){
return this.health;
    }

    public  double getAttackPower(){
        return  this.attackPower;
    }


}
