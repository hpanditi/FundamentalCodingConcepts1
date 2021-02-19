// This program was created on February 18, 2021

public class ArrayPractice3 {
    public static void main(String[] args) {
        int arr[] = methodone();

        for (int i =0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }

    public static int[] methodone()
    {
        return new int[] {1, 2, 3, 4, 5};
    }
}
