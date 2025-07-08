package Functions;

import java.util.*;

public class Primefun {
    public static boolean prime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
            break;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (prime(a) == false) {
            System.out.println("not a prime");

        } else {
            System.out.println("prime");
        }
        sc.close();
    }

}