// This program was created on February 24, 2021

class TwoStaticBlocksExample {
    static int numberone;
    static String samplestringone;
    static int numbertwo;
    static String samplestringtwo;

    // Here is the first static block
    static {
        System.out.println("First Static Block");
        numberone = 70;
        samplestringone = "Block One";
    }

    // Here is the second static block
    static {
        System.out.println("Second Static Block");
        numbertwo = 80;
        samplestringtwo = "Block two";
    }

    public static void main(String[] args) {
        System.out.println("This is the value of string one:  " + samplestringone);
        System.out.println("This is the value of string two: " + samplestringtwo);
        System.out.println("This is the value of number one: " + numberone);
        System.out.println("This is the value of number two: " + numbertwo);
    }
}
