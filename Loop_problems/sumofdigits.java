package ForLoop_problems;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int k = num % 10;// we get last digit here
            rev = rev + k; // adding to reversed
            num = num / 10;// remove last digit
        }
        System.out.println(rev);
        sc.close();

    }
}
