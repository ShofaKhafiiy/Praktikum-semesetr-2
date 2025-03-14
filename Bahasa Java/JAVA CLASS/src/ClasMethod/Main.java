package ClasMethod;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka pertama: ");
        int Angka = input.nextInt();

        System.out.print("Masukan angka Kedua: ");
        int Angka2 = input.nextInt();

        int Hasil = OprasiHitung(Angka, Angka2);

        System.out.println("Hasil Penjumlahan "+ Angka+ " + " +Angka2+" Adalah: "+Hasil);



    }

    static int OprasiHitung (int a, int b){
      return a+b;

    }
}