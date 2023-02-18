import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number=0,number1=0, rem,product=1, sum = 0,diffrence=0;

        System.out.println("Enter the number");
        number = s.nextInt();
        number1=number;
        while (number != 0) {
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }
        
        while (number1 != 0) {
            rem = number1 % 10;
            product = product * rem;
            number1 = number1 / 10;
        }

        diffrence=product-sum;
        System.out.println("Sum is " + sum);
        System.out.println("product is " + product);
        System.out.println("Diffrence is " + diffrence);
    }
}