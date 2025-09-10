package StringProblems;
import java.util.Scanner;

public class BubbleSort 
{
    
    public static void sort (int[]arr)
    {   int s = arr.length;
        int temp =0;
        boolean swap;
        for (int i = 0;i<s;i++)
        {
            swap = false;
            for(int j =0 ; j < s-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false)
            {
                break;
            }
        }
    }


    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i < arr.length ; i++)
        {
            System.out.print("Element "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        sort(arr);
        System.out.print("Sorted Array : ");
        for(int array : arr)
        {
            System.out.print(array+" ");
        }


        scanner.close();
    }

}
