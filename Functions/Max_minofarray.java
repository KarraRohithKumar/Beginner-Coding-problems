package Functions;

import java.util.*;

public class Max_minofarray {
  public static void max(int[] arr) {
    if (arr.length == 0) {
      System.out.println("empty arrat");
      return;

    }
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("maximum " + max);
    System.out.println("minimum " + min);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("length of arraay");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    max(arr);
  }
}
