package ArraysBasics;

import java.util.*;

public class Large_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume the first element is the largest initially
        int max = arr[0];

        // Traverse the array to find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current element is larger
            }
        }

        // Print the largest element
        System.out.println(max);
    }
}
