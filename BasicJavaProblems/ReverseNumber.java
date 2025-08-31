package BasicJavaProblems;
import java.util.Scanner;

public class ReverseNumber 
 {
    public static void main ( String [ ]args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed = 0;
        int digit = 0;
        while (number !=0)
        {

           digit = number % 10 ;
           reversed = reversed *10 + digit;
           number = number / 10 ;
            
        }
        System.err.println("THE REVERSED NUMBER IS "+ reversed);
        scanner.close();


    }
 }