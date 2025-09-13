package ArrayProblems;
import java.util.Scanner;
public class SumOfNum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scanner.nextInt();
        int [] num = new int[n];
        int sum= 0;
        for(int i =0 ; i<num.length ; i++)
        {
            System.out.print("Enter number "+ (i+1)+" : ");
            num[i]= scanner.nextInt();
            sum += num[i];
        }
        System.out.println("Total value : "+sum);
        scanner.close();

    }
    

}