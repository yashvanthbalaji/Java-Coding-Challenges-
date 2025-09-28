package ArrayProblems;
import java.util.Scanner;

public class DigitCount {

    public static int digitcount (int[] arr,int n)
    {
        int count=0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i]==n)
            {
                count+=1;
            }
        }
        return count;
    }


    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i =0;i<size;i++)
        {
            System.out.print("Element "+(i+1)+" : ");
            arr[i]=scanner.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) 
        {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
        System.out.print("Enter the number to find occurence :");
        int n = scanner.nextInt();
        System.out.println(n + " appears " + digitcount(arr, n) + " times");

        scanner.close();

    }


    
}
