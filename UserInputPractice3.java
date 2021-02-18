import java.util.Scanner;

public class UserInputPractice3 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = myObject.nextLine();

        System.out.println("Name: " + name);

        System.out.println("Enter your age: ");

        int age = myObject.nextInt();

        System.out.println("Age: " +  age);

        System.out.println("Enter your income: ");

        double income = myObject.nextDouble();

        System.out.print("Income: " + income);
    }
}
