package DZ6;

public class DZ {
    public static void main(String[] args) {
        Text t = new Text("DEERDFFG", 1, 1, "Red");
        Circle c = new Circle("Rhndn", 2, 1, 4);
        Doska a = new Doska();
        t.add(a);
        c.add(a);
    }
}
