package Functions;

import java.util.*;

public class palindrome_fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        // Call the function to check palindrome
        palfun(s);

    }

    // Function to check if a string is palindrome
    public static void palfun(String s) {
        String s1 = ""; // To store the reversed string

        // Reverse the original string
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        // Compare the original string with the reversed string
        if (s.equals(s1)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
