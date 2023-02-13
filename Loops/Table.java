// Print table for given number

import java.util.Scanner;

class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0, count = 0;

        System.out.println("Enter the number to Find Prime or not");
        number = sc.nextInt();

        while (count <= 10) {
            System.out.println(number + "*" + count + "=" + (number * count));
            count += 1;
        }
    }
}
