// This program was created on February 21, 2021

public class ReturnValuePractice {
    static int myFirstMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.print("The result of the sum is: ");
        System.out.println(myFirstMethod(10));
    }
}
