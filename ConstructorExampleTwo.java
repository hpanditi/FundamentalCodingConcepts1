// This program was created on February 22, 2021

class MyFirstClass {
    int x;

    MyFirstClass(int integer) {
        x = integer;
    }
}

public class ConstructorExampleTwo {
    public static void main(String[] args) {
        MyFirstClass number1 = new MyFirstClass( 15 );
        MyFirstClass number2 = new MyFirstClass( 25);
        MyFirstClass number3 = new MyFirstClass( 35);

        System.out.print("My first number is: ");
        System.out.println(number1.x);

        System.out.print("My second number is: ");
        System.out.println(number2.x);

        System.out.print("My third number is: ");
        System.out.println(number3.x);
    }
}
