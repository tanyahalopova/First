import java.util.Scanner;

public class DZ3Z1{
    static int factorial(int x) {
        return x>0?x*factorial(x-1):1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }
}