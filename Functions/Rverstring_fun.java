package Functions;

import java.util.*;

public class Rverstring_fun {
    public static void rever(String s) {
        String a = "";
        if (s.length() == 1) {
            System.out.println(s);
            return;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the string");
        String s = sc.nextLine();
        rever(s);
    }
}
