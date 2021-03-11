// This program was created on March 10, 2021

public class castingnumericalvalues {
    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.8f;
        float floatValue2 = (float)99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        // The following won't work as we expect it to!

        byteValue = (byte)129;
        System.out.println(byteValue);

    }

}
