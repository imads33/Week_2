
// Scanner class
import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        float Salary = 0, DA = 0, HRA = 0, GrossSalary = 0;

        // Ask user to enter values
        System.out.println("Enter Basic Salary Amount : ");
        Salary = sc.nextFloat();

        HRA = (89 * Salary) / 100;

        DA = (90 * Salary) / 100;

        GrossSalary = Salary + HRA + DA;

        System.out.println("Gross Salary  is : " + GrossSalary);

    }
}