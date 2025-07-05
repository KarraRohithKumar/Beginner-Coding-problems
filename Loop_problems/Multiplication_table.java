package ForLoop_problems;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + n + " = " + i * n);
        }
        sc.close();
    }
}
