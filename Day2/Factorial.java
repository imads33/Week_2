import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, factorial = 1;

        System.out.println("Enter the number");
        number = s.nextInt();

        while (number >= 1) {
            factorial = factorial * number;
            number--;
        }

        // for (; number >= 1; number--) {
        // factorial = factorial * number;
        // }
        System.out.println("Factorial of given number is " + factorial);
    }
}