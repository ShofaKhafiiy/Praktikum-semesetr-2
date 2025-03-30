package com.tutorial;

import  com.console.Console;

public class Hero {

     final String nama;
    double attackPower,health;


  Hero(String inputName, double inputAttack, double inputHealth){

      this.nama = inputName;
      this.attackPower = inputAttack;
      this.health = inputHealth;
  }


  void attack(Hero enemy){
      Console.log("\n"+this.nama + " Attacking: "+ enemy.nama+" With: "+this.attackPower+" damage");
      enemy.takeDamage(this.attackPower);
  }

  void takeDamage (double damage){
      this.health -= damage;
      System.out.println(this.nama+" recive damage: "+ damage);
      System.out.println("Health now: "+this.health);
  }

  void display (){
      Console.log("\nNama: "+this.nama);
      System.out.println("Health: "+this.health);
      System.out.println("Power: "+this.attackPower);
  }


}
