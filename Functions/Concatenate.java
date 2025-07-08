package Functions;

import java.util.*;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first string from the user
        String s1 = sc.nextLine();

        // Read the second string from the user
        String s2 = sc.nextLine();

        // Call the concatfun method to concatenate the strings
        // and print the result
        System.out.println(concatfun(s1, s2));
    }

    // Method to concatenate two strings with a space in between
    public static String concatfun(String s1, String s2) {
        return s1 + " " + s2;
    }
}
