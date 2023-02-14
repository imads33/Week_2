class PrimeNumbers {
    public static void main(String[] args) {

        int number=0;

        while(number<=100){
            int factor = 1, count = 0;
            while (factor <= number / 2) {
                
                if (number % factor == 0) {
                    count =count+ 1;
                }
                factor =factor+ 1;
            }
            if (count == 1){
                System.out.println(number);
            }
            number=number+1;
        }

    }
}