import java.util.Scanner;

public class ZR1Z3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = -3;
        int p = -2;
        int col = 1;
        int max = 0;
        while (x!=0){
            x = scanner.nextInt();
            if (p==x){
                col++;
            }
            else{
                if (col>max){
                    max=col;
                }
                col=1;
            }
            p=x;
        }
        System.out.println(max);
    }
}