// Even Numbers between 10 to 1

import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        while (number >= 1) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number -= 1;
        }
    }
}
