// This program was created on March 25, 2021
class PersonOne {
    private int id;
    private String name;
    public PersonOne(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Person [id=" + id + " name=" + name + "]";
    }

}

public class EqualsMethod {
    public static void main(String[] args) {

        PersonOne person1 = new PersonOne(5, "Bob");
        PersonOne person2 = new PersonOne(5, "Sue");

        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println(value1 == value2);

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println(number1 == number2);

        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);

        System.out.println(text2);

        System.out.println(text1 == text2);
    }
}
