// factorial problem using methods

package MethodProblems;
import java.util.Scanner;

public class Factorial {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            scanner.close();
            return; 
        }

        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

        scanner.close();
    }
}
