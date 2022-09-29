import java.util.Scanner;

public class DZ1z2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x;
        int s=0;
        while (true){
            x=scanner.nextInt();
            if(x==0){break;}
            s+=x;
        }
        System.out.println(s);
   }
}