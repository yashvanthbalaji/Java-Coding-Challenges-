package BasicJavaProblems;
import java.util.Scanner;

public class PerfectNum {
    public static void main ( String []args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num = scanner.nextInt();
        int divisorCount =0;
        int sum = 0;
        for(int i = 1 ; i <num ; i++)
        {
            if (num%i==0) 
            {
             sum+=i;
             divisorCount++;

            }
            
        }
        if (num==sum) 
        {
            System.out.println(num + " - It is Perfect Number");
            System.out.println(" It has "+divisorCount+" Divisors excluding itself");
            
        }
        else
        {
            System.out.println( num + " - It is Not a Perfect Number");
        }
        scanner.close();


    }
    
}
