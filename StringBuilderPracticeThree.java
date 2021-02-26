// This program was created on February 25, 2021

public class StringBuilderPracticeThree {

    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("Hey ");

        string.append("how are you? ");

        System.out.print("This is the first appendage: ");
        System.out.println(string);

        string.append("The weather is wonderful today.");

        System.out.print("This is the second appendage: ");
        System.out.println(string);
    }
}
