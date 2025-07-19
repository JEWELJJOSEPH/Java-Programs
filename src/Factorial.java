//Jewel J Joseph 19/07/15 12:30pm
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
    int i = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    long fact = 1;
    while(i <= num){
    fact *= i;
    i++;
    }
    System.out.printf("factorail of the %d = %d%n",num,fact);
    sc.close();
    
}
}
