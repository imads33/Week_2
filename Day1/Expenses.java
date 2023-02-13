
// Scanner class
import java.util.Scanner;

class Expenses {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        float Salary = 0, Bill1 = 0, Bill2 = 0, Bill3 = 0, Total = 0, Spent = 0;

        // Ask user to enter values
        System.out.println("Enter Salary Amount : ");
        Salary = sc.nextFloat();

        System.out.println("Enter 3 Bills Amount : ");
        Bill1 = sc.nextFloat();
        Bill2 = sc.nextFloat();
        Bill3 = sc.nextFloat();

        Total = Bill1 + Bill2 + Bill3;

        Spent = (100 * Total) / Salary;

        System.out.println("Total Bill : " + Total);
        System.out.println("Spent Amount  is : " + Spent);

    }
}