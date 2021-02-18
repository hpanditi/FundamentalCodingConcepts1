// This program was created on February 18, 2021

import java.util.Scanner;

public class UserInputPractice2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        String line = scanner.nextLine();

        System.out.println("You entered the following text: " +line);
    }
}
