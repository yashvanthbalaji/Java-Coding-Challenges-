package ArrayProblems;
import java.util.Scanner;
public class BubbleSortString {

    public static void sort(String arr [])
    {
        String temp = "";
        boolean swap;
        for(int i =0;i<arr.length;i++)
        {
            swap = false;
            for ( int j =0;j<arr.length-1-i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)    //we need to use "compareToIgnoreCase()" to avoid case sensitive
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;   
                }
            }
            if(swap == false)
            {
                break;
            }

            
        }


    }
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String [] arr = new String[n];
        for (int i =0;i<arr.length;i++)
        {
            System.out.print("Element "+(i+1)+ ": ");
            arr[i]=scanner.nextLine();
        }

        System.out.print("Before Sorting : ");
        for(String name : arr)
        {
            System.out.print(name+" ");
        }
        sort(arr);
        System.out.println();
        System.out.print("Sorted array : ");
        for(String name : arr)
        {
            System.out.print(name +" ");
        }
      scanner.close();
    }








}
