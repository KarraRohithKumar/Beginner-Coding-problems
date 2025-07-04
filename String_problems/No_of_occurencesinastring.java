package String_problems;

import java.util.Scanner;

public class No_of_occurencesinastring {
    public static void main(String[] args) {
        // Number of occurences of a character in a string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new string : ");
        String s = sc.nextLine();
        int count = 0;
        System.out.print("Enter the character which you want to know : ");
        // taking the character input
        char a = sc.nextLine().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (a == s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
