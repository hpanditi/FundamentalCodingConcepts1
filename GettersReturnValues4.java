// This program was created on February 20, 2021

public class GettersReturnValues4 {

    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String c) {
        this.name = c;
    }

    public static void main(String[] args) {
        GettersReturnValues4 v1 = new GettersReturnValues4();
        v1.setName("Harry");
        System.out.println(v1.getName());
    }
}
