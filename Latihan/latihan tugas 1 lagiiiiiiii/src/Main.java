

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int pilih, i , maxPercobaan;
        long nimMaha;
        long validNim = 123456789101112L;
        String userAdmin,userMaha, passAdmin;

        Scanner inputUser = new Scanner(System.in);


        while  (true){
            System.out.println("\n===Pilih login===");
            System.out.println("1. Admin.");
            System.out.println("2. Mahasiswa.");
            System.out.println("3. Keluar.");
            System.out.print("Pilih (1-3): ");

          if (inputUser.hasNextInt()){

              pilih = inputUser.nextInt();
              inputUser.nextLine();

              if (pilih>=1 &&pilih <=3){
                  break;
              }

              else {
                  System.out.println("Inputan anda tidak valid silahkan ulangi lagi\ninputan hanya angka 1-3!");
              }

          }

          else{
              System.out.println("Inputan anda harus berupa angka: ");
              inputUser.nextLine();
          }
        }

        if (pilih == 3){
            System.out.println("Terimakasih telah menggunakan program ini:)");
            inputUser.close();
            return;
        }

        maxPercobaan = 3;

        switch (pilih){
            case 1:
                for (i = 1 ; i<= maxPercobaan; i++) {

                    System.out.print("Masukan Username: ");
                    userAdmin = inputUser.nextLine();
                    System.out.print("Masukan Password: ");
                    passAdmin = inputUser.nextLine();

                    if (userAdmin.equals("Admin276") && passAdmin.equals("Admin276")) {
                        System.out.println("\n=====Login Admin Berhasil=====");
                        inputUser.close();
                        return;

                    }
                    else if (i == maxPercobaan){
                        System.out.println("kata sandi atau username salah, kesempaatan anda habis.\nSilahkan coba lagi nanti!");
                        inputUser.close();
                        return;
                    }
                    else {

                        System.out.println("Login Gagal, Kata sandi atau username salah!\ninput lagi");
                    }
                }


                break;

            case 2:

                for (i = 1 ; i<= maxPercobaan ; i++){
                    System.out.print("Masukan nama: ");
                    userMaha = inputUser.nextLine();

                    System.out.print("Masukan NIM: ");



                    if (inputUser.hasNextLong()){
                       nimMaha = inputUser.nextLong();
                       inputUser.nextLine();

                       if (userMaha.equals("Shofa Khafidin") && nimMaha == validNim){
                           System.out.println("\n=====Login Mahasiswa Berhasil=====");
                           System.out.println("Nama: "+ userMaha);
                           System.out.println("Nim: "+nimMaha);

                           inputUser.close();
                           return;
                       }

                       else{
                           System.out.println("Kata sandi atau NIM salah!\nUlangi lagi!");
                       }

                    }
                    else{
                        System.out.println("Nim harus berupa angka!\nUlangi lagi");
                    }

                    if (i == maxPercobaan) {
                        System.out.println("kata sandi atau username salah, kesempaatan anda habis.\nSilahkan coba lagi nanti!");
                        inputUser.close();
                        return;
                    }
                }


                break;
            default:

                break;
        }

    }
}