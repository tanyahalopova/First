import java.util.Scanner;

public class CR1Z1 {
    static int divide(int x, int y) {
        int col = 0;
        while (x - y >= y) {
            x -= y;
            col += 1;
        }
        return col + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(divide(scanner.nextInt(), scanner.nextInt()));
    }
}