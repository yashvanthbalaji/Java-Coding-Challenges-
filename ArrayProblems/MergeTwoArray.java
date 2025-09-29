package ArrayProblems;

import java.util.Scanner;

public class MergeTwoArray

{
    public static int[] merge(int[] arr_1,int[] arr_2)
    {
        int[]  arr_merge = new int[arr_1.length+arr_2.length];
        for(int i =0;i<arr_1.length;i++)
        {
            arr_merge[i] = arr_1[i];
        }
        for(int i=arr_1.length;i<arr_merge.length;i++)
        {
            arr_merge[i] = arr_2[i-arr_1.length];
        }

        /*for(int i=0;i<arr_2.length;i++)
        {
            arr_merge[i+arr_1.length] = arr_2[i];     - this also correct
        }
        return arr_merge; */

        return arr_merge;

    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the array 1 size : ");
        int size_1 = scanner.nextInt();
        System.out.print("Enter the array 2 size : ");
        int size_2 = scanner.nextInt();
        int[] arr_1 = new int[size_1];
        int[] arr_2 = new int[size_2];
        System.out.println("Enter Array 1 elements");
        for(int i =0 ; i< arr_1.length;i++)
        {
            System.out.print("Element "+(i+1)+" ");
            arr_1[i]=scanner.nextInt();
        }
        System.out.println("Enter Array 2 elements");
        for(int i =0 ; i<arr_2.length;i++)
        {
            System.out.print("Element "+(i+1)+" ");
            arr_2[i]= scanner.nextInt();
        }
        int[] arr_merge = merge(arr_1,arr_2);
        System.out.print("Merged array : ");
        for(int i=0;i<arr_merge.length;i++ )
        {
            System.out.print(arr_merge[i]);
            if(i<arr_merge.length-1)
            {
                System.out.print(" ");
            }
        }



        scanner.close();
    }



    
}
