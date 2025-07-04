package String_problems;

import java.util.Scanner;

public class No_of_vowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new string : ");
        String s = sc.nextLine();
        String s1 = s.toLowerCase();// converting to lower case because we checks the smaller vowels if you want
                                    // make the vowels upper case and change it to upper case
        String s2 = "aeiou";
        int count = 0;
        // outer loop for pick the one charcter
        for (int i = 0; i < s2.length(); i++) {
            // inner loop for all characters of string
            for (int j = 0; j < s1.length(); j++) {
                // condition for checking the vowel or not
                if (s2.charAt(i) == s1.charAt(j)) {
                    count++;// it counts the number of matches
                }
            }
        }
        System.out.println("Number of vowels in the given string " + count);
    }
}