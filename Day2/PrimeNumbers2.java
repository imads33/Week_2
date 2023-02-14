// Alternative Prime numbers between 1 to 100

class PrimeNumbers2 {
    public static void main(String[] args) {

        int number = 2, temp = 0;

        for (number = 0; number <= 100; number++) {
            int factor = 1, count = 0;
            for (; factor <= (number / 2); factor++) {
                if (number % factor == 0) {
                    count = count + 1;
                }
            }
            if (count == 1) {
                temp++;
                if (temp % 2 == 0)
                    System.out.println(number);
            }
        }

    }
}