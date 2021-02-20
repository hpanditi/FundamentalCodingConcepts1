// This program was created on February 20, 2021
class PersonClass {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + "\n" + name);
    }

    void calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        System.out.println(yearsLeft);

    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}


public class GettersReturnValues {

    public static void main(String[] args) {
        PersonClass person1 = new PersonClass();

        person1.name = "Joe";

        person1.age = 25;

        person1.speak();

        int age = person1.getAge();

        String name = person1.getName();

        System.out.println("Name: " + "\n" + name);

        System.out.println("Age is: " + "\n" + age);
    }
}
