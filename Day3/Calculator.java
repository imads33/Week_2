import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 0, b = 0, sum = 0;
        char operator;

        System.out.println("Enter first Value :");
        a = s.nextInt();
        System.out.println("Enter first Value :");
        b = s.nextInt();
        System.out.println("Enter operator to perform operation :");
        operator = s.next().charAt(0);

        if (operator == '+') {
            sum = a + b;
        }
        if (operator == '-') {
            sum = a - b;
        }
        if (operator == '*' || operator == 'x') {
            sum = a * b;
        }
        if (operator == '/') {
            sum = a / b;
        }
        System.out.println("Answer is " + sum);
    }
}