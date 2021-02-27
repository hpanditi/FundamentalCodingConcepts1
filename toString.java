// This program was created on February 26, 2021

class Dog {

    private int id;
    private String name;

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();

    }
}

public class toString {

    public static void main(String[] args) {

        Dog dog1 = new Dog(15, "Snowball");
        Dog dog2 = new Dog(1, "Rex");

        System.out.println(dog1);
        System.out.println(dog2);

    }
}
