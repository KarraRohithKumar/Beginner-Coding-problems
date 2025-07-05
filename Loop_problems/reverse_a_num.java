package ForLoop_problems;

import java.util.Scanner;

public class reverse_a_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int k = num % 10;// we get last digit here
            rev = rev * 10 + k; // adding to reversed
            num = num / 10;// remove last digit
        }
        System.out.println(rev);
        sc.close();

    }
}
