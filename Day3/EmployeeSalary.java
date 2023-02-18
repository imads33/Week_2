// Employee salry,Annual salary,tax,net salary

import java.util.Scanner;

class EmployeeSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float salary = 0, annualSalary = 0,netSalary = 0, tax = 0;

        System.out.println("Enter Monthly Salary");
        salary = s.nextFloat();

        annualSalary = salary * 12;

        if (annualSalary <= 700000) {
            System.out.println("No taxes");
            netSalary = annualSalary - tax;
            System.out.println("\nMonthly Salary " + salary + "\nAnnual Salary " + annualSalary +                     "\nTax :" + tax + "\nNet Salary :" + netSalary);
        } else {
            // annualSalary1=annualSalary-300000;
            // System.out.println(annualSalary1);
            if (annualSalary > 300000 && annualSalary <= 600000) {
                tax = (5 * annualSalary) / 100;
            }
            else if (annualSalary <= 900000) {
                // tax = tax + (10 * (annualSalary)) / 100;
                tax = (300000 * 5) / 100 + ((annualSalary - 600000) * 10) / 100;

            }
            else if (annualSalary<= 1200000) {
                // tax = tax + (15 * (annualSalary1)) / 100;
                tax = (300000 * 5) / 100 + (300000 * 10) / 100 + ((annualSalary - 900000) * 15                         )/100;

            }
            else {
                // tax = tax + (20 * annualSalary1) / 100;
                tax = (300000 * 5) / 100 + (300000 * 10) / 100 + (300000 * 15) / 100 +                                 (annualSalary- 1200000) * 20 / 100;
            }
            netSalary = annualSalary - tax;
            System.out.println("Salary " + salary + "\nAnnual Salary " + annualSalary + "\nTax :"                         +tax + "\nNet Salary :" + netSalary);
        }
    }
}