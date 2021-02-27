// This program was created on February 26, 2021
// This is an example of a toString() method

class Student {
    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }


    public String toString()

    {//overriding the toString() method
        return rollno+""+name+""+city;
    }

    public static void main(String[] args) {
        Student student1 = new Student(101, " Raj ", "Lucknow");
        Student student2 = new Student(102, " Vijay ", "Hyderabad");

        System.out.println(student1);
        System.out.println(student2);
    }
}
