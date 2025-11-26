import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int radius;
        float area;

        radius = Input.readData();    //call by name
        area = Compute.area(radius);    //call by value
        Output.display(radius,area);    //call by value
    }
}