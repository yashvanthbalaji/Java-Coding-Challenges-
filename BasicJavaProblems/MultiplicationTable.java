package BasicJavaProblems;
import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        System.out.print("Enter the limits : ");
        int limit = scanner.nextInt();
        int result;
        for ( int i =1;i<=limit;i++)
        {
            result = num*i;
            System.out.printf("%d * %d = %d%n",num,i,result);
        }
        scanner.close();
    }
    
}