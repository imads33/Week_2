// Count factors of Given Number

import java.util.Scanner;

class FactorsCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0, factor = 1, count = 0;

        System.out.println("Enter the number to count factors");
        number = sc.nextInt();

        while (factor < number / 2) {
            if (number % factor == 0) {
                count += 1;
            }
            factor += 1;
        }
        System.out.println(count);
    }
}
