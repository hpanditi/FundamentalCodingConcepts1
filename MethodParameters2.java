// This program was created on February 21, 2021

public class MethodParameters2 {
    public static void main(String[] args) {
        myMethodOne("Billy");
        myMethodOne("Sarah");
        myMethodOne("Taylor");
        myMethodtwo(25);
        myMethodtwo(27);
        myMethodtwo(29);
        favoriteColor("blue");
        favoriteColor("yellow");
        favoriteColor("pink");
    }

    static void myMethodOne(String firstname) {
        System.out.print("Their first name is: ");
        System.out.println(firstname);
    }

    static void myMethodtwo(int age) {
        System.out.print("Their age (respectively) is: ");
        System.out.println(age);
    }

    static void favoriteColor (String color) {
        System.out.print("Their favorite color (respectively) is: ");
        System.out.println(color);
    }
}
