package ForLoop_problems;

import java.util.Scanner;

public class num_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while (num > 0) {
            int k = num % 10;// we get last digit here
            rev = rev * 10 + k; // adding to reversed
            num = num / 10;// remove last digit
        }
        System.out.println(rev);
        if (original == rev) {
            System.out.println(" it is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
        sc.close();

    }
}
