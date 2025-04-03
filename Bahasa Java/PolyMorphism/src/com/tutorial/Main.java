package com.tutorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Saupa");
        HeroStrength hero2 = new HeroStrength("Sapau");
        hero1.display();
        hero2.display();

        //polymorphic
        Hero hero3 = new HeroAgility("Wawa");
        hero3.display();

        Hero hero4 = new HeroIntel("Mahmud");
        hero4.display();


        //bisa membuat arraylist

        Hero [] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;

        kumpulanHero[0].display();
        kumpulanHero[1].display();


    }

}