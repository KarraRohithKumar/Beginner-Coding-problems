package Functions;

import java.util.*;

public class Sortarray {
    public static void sort(int[] a) {
        if (a.length == 0) {
            System.out.println("empty array");
            return;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the values");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        sort(a);
    }
}
