// This program was created on March 28, 2021
// This program is about inner classes

public class RobotClass {

    private int id;

    private class Brain {
        public void think() {
            System.out.println("Robot " + id + "is thinking.");
        }
    }

    public RobotClass(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();
    }

}
