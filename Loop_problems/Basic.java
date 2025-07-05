package ForLoop_problems;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        /// abc is a number then if (a^n+b^n+c^n=abc) then it is called an armstrong
        /// number where n=number of digits//
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // Get last digit
            sum += digit ^ count;
            num /= 10; // Remove last digit
        }
        System.out.println(sum);

        // count will be 5

    }
}
//////////////// Anagram///////////////
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the string1");
// String string1 = sc.nextLine();
// System.out.println("enter the string2");
// String string2 = sc.nextLine();
// int count = 0;
// for (int i = 0; i < string1.length(); i++) {
// for (int j = 0; j < string2.length(); j++) {
// if (string1.charAt(i) == string2.charAt(j)) {
// count++;
// }
// }
// }
// if (count == string1.length() && count == string2.length()) {
// System.out.println("anagram");
// } else {
// System.out.println("not anagram");
// }

// int year = sc.nextInt();
// if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
// System.out.println("its a leap year");
// } else {
// System.out.println("its not a leap year");
// }

// String reversed = "";
// for (int i = name.length() - 1; i >= 0; i--) {
// reversed += name.charAt(i);
// }
// if (name.equals(reversed)) {
// System.out.println("palindrom");
// } else {
// System.out.println("not");
// }
