import java.util.Scanner;

class WeekDays {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int number;

        // Ask user to enter values
        System.out.println("Enter number : ");
        number = sc.nextInt();

        if (number < 1 && number > 7) {
            System.out.println("Invalid Number");
        } else if (number == 1)
            System.out.println("Sunday");
        else if (number == 2)
            System.out.println("Monday");
        else if (number == 3)
            System.out.println("Tuesday");
        else if (number == 4)
            System.out.println("WedSday");
        else if (number == 5)
            System.out.println("Thursday");
        else if (number == 6)
            System.out.println("Friday");
        else
            System.out.println("Saturday");
    }
}