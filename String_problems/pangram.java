package String_problems;

import java.util.*;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine().toLowerCase(); // convert to lowercase

        boolean isPangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is NOT a pangram.");
        }
    }
}
