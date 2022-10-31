import java.util.Scanner;

public class University {
    Group group;
    Professor professor;

    public University(Group Group, Professor professor) {
        setGroup(Group);
        setProfessor(professor);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String toString() {
        return "University{" +
                "group=" + group +
                ", professors=" + professor +
                '}';
    }
}