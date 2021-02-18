public class IfPractice1 {
    public static void main(String[] args) {
        int loop = 1;

        while(true) {
            System.out.println("Looping: " + loop);

            if(loop == 5) {
                break;
            }

            loop++;

            System.out.println("Running");
        }
    }
}
