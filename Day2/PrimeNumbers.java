// Prime numbers between 1 to 100

class PrimeNumbers {
    public static void main(String[] args) {

        int number = 0;
        // ----------- FIRST APPROACH
        while (number <= 100) {
            int factor = 1, count = 0;
            while (factor <= number / 2) {

                if (number % factor == 0) {
                    count = count + 1;
                }
                factor = factor + 1;
            }
            if (count == 1) {
                System.out.println(number);
            }
            number = number + 1;
        }

        // ----------- SECOND APPROACH------------------

        // for (number = 0; number <= 100; number++) {
        // int factor = 1, count = 0;
        // while (factor <= number / 2) {
        // if (number % factor == 0) {
        // count = count + 1;
        // }
        // factor = factor + 1;
        // }
        // if (count == 1) {
        // System.out.println(number);
        // }
        // }

        // ----------- THIRD APPROACH------------------

        // for (number = 0; number <= 100; number++) {
        // int factor = 1, count = 0;
        // for (; factor <= (number / 2); factor++) {
        // if (number % factor == 0) {
        // count = count + 1;
        // }
        // }
        // if (count == 1) {
        // System.out.println(number);
        // }
        // }

    }
}