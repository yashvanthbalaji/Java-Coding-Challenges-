package StringProblems;
import java.util.Scanner;


public class ReverseArray
 {
    public static void reverse ( int[] arr)
    {
        int start = 0;
        int end = arr.length -1;
        int temp =0;
        while (start < end )
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for (int i =0;i<arr.length;i++)
        {
            System.out.print("Element "+(i+1)+" ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Original array : " );

        for (int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j] );
        }

        reverse(arr);
        System.out.println();


        System.out.print("Reversed array : " );
        for (int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j] );
        }
        scanner.close();

    }

}
