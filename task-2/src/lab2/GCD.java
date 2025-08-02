package lab2;
import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
        sc.close();
    }
}