//Perfect numbers between 1 to 1000

import java.util.Scanner;

class PerfectNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int num = 0;
        for (num = 0; num <= 1000; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}