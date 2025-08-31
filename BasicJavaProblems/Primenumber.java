package BasicJavaProblems;
import java.util.Scanner;
public class Primenumber 
{
    public static void main (String []args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int div_count = 0;
        for (int i =1 ; i<= num; i++)
        {
            if (num%i==0)
            {
                div_count += 1;
            }
        }
        if (div_count == 2) {
            System.out.println(num + "--It is Prime number");
            
        }
        else{
            System.out.println(num + "--It is not a Prime Number");
        }
        scanner.close();

    }

}