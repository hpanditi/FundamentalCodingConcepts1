// This program was created on February 24, 2021

class SingleStaticBlockExample {
    static int number;
    static String sampletext;

    static {
        number = 100;
        sampletext = "This is a static keyword composed in the language of Java";
    }

    public static void main(String[] args) {
        System.out.println("The value of the number is: " + number);
        System.out.println("The value of the string is: " + sampletext);
    }
}
