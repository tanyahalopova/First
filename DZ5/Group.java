import java.util.Scanner;

public class Group {
    Professor professor;
    Student student;

    public Group(Professor professor, Student Student) {
        this.professor = professor;
        this.student = Student;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "professor=" + professor +
                ", student=" + student +
                '}';
    }
}
