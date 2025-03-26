package GetterSetter;


class Data{
    public int intPublic;
    private int intPrivate;
    private double DoublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 10;
    }

    void Display(){
        System.out.println("\n"+this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.DoublePrivate);

    }

    //Getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //Setter

    public void setDoublePrivate(double value){
        this.DoublePrivate = value;
    }

}

class lingkaran{
    private double diameter;

    lingkaran(double diameter){
        this.diameter = diameter;
    }

    public void Display(){
        System.out.println("Diameter lingkaran: "+this.diameter);
    }


    //setternya
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    //getternya

    public double getjari2(){
        return this.diameter/2;
    }
}


public class Main {
    public static void main(String[] args) {

        Data object = new Data();

        //Untuk yang tipe public

        //read write menggunakan public
        object.intPublic = 100;// write dimana kita menulis ulang
        System.out.println(object.intPublic); // dan ini membaca hasil tulisan ulang kita

        //read only(hanya membaca) dengan menggunakan getter
        int angka = object.getIntPrivate();
        System.out.println("ini adalah Getter: "+angka);


        //write only, kita hanya bisa menulis dengan menggunakan setter

        object.setDoublePrivate(0.125);
        object.Display();

        //Gabungkan read dan write dengan setter dan getter
        lingkaran object2 = new lingkaran(5);
        System.out.println("\nJari jari: "+object2.getjari2());
        object2.setJari2(14);
        System.out.println("Jari jari baru: "+object2.getjari2());
        object2.Display();

    }
}