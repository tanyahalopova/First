import java.util.Scanner;

public class Student extends People {
    int averageMark = 0;

    public Student(String Name, int year) {
        super(Name, year);
    }

    public void setAverageMark(Mark mark) {
        averageMark = mark.getPoint();

    }

    public int getAverageMark() {
        return averageMark;
    }
}