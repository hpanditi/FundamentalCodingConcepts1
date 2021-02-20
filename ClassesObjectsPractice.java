// This program was created on February 19, 2021

class Person {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("My name is " + name + " and I am " + age + " years old");
        }
    }

    void sayHello() {
        System.out.println("Hello there.");
    }
}

public class ClassesObjectsPractice {

    public static void main(String[] args) {
        System.out.println("Hello World.");

        Person person1 = new Person();
        person1.name = "Harry Paul";
        person1.age = 27;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Sandra Smith";
        person2.age = 25;
        person2.speak();
        person2.sayHello();

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
