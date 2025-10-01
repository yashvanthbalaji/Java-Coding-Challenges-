package ArrayProblems;
import java.util.Scanner;
public class MergeThreeArray 
{ 
    public static int[] arrayinput(Scanner scanner,int num)
    {   
        System.out.print("Enter the array size of "+num+" : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements for array "+num);
        for(int i = 0 ; i<arr.length;i++)
        {
            System.out.print("Element "+(i+1)+" ");
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public static int[] mergearray(int[] arr_1,int[]arr_2,int[]arr_3)
    {
        int size_arr = arr_1.length + arr_2.length + arr_3.length;
        int [] arr = new int[size_arr];
        for(int i =0 ; i<arr_1.length;i++)
        {
            arr[i]=arr_1[i];
        }
        for(int i =0 ; i<arr_2.length ; i++)
        {
            arr[i+arr_1.length] = arr_2[i];
        }
        for (int i = 0 ; i< arr_3.length; i++)
        {
            arr[i+(arr_1.length+arr_2.length)] = arr_3[i];
        }
        return arr;

    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int[] arr_1 = arrayinput(scanner,1);
        int[] arr_2 = arrayinput(scanner,2);
        int[] arr_3 = arrayinput(scanner,3);
        int[] final_array = mergearray(arr_1,arr_2,arr_3);
        System.out.print("processed array :");
        for (int num : final_array) 
        {
            System.out.print(num+" ");
        }
        scanner.close();

    }
    
}
