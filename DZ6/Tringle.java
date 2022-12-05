package DZ6;

public class Tringle extends Shape implements General {
    int h;
    int a;
    double n;

    public Tringle(String crayon, int brightness, int definition, int h, int a) {
        super(crayon, brightness, definition);
        this.a = a;
        this.h = h;
    }

    public void size() {
        n = 0.5 * h * a;
    }

    public void add(Doska a) {
        a.setn(n);
    }

    public void delete(Doska a) {
        a.deln(n);
    }
}
