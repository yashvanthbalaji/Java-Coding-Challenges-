package ArrayProblems;
import java.util.Scanner;
public class LeftRotate
{
    public static int[] leftRotateByK(int[]arr,int k)
    {
        int first;
        k=k%arr.length;
        for(int i =1 ; i<=k;i++)
        {
            first = arr[0];
            for(int j =0 ; j < arr.length-1;j++)
            {   
                arr[j]=arr[j+1];
            }
            arr[arr.length-1] = first;

        }
        return arr;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size :"); 
        int size = scanner.nextInt();
        if (size <= 0)
        {
        System.out.println("Invalid array size.");
        scanner.close();
        return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i< arr.length ; i++)
        {
            System.out.print("Element "+(i+1)+": " );
            arr[i]=scanner.nextInt();
        }
        System.out.print("Original array : ");
        for (int num : arr)
        {
            System.out.print(num+" ");
            
        }
        System.out.println();
        System.out.print("Enter K positions : ");
        int k = scanner.nextInt();
        arr = leftRotateByK(arr,k);
        System.out.print("Processed array : ");
        for(int num : arr)
        {
            System.out.print(num+" "); 
        }


        scanner.close();
    }
    
}
