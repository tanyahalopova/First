import java.util.Scanner;

public class DZ2Z3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (x+y>z && y+z>x && x+z>y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
   }
}