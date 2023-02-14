import java.util.Scanner;

class SumOfOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, oddsum = 0, evensum = 0;

        System.out.println("Enter the number");
        number = s.nextInt();

        while (number != 0) {
            int rem = number % 10;
            if (rem % 2 == 0) {
                evensum = evensum + rem;
            } else {
                oddsum = oddsum + rem;
            }
            number = number / 10;
        }
        System.out.println("Sum of Even Digits is " + evensum);
        System.out.println("Sum of Odd Digits is " + oddsum);
    }
}