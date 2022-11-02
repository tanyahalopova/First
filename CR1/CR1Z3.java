import java.util.Scanner;

public class CR1Z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int q = 0;
        int col = 0;
        Boolean a;
        int[] s = new int[100];
        while (i != 0) {
            i = scanner.nextInt();
            s[q] = i;
            q += 1;
        }
        for (int x = 0; x < q; x++) {
            a = true;
            for (int y = x + 1; y < q; y++) {
                if (s[x] == s[y]) {
                    s[y] = -1;
                    a = false;
                }
            }
            if (a && s[x] != -1) {
                col += s[x];
            }
        }
        System.out.println(col);
    }
}