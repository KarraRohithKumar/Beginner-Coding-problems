package ForLoop_problems;

import java.util.Scanner;;

public class Power_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = sc.nextInt();
        System.out.print("enter the exponent : ");
        int a = sc.nextInt();
        int result = 1;
        // Finding the power with loop
        for (int i = 1; i <= a; i++) {
            result *= num;
        }
        System.out.println(result);
        sc.close();
    }
}
