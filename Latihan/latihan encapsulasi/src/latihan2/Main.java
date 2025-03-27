package latihan2;

//latihan oop menggunakan getter setter
//program game simpel

public class Main {


    public static void main(String[] args) {
        Character player1 = new Character("Niam");
        Armor armor1 = new Armor("Baju Besi", 50,100 );
        Weapon weapon1 = new Weapon ("Pedang", 100);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);


        Character player2 = new Character("Riza");
        Armor armor2 = new Armor("Zirah Besi", 80, 120);
        Weapon weapon2 = new Weapon("Kapak", 110);

        player2.setArmor(armor2);
        player2.setWeapon(weapon2);


        player1.Display();
        player2.Display();

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player1.attack(player2);











    }


}

//Membuaat claas player

class Character{

    private String nama;
    private int baseHealth;
    private int baseAttack;
    private int levelCharacter;
    private int incrementHealth;
    private int incrementAttck;
    private int totalDamage;
    private boolean isAlive;


    private Armor armor;
    private Weapon weapon;


    public Character(String nama){
        this.nama = nama;
        this.baseHealth = 100;
        this.levelCharacter = 1;
        this.incrementHealth = 15;
        this.incrementAttck = 20;
        this.baseAttack = 100;
        this.isAlive = true;
    }


    public String getNama(){
        return this.nama;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void Display(){
        System.out.println("====================================");
        System.out.println("        STATUS PLAYER");
        System.out.println("====================================");
        System.out.println("Player: "+this.nama);
        System.out.println("Level: " + this.levelCharacter);
        System.out.println("Base Health: "+ this.baseHealth);
        System.out.println("Base Attack: "+this.baseAttack);
        System.out.println("Max Attack: "+this.MaxAttack());
        System.out.println("Max Health: "+this.getHealth()+ "/"+this.maxHealth());
        armor.InfoArmor();
        weapon.displayInfo();
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    private void levelUp(){
        this.levelCharacter++;
    }

    public void attack(Character opponent){
        //menghitung damage

        int damage = this.MaxAttack();

        //print event
        System.out.println("Player: "+this.nama+" is attacking: "+opponent.getNama()+" with "+damage+ " power");
        //attack opponent

        opponent.defence(damage);
        this.levelUp();


    }
    public void defence(int damage){

        int defencePower= this.armor.GetDefencePower();
        int deltaDamage;

        System.out.println(this.nama + " defence power = "+ defencePower);

        if (damage >defencePower){
            deltaDamage = damage-defencePower;
        }
        else {
            deltaDamage = 0;
        }

        System.out.println("Damage earned: " + deltaDamage+"\n");
        this.totalDamage = this.totalDamage + deltaDamage;


        //check isAlive
        if (this.getHealth() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }


        this.Display();
    }

    public int maxHealth(){
        if (this.armor!= null){
            return this.baseHealth+this.levelCharacter*incrementHealth+this.armor.BonusHealth();
        }
        return this.baseHealth+this.levelCharacter*incrementHealth;
    }
    private int MaxAttack(){
        if (this.weapon != null){
            return this.baseAttack+this.levelCharacter*this.incrementAttck+this.weapon.getWeapon();
        }
        return this.baseAttack+this.levelCharacter*this.incrementAttck;
    }


}

class Armor{

    private String nama;
    private int DefArmor;
    private int BonusHealth;

    public Armor(String nama, int ketahanan, int health){

        this.nama = nama;
        this.DefArmor = ketahanan;
        this.BonusHealth = health;
    }

    public void InfoArmor(){
        System.out.println("\n***** ARMOR INFO *****");
        System.out.println("Nama Armor: "+this.nama);
        System.out.println("Defend Armor: "+this.DefArmor);
        System.out.println("Bonus Health: "+this.BonusHealth);
        System.out.println("----------------------");
    }

    public int BonusHealth(){
        return this.DefArmor *5 + this.BonusHealth;
    }

    public int GetDefencePower(){
        return this.DefArmor*2;
    }

    public void SetNamaArmor(String nama){

        this.nama = nama;

    }


}
class Weapon{

    private String nama;
    private int AttckPower;

    public Weapon(String nama, int attack){
        this.nama = nama;
        this.AttckPower=attack;
    }

    public int getWeapon(){
        return this.AttckPower;
    }


    public void displayInfo() {
        System.out.println("***** WEAPON INFO *****");
        System.out.println("Nama Weapon : " + this.nama);
        System.out.println("Attack Power: " + this.AttckPower);
        System.out.println("-----------------------");
    }


}