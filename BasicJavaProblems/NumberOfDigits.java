package BasicJavaProblems;
import java.util.Scanner;
public class NumberOfDigits
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        String NumStr = String.valueOf(Num);
        int length = NumStr.length();
        System.out.println("The number of digits is = " +length);
        scanner.close();

    }
}