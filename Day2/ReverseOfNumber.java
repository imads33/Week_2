import java.util.Scanner;

class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, rem, rev = 0;

        System.out.println("Enter the number");
        number = s.nextInt();

        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.println("Reverse of number is " + rev);
    }
}