// Prime Number

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0, factor = 1, count = 0;

        System.out.println("Enter the number to Find Prime or not");
        number = sc.nextInt();

        while (factor < number / 2) {
            if (number % factor == 0) {
                count += 1;
            }
            factor += 1;
        }
        if (count > 1)
            System.out.println(number + " is Not a prime number");
        else
            System.out.println(number + " is prime number");

    }
}
