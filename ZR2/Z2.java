package ZR2;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int col = 0;
        int c = 0;
        while (n > 0) {
            if (c == 0) {
                col += (n % 10);
                c = 1;
            } else {
                col -= (n % 10);
                c = 0;
            }
            n /= 10;
        }
        System.out.println(col);
    }
}
