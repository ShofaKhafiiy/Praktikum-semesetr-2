package latihan2;

//latihan oop menggunakan getter setter
//program game simpel

public class Main {


    public static void main(String[] args) {
        Character player1 = new Character("Niam");
        Armor armor1 = new Armor("Baju Besi", 50,100 );
        player1.setArmor(armor1);
        player1.Display();
    }


}

//Membuaat claas player

class Character{

    private String nama;
    private int baseHealth;

    private Armor armor;


    public Character(String nama){
        this.nama = nama;
        this.baseHealth = 100;
    }
    public void Display(){
        System.out.println("\nPlayer: "+this.nama);
        System.out.println("Memakai Armor: "+this.armor.GetNamaArmor());
        System.out.println("Health: "+ this.baseHealth);
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }


}

class Armor{

    private String nama;
    private int ketahanan;
    private int addHealth;

    public Armor(String nama, int ketahanan, int health){

        this.nama = nama;
        this.ketahanan = ketahanan;
        this.addHealth = health;
    }

    public String GetNamaArmor(){
        return this.nama;
    }


}