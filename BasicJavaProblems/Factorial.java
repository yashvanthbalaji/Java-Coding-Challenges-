package BasicJavaProblems;
import java.util.Scanner;

public class Factorial {
    public static void main ( String []args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        long fact = 1 ;
        if (num<0) {
            System.out.println(" Enter positive number !");
            
        }
        else{
        for (int i = 1 ; i<=num ; i++)
        {
            fact *= i ;
        }
        System.out.println("Factorial value is : "+fact);
    }

        scanner.close();


    }
    
}
