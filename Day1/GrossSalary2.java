
// Scanner class
import java.util.Scanner;

class GrossSalary2 {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        float Salary = 0, DA = 0, HRA = 0, GrossSalary = 0;

        // Ask user to enter values
        System.out.println("Enter Basic Salary Amount : ");
        Salary = sc.nextFloat();

        if (Salary <= 10000) {
            HRA = (67 * Salary) / 100;
            DA = (78 * Salary) / 100;
            GrossSalary = Salary + HRA + DA;
        } else if (Salary > 10000 && Salary < 20000) {
            HRA = (70 * Salary) / 100;
            DA = (80 * Salary) / 100;
            GrossSalary = Salary + HRA + DA;
        } else {
            HRA = (73 * Salary) / 100;
            DA = (87 * Salary) / 100;
            GrossSalary = Salary + HRA + DA;
        }

        System.out.println("Gross Salary  is : " + GrossSalary);

    }
}