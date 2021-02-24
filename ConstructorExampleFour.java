// This program was created on February 23, 2021

public class ConstructorExampleFour {

    String nameoffavoriterestaurant;

    ConstructorExampleFour() {
        this.nameoffavoriterestaurant = "New Bangkok Cuisine";
    }

    public static void main(String[] args) {
        ConstructorExampleFour objectone = new ConstructorExampleFour();

        System.out.print("The name of my favorite restaurant is: ");
        System.out.println(objectone.nameoffavoriterestaurant);
    }
}
