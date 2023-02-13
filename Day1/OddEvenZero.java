import java.util.Scanner;

class OddEvenZero {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int number = 0;

        // Ask user to enter values
        System.out.println("Enter Number : ");
        number = sc.nextInt();

        if (number == 0)
            System.out.println(number + " is Zero");
        else if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
}