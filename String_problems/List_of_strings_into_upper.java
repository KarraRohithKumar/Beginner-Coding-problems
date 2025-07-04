package String_problems;

import java.util.Scanner;
import java.util.Arrays;

public class List_of_strings_into_upper {
    public static void main(String[] args) {
        // converting list of string into uppercase
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of string array : ");
        int n = sc.nextInt();
        // user enters: a number
        // BUT: sc.nextInt() only reads the number, and leaves a newline (\n) in the
        // buffer
        sc.nextLine(); // consume the leftover \n

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            // give the strings
            s[i] = sc.nextLine().toUpperCase();
        }
        System.out.println(Arrays.toString(s));

    }
}
