// This program was created on February 19, 2021

class Person {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)

}

public class ClassesObjectsPractice {

    public static void main(String[] args) {
        System.out.println("Hello World.");

        Person person1 = new Person();
        person1.name = "Harry Paul";
        person1.age = 27;

        Person person2 = new Person();
        person2.name = "Sandra Smith";
        person2.age = 25;

        System.out.print("The first person's name is : ");
        System.out.println(person1.name);

        System.out.print("The first person's age is: ");
        System.out.println(person1.age);

        System.out.print("The second person's name is: ");
        System.out.println(person2.name);

        System.out.print("The second person's age is: ");
        System.out.println(person2.age);

    }
}
