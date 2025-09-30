package ArrayProblems;
import java.util.Scanner;
public class RightRotate
{
    public static int[] rightRotateByK(int[]arr,int k)
    {
        int last;
        k=k%arr.length;
        for(int i =1 ; i<=k;i++)
        {
            last = arr[arr.length-1];
            for(int j =arr.length-1 ; j > 0;j--)
            {   
                arr[j]=arr[j-1];
            }
            arr[0] = last;

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
        arr = rightRotateByK(arr,k);
        System.out.print("Processed array : ");
        for(int num : arr)
        {
            System.out.print(num+" "); 
        }


        scanner.close();
    }
    
}
