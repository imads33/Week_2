import java.util.Scanner;

class SumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, rem, sum = 0;

        System.out.println("Enter the number");
        number = s.nextInt();

        while (number != 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        System.out.println("Number of Digits are " + sum);
    }
}