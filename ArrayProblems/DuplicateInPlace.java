package ArrayProblems;
import java.util.Scanner;
public class DuplicateInPlace
{
    public static int duplicate(int[] arr)
    {
        int i = 0 ;
            for(int j = 1 ; j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    i = i+1;                    //i++
                    arr[i] = arr[j];
                }
            }
        
        return i+1;   
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements for array");
        for(int i =0 ; i< arr.length;i++)
        {
            System.out.print("Element "+(i+1)+" ");
            arr[i]= scanner.nextInt();
        }
        System.out.print("Original array : ");
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Processed array : ");
        int length= duplicate(arr);
        for (int i = 0; i < length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
        System.out.println("The new length : "+length);
        scanner.close();
    }

    
}
