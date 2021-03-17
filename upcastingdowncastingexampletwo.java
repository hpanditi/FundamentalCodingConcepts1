// This program was created on March 14, 2021
// This is a program to illustrate upcasting

class Animal {

    String name;

    void nature()
    {
        System.out.println("Animal");
    }
}

class Fish extends Animal {

    String color;

    void nature()
    {
        System.out.println("Aquatic Animal");
    }
}

public class upcastingdowncastingexampletwo {
    public static void main(String[] args) {


        Animal a = new Fish();

        a.name = "GoldFish";

        Fish f = new Fish();

        f.name = "Whale";
        f.color = "Blue";

        System.out.println("Object a");
        System.out.println("Name: " + a.name);

        a.nature();

        System.out.println("Object f");
        System.out.println("Name: " + f.name);
        System.out.println("Color: " + f.color);
        f.nature();
    }
}