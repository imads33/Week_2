// Print table for given number

import java.util.Scanner;

class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0, count = 0;

        System.out.println("Enter the number to print table");
        number = sc.nextInt();

        for(count=0;count<=10;count++) {
            System.out.println(number + " * " + count + " = " + (number * count));
        }
    }
}
