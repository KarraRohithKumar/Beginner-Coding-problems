package ForLoop_problems;

import java.util.Scanner;

public class noof_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {

            count++; // counting the no of digits
            num = num / 10;// remove last digit
        }
        System.out.println(count);
        sc.close();

    }
}
