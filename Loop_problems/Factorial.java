package ForLoop_problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");

        int a = sc.nextInt();
        // int i = a - 1;
        // while (i >= 1) {
        // a = a * i;
        // i--;
        // }
        // System.out.println(a);
        System.out.println(recurs(a));

        sc.close();
    }

    public static int recurs(int a) {

        if (a == 1 || a == 0) {
            return 1;
        }
        return a * recurs(a - 1);

    }
}
