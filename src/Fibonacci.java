//Jewel J Joseph 19/07/25
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        int num, a = 0, b = 1, i = 1 ;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("Fibonacci Series: " + a + ", " + b);
        while (i < num - 1) {
            int c = a + b;
            System.out.print(", " + c); 
            a = b; 
            b = c;
            i++; 
        }
        sc.close();
    }
}
