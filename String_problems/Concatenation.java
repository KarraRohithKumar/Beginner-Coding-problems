package String_problems;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new string : ");
        String s1 = sc.nextLine();
        System.out.print("Enter the new string : ");
        String s2 = sc.nextLine();
        System.out.println("concatenated string " + s1.chars() + s1 + s2);
    }
}
