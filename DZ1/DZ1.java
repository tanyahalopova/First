import java.util.Scanner;

public class DZ1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x=3;
        int s=0;
        while (x!=0){
            x=scanner.nextInt();
            if(x==5){s+=1;}
        }
        if (s>0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
       }
   }
}