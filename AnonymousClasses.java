// This program was created on March 16, 2021
class MachineOne {
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface PlantOne {
    public void grow();
}

public class AnonymousClasses {

    public static void main(String[] args) {

        MachineOne machine1 = new MachineOne() {
            @Override public void start() {
                System.out.println("Camera snapping...");
            }

        };
        machine1.start();

        PlantOne plant1 = new PlantOne() {

            @Override
            public void grow() {
                System.out.println("Plant growing...");
            }

        };

        plant1.grow();

    }
}
