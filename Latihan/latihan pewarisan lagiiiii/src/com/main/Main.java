package com.main;


import com.Role.Char;
import com.Role.Hero;
import com.Role.Villian;

public class Main {
    public static void main(String[] args) {
        Char npc = new Char("Penduduk", 10,30);
        Hero her = new Hero("Superman", 500, 100);
        Villian vill = new Villian("Joker", 200, 250);
        npc.display();
        her.display();
        vill.display();
        her.attack(vill);
        vill.display();
    }
}