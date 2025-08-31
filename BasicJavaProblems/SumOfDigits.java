package BasicJavaProblems;
import java.util.Scanner;
public class SumOfDigits
{
    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digit=0;
        int sum = 0;
        int original = n ; 
        while (n!=0)
        {
            digit = n%10;
            sum = sum + digit ;
            n = n/10;


        }
        System.out.println("Sum of digits of " + original + " is " + sum);
        scanner.close();

    }
}