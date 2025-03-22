package latihanclass;


//membuat class player
class Player{
    String name;
    double health;
    int level;
    //object member
    Senjata senjata;
    Armor armor;


    Player(String Nama, double Nyawa){
        this.name=Nama;
        this.health = Nyawa;
    }

    void Menyerang(Player Musuh){
        double kuatSerangan = this.senjata.attackPower;
        System.out.println("\n"+this.name + " Menyerang "+Musuh.name +" dengan kerusakan: "+ kuatSerangan);
        Musuh.Bertahan(kuatSerangan);
    }

    void Bertahan(Double AttckPower){
        System.out.println(this.name + " menerima serangan sebanyak: " +AttckPower);


        //akan mengambil damage
    }

    void equipWeapon (Senjata senjata){
        this.senjata = senjata;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void AllDisplay(){
        System.out.println("\nNama: " + this.name);
        System.out.println("Health: "+this.health +"HP");
        this.senjata.Display();
        this.armor.Display();
    }

}

//membuat  class senjata

class Senjata{
    double attackPower;
    String namaSenjata;

    Senjata(String Nama,double AttackPower){
        this.attackPower = AttackPower;
        this.namaSenjata = Nama;
    }
    void Display(){
        System.out.println("Senjata: " + this.namaSenjata + " Kekuatan Serangan: "+ this.attackPower);
    }
}

//membuat class armor

class Armor {
    double defencePower;
    String NamaArmor;

    Armor(String Armor,double DefencePower){
        this.defencePower = DefencePower;
        this.NamaArmor = Armor;
    }

    void Display(){
        System.out.println("Senjata: " + this.NamaArmor + " Kekuatan pertahanan: "+this.defencePower);
    }
}



public class Main {
    public static void main(String[] args) {
        //Membuat object player
        Player pemain1 = new Player("Shofa", 100);
        Player pemain2 = new  Player ("Goku", 1000);

        //Membuat object Senjata
        Senjata pedang = new Senjata("Pedang",30);
        Senjata GodHand = new Senjata("GodHand", 1000000);

        //Membuat object Armor
        Armor ZirahBesi = new Armor ("Zirah Besi",100);
        Armor GodBody = new Armor ("GodBody", 5000);

        //pemain1
        pemain1.equipWeapon(pedang);
        pemain1.equipArmor(ZirahBesi);
        pemain1.AllDisplay();

        //pemain2
        pemain2.equipWeapon(GodHand);
        pemain2.equipArmor(GodBody);
        pemain2.AllDisplay();


        //pertempuran
        pemain1.Menyerang(pemain2);

    }
}