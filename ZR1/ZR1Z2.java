import java.util.Scanner;

public class ZR1Z2 {
    static boolean pow(int x) {
        while (x>0){
            if (x%10==3 || x%10==5){
                return true;
            }
            x/=10;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int col=0;
        for (int i=0;i<n;i++){
            int x = scanner.nextInt();
            if (pow(x)){
                col+=1;
            }
        }
        if (col==n){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}