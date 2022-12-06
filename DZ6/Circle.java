package DZ6;

public class Circle extends Shape implements General {
    int x;
    double n;

    public Circle(String crayon, int brightness, int definition, int x) {
        super(crayon, brightness, definition);
        this.x = x;
    }

    public void size() {
        n = 3.14 * x * x;
    }

    public void add(Doska a) {
        a.setn(n);
    }

    public void delete(Doska a) {
        a.deln(n);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle that = (Circle) o;

        if (x != that.x) {
            return false;
        }
        if (n != that.n) {
            return false;
        }
        if (crayon != that.crayon) {
            return false;
        }
        if (brightness != that.brightness) {
            return false;
        }
        return definition == that.definition;
    }
}