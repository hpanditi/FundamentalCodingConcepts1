// This program was created on February 25, 2021

public class StringBuilderFormattingPracticeTwo {

    public static void main(String[] args) {

        StringBuilder stringone = new StringBuilder("Greetings ");

        stringone.append("Citizens ");

        System.out.print("Here is the first append: ");
        System.out.println(stringone);

        stringone.append("of planet Earth");

        System.out.print("Here is the second appendage: ");
        System.out.println(stringone);
    }
}
