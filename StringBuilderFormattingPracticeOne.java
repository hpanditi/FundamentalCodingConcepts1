// This program was created on February 25, 2021

public class StringBuilderFormattingPracticeOne {

    public static void main(String[] args) {

       StringBuilder str = new StringBuilder("Hello ");

       str.append("there ");

       System.out.print("Here is the first append: ");
       System.out.println(str);

       str.append("Billy");

       System.out.print("Here is the second append: ");
       System.out.println(str);

    }
}
