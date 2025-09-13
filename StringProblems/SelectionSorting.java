package StringProblems;
import java.util.Scanner;
public class SelectionSorting {


    public static void Sort (int []arr)
    {
        int n = arr.length;
        int min =0;
        int temp =0;
        
        for (int i=0;i<n-1;i++)
        {
            min = i;
            for(int j = i+1 ; j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min = j;
                }

            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        


    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i =0 ; i< n ; i++)
        {
            System.out.print("Element "+(i+1)+": ");
            arr[i]= scanner.nextInt();
        }
        System.out.print("Original array : ");
        for (int num : arr)
        {
            System.out.print(num+" ");
        }
        Sort(arr);
        System.out.println();
        System.out.print("Sorted array : ");
        for(int num : arr)
        {
            System.out.print(num+" ");
        }




        scanner.close();
    }
    


  
    
}
