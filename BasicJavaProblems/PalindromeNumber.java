package BasicJavaProblems;
import java.util.Scanner;
public class PalindromeNumber 
 {
    public static void main ( String [ ]args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int orginal_num = number ;
        int reversed = 0;
        int digit = 0;
        while (number !=0)
        {

           digit = number % 10 ;
           reversed = reversed *10 + digit;
           number = number / 10 ;
            
        }

        if (orginal_num == reversed )
        {
            System.out.println("palindrome number ");
        }
        else
        {

            System.out.println(" NOT a Palindrome number " );
            
        }
        scanner.close();


    }
 }