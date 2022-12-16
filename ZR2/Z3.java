package ZR2;

import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        int[] o = new int[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            s[i] = x;
        }
        int k = scanner.nextInt();
        int c = 0;
        for (int i = k; i < n; i++) {
            o[c] = s[i];
            c += 1;
        }
        for (int i = 0; i < k; i++) {
            o[c] = s[i];
            c += 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(o[i] + " ");
        }
    }
}
