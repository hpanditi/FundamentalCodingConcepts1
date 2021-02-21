// This program was created on February 21, 2021
// This program shows an example of how to return the sum of a method's two parameters

public class ReturnValuePractice1 {
    static int myFirstMethod(int a, int b) {
        return a + b;
    }
        static int mySecondMethod ( int c, int d){
            return c + d;
        }


    public static void main(String[] args) {
        System.out.print("The sum of a + b is: ");
        System.out.println(myFirstMethod(1, 2));
        {

            int e = mySecondMethod(3, 4);
            System.out.print("The letter d (the sum of b + c) is: ");
            System.out.println(e);
        }
    }
}