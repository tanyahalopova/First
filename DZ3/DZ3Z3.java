import java.util.Scanner;

public class DZ3Z3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a="1";
        int i = 2;
        int col=0;
        while (n!=1){
            while (n%i==0){
                String b=i+" ";
                a=a+" * "+b;
                n=n/i;
                col+=1;
            }
            i++;
        }
        System.out.println(col>1?a:"Prime");
    }
}