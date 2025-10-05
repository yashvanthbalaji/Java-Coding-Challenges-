    //Write reusable max(a, b) and min(a, b) functions.

    package MethodProblems;
    import java.util.Scanner;
    public class ReusableMaxMin
    {
        public static int maximum(int num_1,int num_2)
        {
            int max = (num_1 > num_2) ? num_1 : num_2;
            return max;
            
        }
        public static int minimum(int num_1,int num_2)
        {
            int min = (num_1 < num_2) ? num_1  : num_2;
            return min;
            
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the 1st number : ");
            int num_1 = scanner.nextInt();
            System.out.print("Enter the 2nd number : ");
            int num_2 = scanner.nextInt();
            if(num_1 ==  num_2)
            {
                System.out.println("Both are equal");
            }
            else
            {
                System.out.println("Maximum is : "+maximum(num_1, num_2));
                System.out.println("Minimum is : "+minimum(num_1, num_2));

            }
            scanner.close();
        }
        
    }
    