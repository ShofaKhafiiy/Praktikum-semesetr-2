package com.tutorial;

public class Main {
    public static void main(String[] args) {


        Hero hero1 = new Hero("tanjiro", 24,100);
        HeroStrength hero2 = new HeroStrength("ali", 25,100, hero1);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
    }
}