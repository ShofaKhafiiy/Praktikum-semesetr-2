package com.main;

import com.Game.Character;
import com.Game.Enemy;
import com.Game.Hero;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //membuat objek karakter, hero, dan musuh
        Character npc = new Character("Karakter Umum", 100);
        Character hero = new Hero("Brimstone", 150);
        Character musuh = new Enemy("Viper", 200);


        //menampilkan display status awal
        hero.display();
        musuh.display();

        //hero menyerang musuh
        hero.serang(musuh);

        //musuh menyerang balik.
        musuh.serang(hero);

    }
}