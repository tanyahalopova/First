import java.util.Scanner;

public class DZ1z4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean m = false, l = false, eq = true;
        int a = scanner.nextInt();
        while(true) {
            int b = scanner.nextInt();
            if(b == 0) {break;}
            if(b != a) {eq = false;}
            if(b > a) {m = true;}
            if(b < a) {l = true;}
            a = b;
        }
    if(eq == true) {
      System.out.println("=");
    } else if(m == true && l == true) {
      System.out.println("!");
    } else if(m) {
      System.out.println("<");
    } else {
      System.out.println(">");
    }
   }
}