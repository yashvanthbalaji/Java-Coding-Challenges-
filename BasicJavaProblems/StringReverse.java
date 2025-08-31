package BasicJavaProblems;
import java.util.Scanner;
public class StringReverse {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word to be reversed");
        String Word1 = scanner.nextLine();
        String word2="";
        for (int i = Word1.length()-1; i>=0 ; i--)
        {
            word2 = word2+Word1.charAt(i);
        }
        System.err.println("THE reversed string is :");
        System.err.println(word2);
        scanner.close();

    }
    
}
