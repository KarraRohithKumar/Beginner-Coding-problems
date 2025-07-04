package String_problems;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new string : ");
        String s = sc.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.err.print(s.charAt(i));
        }
    }
}
