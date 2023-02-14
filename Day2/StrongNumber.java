// Strong number

import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, factorial, sum = 0, digit = 0, temp;

        System.out.println("Enter the number");
        number = s.nextInt();

        temp = number;
        while (number != 0) {
            digit = number % 10;
            factorial = 1;
            for (int i = digit; i > 1; i--) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            number = number / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is Strong number");
        else
            System.out.println(temp + " is not a Strong number");
    }
}