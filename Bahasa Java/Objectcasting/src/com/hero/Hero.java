package com.hero;

public class Hero {

    private String nama;
    private double health;

    public Hero(String nama, double health){
        this.nama = nama;
        this.health = health;
    }


    //getter

    public  double getHealth(){
        return this.health;
    }

    public String getNama(){
        return this.nama;
    }

    //setter

    public void setNama(String nama){
        this.nama = nama;
        }

    public void setHealth(double health){
        this.health = health;
    }


    //method umum
    public void display(){
        System.out.println(this.nama + " is a regular hero");
    }
}
