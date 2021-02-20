// This program was created on February 20, 2021

public class GettersReturnValues3 {

    private String color;

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }

    public static void main(String[] args) {
        GettersReturnValues3 v1 = new GettersReturnValues3();
        v1.setColor("Red");
        System.out.println(v1.getColor());
    }
}