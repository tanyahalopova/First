import java.util.Scanner;

public class CR1Z2 {
    static Boolean pol(String y) {
        int n = y.length();
        int s = y.length() / 2;
        int i = 0;
        int col = 0;
        while (i < s) {
            if (y.charAt(i) == y.charAt(n - i)) {
                col += 1;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int col = 0;
        for (int i = 0; i < n; i++) {
            String x = scanner.nextLine();
            if (pol(x) == true) {
                col += 1;
            }
        }
        System.out.println(col);
    }
}