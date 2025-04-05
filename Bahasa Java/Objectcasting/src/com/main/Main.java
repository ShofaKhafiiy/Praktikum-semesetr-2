package com.main;

import com.hero.Hero;
import com.hero.HeroInter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Object dengan kelas HeroIntel

        HeroInter hero1 = new HeroInter("ucup", 100);


        hero1.display();

        //mengUpCasting

        Hero heroUp = (Hero) hero1;

        heroUp.display();

        Hero heroreg = new Hero("Supa", 250);
        heroreg.display();

        //downCasting
        //tidak bisa mengdownCasting parrent.
        //tidak bisa downCasting dari superclass ke downclass

        //upcasting ke downcasting
        //bisa downcasting dengan syarat bentuk awalnya kita sudah upcastignbya <=>
        HeroInter hero2 = (HeroInter) heroUp;

        hero2.castMagic();

    }
}