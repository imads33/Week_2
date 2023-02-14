import java.util.Scanner;

class OddEvenInNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, odd = 0, even = 0;

        System.out.println("Enter the number");
        number = s.nextInt();

        while (number != 0) {
            number = number / 10;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of Even Digits are " + even);
        System.out.println("Number of Odd Digits are " + odd);
    }
}