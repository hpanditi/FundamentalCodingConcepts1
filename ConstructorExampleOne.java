// This program was created on February 22, 2021

public class ConstructorExampleOne {
    int x;

    public ConstructorExampleOne() {
        x = 10;
    }

    public static void main(String[] args) {
        ConstructorExampleOne myObject = new ConstructorExampleOne();

        System.out.print("This is the value of the object x: ");
        System.out.println(myObject.x);
    }
}
