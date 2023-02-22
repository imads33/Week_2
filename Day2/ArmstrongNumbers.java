//  ArmStrong numbers between 1 to 1000

import java.util.Scanner;

class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = 1;

        while (number <= 1000) {
           int count = 0, digit = 0, temp1, temp2, sum = 0;
            temp1 = number;
            temp2 = number;

            while (temp1 != 0) {
                count++;
                temp1 = temp1 / 10;
            }

            while (temp2 != 0) {
                digit = temp2 % 10;
                int power = 1;
                for (int i = count; i > 0; i--) {
                    power = power * digit;
                }
                sum = sum + power;
                temp2 = temp2 / 10;
            }
            if (sum == number) {
                System.out.println(number);
            }
            number++;
        }
    }
}