import java.util.Scanner;

public class Main {
    static boolean abc(String a, String b){ // ab aa
        for (int i=0; i<a.length(); i++){
            if (b.length()>i && (int)(a.charAt(i))>b.charAt(i)){
                return true;
            }
            if ((int)(a.charAt(i))<b.charAt(i)){
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String f1 = sc.nextLine();
        String f2 = sc.nextLine();
        String f3 = sc.nextLine();
        String[] a= new String[3];
        if (abc(f1,f2)) {
            a[0]=f2;
            a[1]=f1;
        } else{
            a[0]=f1;
            a[1]=f2;
        }
        if (abc(a[1],f3)){
            a[2]=a[1];
            a[1]=f3;
            if (abc(a[0],f3)){
                a[1]=a[0];
                a[0]=f3;
            }
        }
        else{
            a[2]=f3;
        }
        System.out.println(name+ ": " + a[0]+ ", " + a[1]+ ", " +a[2]);
    }
}