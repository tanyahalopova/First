package DZ6;

public class Text implements General {
    String s;
    int font;
    int fontsize;
    String color;
    int n;

    public Text(String s, int font, int fontsize, String color) {
        this.s = s;
        this.font = font;
        this.color = color;
    }

    public void size() {
        n = fontsize * s.length();
    }

    public void add(Doska a) {
        a.setn(n);
    }

    public void delete(Doska a) {
        a.deln(n);
    }
}
