package ZR2;

public class Z1 {

    static boolean d(int x) {
        int col = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                col += i;
            }
        }
        if (col == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5000; i++) {
            if (d(i)) {
                System.out.println(i);
            }
        }
    }
}
