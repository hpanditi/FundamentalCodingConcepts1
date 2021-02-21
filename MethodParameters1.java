// This program was created on February 21, 2021



public class MethodParameters1 {
    public static void main(String[] args) {
        sayHello();
        sayHemanth();
        saySomething("I am learning how to code");
        saySomething("Java is an amazing language");
        printInformation("Bob", 25);
        printInformation("Jack", 20);
        System.out.println(add(5, 10));

    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHemanth () {
        System.out.println("My name is Hemanth");
    }

    public static void saySomething(String s) {
        System.out.println(s);
    }

    public static void printInformation(String name, int age) {
        System.out.println(name + " is " + age + " years old");
    }

    public static int add(int x, int y) {

        System.out.print("The sum of x and y is: ");
        return x + y;
    }
}
