// This program was created on February 18, 2021

import java.util.Scanner;

public class UserInputPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");

        String line = input.nextLine();

        System.out.println("You entered: " +line);
    }
}
