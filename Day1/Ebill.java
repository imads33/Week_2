import java.util.Scanner;

class Ebill {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        float unit;
        float bill;

        // Ask user to enter values
        System.out.println("Enter number : ");
        unit = sc.nextInt();

        if (unit <= 50) {
            bill = unit * 0.50f;
        } else if (unit > 50 && unit <= 150) {
            bill = unit * 1.23f;
        } else if (unit > 150 && unit <= 250) {
            bill = unit * 1.90f;
        } else {
            bill = unit * 2.34f;
        }

        System.out.println("Bill is : " + bill);
    }
}