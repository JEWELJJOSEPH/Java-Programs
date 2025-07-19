// Jewel J Joseph 19/07/25
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        int digit, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (; num != 0; num /=10) {
            digit = num % 10;
            rev = rev * 10 + digit;   
        }
        System.out.println("Reversed Number: " + rev);
        sc.close();
    }
}
