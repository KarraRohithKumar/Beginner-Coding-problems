package String_problems;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        // for finding length of string by using length method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new string : ");
        String s = sc.nextLine();
        System.out.println("length of the string " + s.length());
    }
}
