import java.util.Scanner;

public class ZR1Z1 {
    static int pow(int x) {
        if (x>0){
            return pow(x-1)*2;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(pow(scanner.nextInt()));
    }
}