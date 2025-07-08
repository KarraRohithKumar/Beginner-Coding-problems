package Functions;

import java.util.*;

public class Factfun {
    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
}
