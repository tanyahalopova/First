import java.util.Scanner;

public class Triangle implements shape {
    int x;
    int y;

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void square() {
        System.out.println(0.5 * x * y);
    }
}
