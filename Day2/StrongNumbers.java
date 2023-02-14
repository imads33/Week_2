// Strong numbers Between 1 to 100

import java.util.Scanner;

class StrongNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, factorial, sum = 0, digit = 0, temp,temp2;

        for (number = 1; number <= 200; number++) {
            temp2=number;
            temp = number;
            sum=0;
            while (temp2 != 0) {
                digit = temp2 % 10;
                factorial = 1;
                for (int i = digit; i > 1; i--) {
                    factorial = factorial * i;
                }
                sum = sum + factorial;
                temp2 = temp2 / 10;
            }
            if (temp == sum){
                System.out.println(temp);
            }
        }
    }
}