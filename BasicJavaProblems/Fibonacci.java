package BasicJavaProblems;
import java.util.Scanner;
public class Fibonacci {

    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter The Number");
        int n = scanner.nextInt();
        int first = 0;
        int second = 1 ;
        int next = 0;
        for ( int i = 0 ; i <=n; i++)
        {
            System.out.print(first + " ");
            next = first + second ;
            first = second ;
            second = next ;
            
        }
        scanner.close();

    }
}