import java.util.Scanner;

public class DZ2Z2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String e = scanner.nextLine();
        switch (e) {
            case "q":
                System.out.println("w");
                break;
            case "w":
                System.out.println("e");
                break;
            case "e":
                System.out.println("r");
                break;
        }
   }
}