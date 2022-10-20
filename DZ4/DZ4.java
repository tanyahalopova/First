import java.util.Scanner;

public class DZ4{
    public static void main(String[] args){
        film a=new film("Harry Potter",2001,"Daniel Radcliffe");
        a.getname();
        System.out.println(a.getyear());
    }
} 
class film{
    String name;
    private int year = 0; 
    String actor;
    
    public film(String name, int year, String actor) {
        this.name =name;
        setyear(year);
        this.actor = actor;
    }
    public void getname(){
        System.out.println(name);
    }
    public int getyear(){
        return this.year;
    }
    public void setyear(int year){
        if(year < 2022){
            this.year = year;
        }
    }
}