import java.util.Scanner;

public class DZ3Z2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.print("\n");
        for (int i=x+x%3;i<=y;i+=3){
            System.out.print(i+" ");
        }
    }
}