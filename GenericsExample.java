// This program was created on March 16, 2021
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericsExample {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("blue");
        strings.add("orange");
        strings.add("yellow");

        String color = strings.get(1);

        System.out.println(color);
    }

}
