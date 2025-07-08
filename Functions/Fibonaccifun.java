package Functions;

import java.util.Scanner;

public class Fibonaccifun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return b;
        // if (n <= 1) {
        // return n;
        // }
        // return fib(n - 1) + fib(n - 2);
    }

}
