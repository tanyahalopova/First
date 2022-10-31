public class People {
    String Name;
    int year;

    public People(String Name, int year) {
        this.Name = Name;
        this.year = year;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public String toString() {
        return "People{" +
                "Name='" + Name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
