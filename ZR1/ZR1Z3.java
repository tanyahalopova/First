import java.util.Scanner;

public class ZR1Z3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int p = -2;
        int col = 0;
        int max = 0;
        while (x!=0){
            x = scanner.nextInt();
            if (x==p){
                col+=1;
                if (col>max){
                    max=col;
                }
            }
            else{
                col=0;
            }
            p=x;
        }
        System.out.println(max);
    }
}