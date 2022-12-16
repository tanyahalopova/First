import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        film a = new film("Harry Potter", 2001, "Daniel Radcliffe");
        a.getname();
        System.out.println(a.getyear());
        a.setyear(2025);
        System.out.println(a.getyear());
        favoritfilm b = new favoritfilm("Harry Potter", 2001, "Daniel Radcliffe");
        b.getname();
        System.out.println(b.getyear());
        b.getnambeofvies();
        b.setnambeofvies(4);
        b.getnambeofvies();
    }
}

class film {
    String name;
    private int year = 0;
    String actor;

    public film(String name, int year, String actor) {
        this.name = name;
        setyear(year);
        this.actor = actor;
    }

    public void getname() {
        System.out.println(name);
    }

    public int getyear() {
        return this.year;
    }

    public void setyear(int year) {
        if (0 < year && year < 2022) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }
}

class favoritfilm extends film {
    int nambeofvies;

    public favoritfilm(String name, int year, String actor) {
        this(name, year, actor, 3);
    }

    public favoritfilm(String name, int year, String actor, int nambeofvies) {
        super(name, year, actor);
        setnambeofvies(nambeofvies);
    }

    public void setnambeofvies(int nambeofvies) {
        if (3 <= nambeofvies && nambeofvies <= 100) {
            this.nambeofvies = nambeofvies;
        }
    }

    public void getnambeofvies() {
        System.out.println(nambeofvies);
    }
}