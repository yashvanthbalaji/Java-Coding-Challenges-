package BasicJavaProblems;
import java.util.Scanner;

public class StrongNum {
    static long factorial(int digit)
    {
        long fact =1;
        for (int i = 1 ; i<=digit ;i++)
        {
            fact*=i;
        }
        return fact;

    }
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int digit = 0;
        long sum =0;
        int original = num;
        String result = "";
        while (num>0)
        {
            digit = num%10;
            sum += factorial(digit);
            num /=10;

        }
        System.out.println(sum);
        System.out.println("Sum of factorials of digits: " + sum);
        result = (original==sum) ? "Yes , The given number is strong number":"No, it is not a Strong Number";
        System.out.println(result);
        scanner.close();
    }


    
}
