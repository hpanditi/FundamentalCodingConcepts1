// This program was created on February 18, 2021

public class SwitchPractice1 {
    public static void main(String[] args) {
        // char grade = args[0].charAt(0);
        char grade = 'E';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
                System.out.println("Nice job!");
                break;
            case 'C' :
                System.out.println("Well done!");
                break;
            case 'D' :
                System.out.println("You passed!");
                break;
            case 'E' :
                System.out.println("You failed! Please see the teacher");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " +grade);
    }
}
