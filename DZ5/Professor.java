import java.util.Scanner;

public class Professor extends People {

    public Professor(String Name, int year) {
        super(Name, year);
    }

    public void setMark(Student student, int point) {
        Mark mark = new Mark(point);
        student.setAverageMark(mark);
    }
}