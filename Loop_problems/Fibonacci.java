package ForLoop_problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sequence length : ");
        int num = sc.nextInt();
        // For the invalid input
        if (num == 0) {
            return;
        } // these values are not change
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        // Here the loop for the sequence
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        sc.close();

    }
}
