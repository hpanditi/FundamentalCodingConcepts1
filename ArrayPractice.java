// This program was created on February 18, 2021

public class ArrayPractice {
    public static void main(String[] args) {

        int value = 7;

        int[] values;

        values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i=0; i <values.length; i++) {
            System.out.println(values[i]);
        }
        }
    }

