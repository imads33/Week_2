import java.util.Scanner;

class NumberofDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, count = 0;

        System.out.println("Enter the number");
        number = s.nextInt();

        while (number != 0) {
            count++;
            number = number / 10;
        }
        System.out.println("Number of Digits are " + count);
    }
}