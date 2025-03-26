package com.latihan;


class Player{

    private String nama;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Player(String nama){
        this.nama = nama;
        this.baseHealth = 100;
        this.baseAttack = 90;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 15;
    }

    public void Display(){
        System.out.println("Player: "+ this.nama);
        System.out.println("Level: "+this.level);
        System.out.println("MaxHealth: " + this.maxHealth());
        System.out.println("MaxAttack: " + this.getAttack());
    }

    public void levelUp(){
        this.level++;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public int maxHealth(){
        return this.baseHealth+this.level*this.incrementHealth + this.armor.getTambahNyawa();
    }

    public int getAttack(){
        return this.baseAttack+this.level*this.incrementAttack+this.weapon.getAttackPower();
    }
}

class Weapon{
    private String name;
    private int attck;


    public Weapon(String name,int attck){
        this.name = name;
        this.attck = attck;
    }

    public int getAttackPower(){
        return this.attck;
    }
}

class Armor{
    private String nama;
    private int armors;
    private int addHealth;


    public Armor(String nama, int power, int health){
        this.nama = nama;
        this.armors = power;
        this.addHealth = health;

    }

    public int getTambahNyawa(){
        return this.armors*10+this.addHealth;
    }


}


public class Main {
    public static void main(String[] args) {



        Player player1 = new Player("Shofa");
        Armor armor1 = new Armor("Baju besi", 5,100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);
        player1.Display();
        player1.levelUp();
        player1.Display();

    }
}