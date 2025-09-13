package ArrayProblems;
import java.util.Scanner;

public class MinAndMax {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter :");
        int n = scanner.nextInt();

        int[] num = new int[n];

        for(int i=0 ; i<num.length;i++)
        {
            System.out.print("Enter number "+(i+1)+" : ");
            num[i]=scanner.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for (int i =0 ;i<num.length;i++)
        {
            if(min>num[i])
            {
                min = num[i];
            }
            if (max<num[i])
            {
                max = num[i];
            }

           
        }
        System.out.println("Minimum value : "+min);
        System.out.println("Maximum value : "+max);
        scanner.close();


    }
    
}
