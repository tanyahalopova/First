package DZ6;

public class Doska {
    private double n = 0;

    public void setn(double n) {
        if (this.n + n > 100) {
            System.err.println("Нет места!");
        } else {
            this.n += n;
        }
    }

    public double getn() {
        return n;
    }

    public void deln(double n) {
        this.n -= n;
    }
}
