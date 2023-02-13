import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int year = 0;

        // Ask user to enter values
        System.out.println("Enter Year to check leap year or not : ");
        year = sc.nextInt();

        if (year % 4 == 0)
            System.out.println(year + " is Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }
}