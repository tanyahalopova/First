import java.util.Scanner;

public class Circle implements shape {
    int x;

    public Circle(int x) {
        this.x = x;
    }

    public void square() {
        System.out.println(3.14 * x * x);
    }
}