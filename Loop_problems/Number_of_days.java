package ForLoop_problems;

import java.util.Scanner;

public class Number_of_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the date1 like this date,month,year: ");
        int day1 = sc.nextInt();

        System.out.print("enter the date2 like this date,month,year: ");
        int day2 = sc.nextInt();
        int count = 0;
        for (int i = day1; i < day2; i++) {
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}
