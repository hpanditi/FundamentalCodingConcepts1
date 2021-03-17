// This program was created on March 16, 2021
import java.util.ArrayList;
import java.util.HashMap;

public class generics {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);

        System.out.println(fruit);

        // Modern style

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);

        // There can be more than one type argument

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Java 7 style

        ArrayList<Animal> someList = new ArrayList<>();

    }

}
