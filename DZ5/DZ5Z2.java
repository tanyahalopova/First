import java.util.Scanner;

public class DZ5Z2 {
    public static void main(String[] args) {
        People a = new People("Oleg", 18);
        People b = new People("Ivan Ivanovich", 45);
        Student s = new Student("Oleg", 18);
        Professor p = new Professor("Ivan Ivanovich", 45);
        p.setMark(s, 5);
        s.getAverageMark();
        Group g = new Group(p, s);
        University u = new University(g, p);
        u.toString();
    }
}