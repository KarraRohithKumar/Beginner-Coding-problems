package ForLoop_problems;

import java.util.Scanner;

public class Sum_of_naturalnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give the number : ");
        int num = sc.nextInt();
        int i = num - 1;
        while (i > 0) {
            num = num + i;
            i--;
        }
        System.out.println(num);
        sc.close();

    }
}
