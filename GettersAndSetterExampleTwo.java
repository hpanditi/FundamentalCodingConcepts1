// This program was created on February 22, 2021

public class GettersAndSetterExampleTwo {

    String name;
    int age;

    public static void main(String[] args) {

        GettersAndSetterExampleTwo a = new GettersAndSetterExampleTwo();

        a.sayHappyBirthday("Hemanth");

        a.setAge(35);

        a.setName("Billy");

        System.out.println(a.getName());
        System.out.println(a.getAge());

        a.printDetails();

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge () {
        return this.age;
    }

    public void printDetails() {
        System.out.println(getName() + ", " + getAge());
    }

    public static void sayHappyBirthday(String name) {
        System.out.println("Happy birthday " + name);
    }
}
