package BasicJavaProblems;
import java.util.Scanner;
public class ArmstrongNum {

    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        String NumStr = String.valueOf(Num);
        int len = NumStr.length();
        int original = Num;
        int digit = 0;
        int value = 0;
        while (Num != 0) {
            digit = Num % 10;
            value = value +(int)Math.pow(digit,len);
            Num /=10;
        }
        if(value == original)
        {
                System.out.println("Yes ,It is a ARMSTRONG Number");

        }
        else
        {
                System.out.println("NO, It is NOT a ARMSTRONG Number");

        }
        scanner.close();


    }
}