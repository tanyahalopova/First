import java.util.Scanner;

public class DZ3Z4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("\n");
        for (int i=1;i<=n*2;i++){
            int x=2*n-i;
            for (int j=0;j<x;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print(0<=j+x-i && j+x-i<=(2*n-i)*2 && i>n && j+x>n ?" ":"*");

            }
            System.out.print("\n");
        }
    }
}