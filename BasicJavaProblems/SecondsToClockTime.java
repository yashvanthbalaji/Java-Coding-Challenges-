package BasicJavaProblems;
import java.util.Scanner;
public class SecondsToClockTime{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seconds : ");
        int seconds = scanner.nextInt();
        int h,m,s;

        h = seconds/3600;
        m = (seconds%3600)/60;
        s = seconds%60;
        System.out.printf("%02d:%02d:%02d",h,m,s);
        scanner.close();
        
    }
}