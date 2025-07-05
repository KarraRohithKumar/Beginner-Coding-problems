package ForLoop_problems;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (isprime(a) == true) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("not a prime");
        }

        sc.close();
    }

    public static boolean isprime(int a) {
        for (int i = 2; i < a;) {
            if (a % i == 0) {
                return false;
            }
            break;
        }
        return true;

    }

}
