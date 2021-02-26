// This program was created on February 25, 2021

public class StringBuilderFormatting {

    public static void main(String[] args) {

        // Inefficient
        String info = "";

        info += "My name is Hemanth.";
        info += " ";
        info += "I am a software developer.";

        System.out.println(info);

        // More efficient.
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sarah.");
        sb.append(" ");
        sb.append("I am a cloud architect.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Tyler.")
                .append(" ")
                .append("I am a security engineer");

        System.out.println(s.toString());

        ///// Formatting /////////////////

        System.out.print("Here is some sample text.\tThis is a tab.\nThis creates a new line.");
        System.out.println(" Here is more text.");

        System.out.printf("Total cost %10d; quantity is %d\n", 1, 100);

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: %s\n", i, "Here is some text");
        }

        // Formatting floating point value
        System.out.printf("Total value: %.3f\n", 1.2345);
        System.out.printf("Total value: %.4f\n", 1.23456789);
    }
}