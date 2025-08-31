package PatternPrograms;
import java.util.Scanner;
public class TrianglePattern {

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        for (int i =1 ; i<=n;i++)
        {
            for(int j = 1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();

    }
    
}
