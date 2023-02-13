// WAP to find Pefect or not

import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, count = 1;
        int sum = 0;

        System.out.println("Enter the number");
        number = sc.nextInt();

        while (count <= number / 2) {
            if (number % count == 0) {
                sum = sum + count;
            }
            count = count + 1;
        }

        if (sum != number) {
            System.out.println(number + " is not perfect number");
        } else {
            System.out.println(number + " is perfect number");
        }
    }
}
