package ForLoop_problems;

import java.util.Scanner;

public class Factors_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { // checking the factors
                System.out.print(i + " ");
            }
        }
        sc.close();

    }
}
