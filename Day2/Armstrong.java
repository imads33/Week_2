import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, count = 0, digit = 0, temp1, temp2, sum = 0;

        System.out.println("Enter the number");
        number = s.nextInt();
        temp1 = number;
        temp2 = number;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        while (temp1 != 0) {
            digit = temp1 % 10;
            int power = 1;
            for (int i = count; i > 0; i--) {
                power = power * digit;
                System.out.println(digit);
            }
            sum = sum + power;
            System.out.println("summ is " + sum);

            temp1 = temp1 / 10;
        }

        if (sum == temp2) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}