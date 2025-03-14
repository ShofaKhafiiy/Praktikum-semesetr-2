package com.LatihanMateri;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Farmer farmer1 = new Farmer();
      Farmer farmer2 = new Farmer();
      Plant plant1 = new Plant();
      Plant plant2 = new Plant();

      farmer1.nama = "Supa";
      farmer2.nama = "pupa";

      plant1.nama = "Jamur kletong";
      plant2.nama = "Kecubung";

      farmer1.favorit = plant1.nama;
      farmer2.favorit = plant2.nama;

        System.out.println("Hello, World");
        System.out.println("Current date and time: "+ new Date());

        farmer1.talk();
        farmer2.talk();
    }
}