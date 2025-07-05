package ForLoop_problems;

import java.util.Scanner;

public class GCD_LCM_oftwonums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd = 0;
        int lcm;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        lcm = a * b / gcd;
        System.out.println("gcd of " + a + "and" + b + "is" + gcd);
        System.out.println("lcm of " + a + "and" + b + "is" + lcm);

        sc.close();
    }
}
