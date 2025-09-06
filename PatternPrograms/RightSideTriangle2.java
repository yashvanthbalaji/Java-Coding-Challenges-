package PatternPrograms;
import java.util.Scanner;

public class RightSideTriangle2 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = scanner.nextInt();
        for(int i = 1 ; i<=n ; i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j = i; j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
