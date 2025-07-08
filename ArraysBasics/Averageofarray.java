package ArraysBasics;

import java.util.Scanner;

public class Averageofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("give the elements ");

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        average(arr);
    }

    public static void average(int[] arr) {
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            add += arr[i];
        }
        int avaragee = add / arr.length;
        System.out.print("avarage of the given array : ");
        System.out.print(avaragee);

    }
}