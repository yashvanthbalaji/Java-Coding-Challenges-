package PatternPrograms;
import java.util.Scanner;

public class DecreasingTriangle {

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n= scanner.nextInt();
        for (int i = 1 ; i<= n ;i++)
        {
            for (int j =i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();

    }

    
}
