// Program to check Leap Year

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = 0;

        System.out.println("Enter the year to check Leap Year");
        year = s.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else
                    System.out.println("not a Leap year");

            } else
                System.out.println("not a Leap year");

        } else {
            System.out.println("not a Leap year");
        }
    }
}