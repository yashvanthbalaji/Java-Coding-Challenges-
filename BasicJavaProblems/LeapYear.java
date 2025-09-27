package BasicJavaProblems; 
import java.util.Scanner;

    public class LeapYear
    {
        public static void main(String[]args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the year : ");
            int year = scanner.nextInt();
            if(year%4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                    System.out.println(year+" - Yes, it is Leap Year");
                    }
                    else
                    {
                    System.out.println(year+" - No, it is not Leap Year");
                    }
                }
                else
                {
                 System.out.println(year+" - Yes, it is  Leap Year");
                } 
            }
            else
            {
                System.out.println(year+" - NO, it is not Leap Year");

            }
        scanner.close();

        }
    }
    

