package ArrayProblems;
import java.util.Scanner;
public class LinearSearch 
{   
    public static String linearsearch (int[]arr,int search)
    {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                sb.append(i).append(" ");
            }

        }
        if(sb.length()==0)
        {
            return "-1";
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter the elements for array");
        for(int i =0 ; i< arr.length;i++)
        {
            System.out.print("Element "+(i+1)+ " ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Original array");
        for(int num : arr)
        {
            System.out.print(num+ " ");
        }
        System.out.println();
        System.out.print("Enter the value to search : ");
        int search = scanner.nextInt();
        System.out.println("Element found at index/indices: " + linearsearch(arr, search));

        scanner.close();

    }
    


}
