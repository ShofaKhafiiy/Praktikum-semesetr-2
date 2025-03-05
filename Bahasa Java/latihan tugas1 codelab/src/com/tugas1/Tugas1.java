package com.tugas1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner InputPengguna = new Scanner(System.in);
        int pilih;
        long PassMaha;
        String UsernameAdmin,PassAdmin,UserMaha;
        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukan pilihan: ");
        pilih = InputPengguna.nextInt();
        InputPengguna.nextLine();

        if (pilih != 1 && pilih !=2) {
         
            System.out.println("Pilihan tidak valid!");
            InputPengguna.close();
            return;
        
        }

        if (pilih == 1) {
            System.out.print("Masukan Username: ");
            UsernameAdmin = InputPengguna.nextLine();
            System.out.print("Masukan Password: ");
            PassAdmin = InputPengguna.nextLine();

            if (UsernameAdmin.startsWith("Admin276")&& PassAdmin.startsWith("Password276")) {
                System.out.println("Login berhasil");
                InputPengguna.close();
                return;
            }
            else{
                System.out.println("Username atau kata sandi salah!");
                InputPengguna.close();
                return;
            }
        
        }
        else if (pilih == 2) {
            System.out.print("Masukan nama: ");
            UserMaha = InputPengguna.nextLine();
            System.out.print("Masukan Nim: ");
            PassMaha = InputPengguna.nextLong();

            long validPass = 202410370110276L;
            if (UserMaha.startsWith("Shofa Khafidin") && PassMaha == validPass) {
                System.out.println("Login mahasiswa berhasil");
                System.out.println("Selamat datang :)");
                System.out.println("Nama: " + UserMaha);
                System.out.println("NIM: " + PassMaha);
            }
            else{
                System.out.println("Login gagal!. username atau NIM salah!");
                InputPengguna.close();
                return;
            }
        }

        InputPengguna.close();

    }
    
}
