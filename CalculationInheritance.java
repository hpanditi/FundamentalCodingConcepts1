// This program was created on February 27, 2021
// This is to serve as an example for inheritance

class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers is: " + z);

    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: " + z);
    }
}

public class CalculationInheritance extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        CalculationInheritance demo = new CalculationInheritance();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}
