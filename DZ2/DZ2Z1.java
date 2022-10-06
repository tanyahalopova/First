import java.util.Scanner;

public class DZ2Z1{
    public static boolean someMethod(int x) {
        int c=2;
        while (x%c!=0){
            c+=1;
        }
        if (x==c){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println(someMethod(x)?"YES":"NO");
    }
}