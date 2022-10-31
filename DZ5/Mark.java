import java.util.Scanner;

public class Mark {
    private int point;

    public Mark(int point) {
        if (point < 100 && point > 0) {
            this.point = point;
        } else {
            System.err.println("Неправильная оценка");
        }

    }

    public int getPoint() {
        return point;
    }
}