// This program was created on February 23, 2021

public class ConstructorExampleThree {

    String nameofwebsite;
    // Here is the constructor
    ConstructorExampleThree(){
        this.nameofwebsite = "www.deetscodingcafe.com";
    }

    public static void main(String[] args) {
        ConstructorExampleThree myfirstobject = new ConstructorExampleThree();
        System.out.println(myfirstobject.nameofwebsite);
    }
}
