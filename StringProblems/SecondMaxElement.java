package StringProblems;
import java.util.Scanner;
public class SecondMaxElement {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for (int i =0;i<arr.length;i++)
        {
            System.out.print("Element "+(i+1)+" : ");
            arr[i]=scanner.nextInt();
        }
        int MaxElement = arr[0];
        int SecondMaxElement = Integer.MIN_VALUE;

        for (int i = 0 ; i<arr.length;i++)
        {
            if(MaxElement < arr[i])
            {
                MaxElement = arr[i];
            }
        }
        for ( int i =0;i<arr.length;i++)
        {
            if (arr[i]<MaxElement && arr[i]>SecondMaxElement)
            {
                SecondMaxElement = arr [i];
            }
        }
        System.out.println("First largest number : "+MaxElement);        

        if (SecondMaxElement == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest number");
        }
        else
        {
            System.out.println("Second largest number : "+SecondMaxElement);
        }
    scanner.close();
    }
    
}
