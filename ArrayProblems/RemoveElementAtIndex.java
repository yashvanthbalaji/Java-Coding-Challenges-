    package ArrayProblems;
    import java.util.Scanner;
    public class RemoveElementAtIndex
    {
        public static int[] remove(int[]arr,int index)
        {
            for(int i = index ; i<arr.length-1;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1]=-1;
            return arr;
        }
        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the array size : ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for(int i =0;i<arr.length;i++)
            {
                System.out.print("Element"+(i+1)+" : ");
                arr[i]= scanner.nextInt();
            }
            System.out.print("Original array : ");
            StringBuilder sb = new StringBuilder();
            for(int num : arr)
            {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
            System.out.print("Enter the index position to remove : ");
            int index = scanner.nextInt();
            if (index <0 || index >= arr.length) 
            {
                System.out.println("Invalid index");
                scanner.close();
                return;
            }
            System.out.print("Processed array : ");
            arr = remove(arr, index);
            for(int i =0;i<arr.length-1;i++)
            {

                System.out.print(arr[i]);
                if (i<arr.length-2) 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.println("New array size : "+ (size-1));


            scanner.close();
        }

    }