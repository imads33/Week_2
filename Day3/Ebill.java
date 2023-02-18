import java.util.Scanner;

class Ebill {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        float unit, gst = 0;
        float bill;

        // Ask user to enter values
        System.out.println("Enter number : ");
        unit = sc.nextFloat();

        if (unit <= 50) {
            bill = unit * 0.50f;
        } else if (unit <= 150) {
            bill = unit * 1.23f;
        } else if (unit <= 250) {
            bill = unit * 1.90f;
        } else {
            bill = unit * 2.34f;
        }
        gst = (10 * bill) / 100;
        System.out.println("Bill per Unit is : " + bill);
        System.out.println("GST is : " + gst);
        bill = bill + gst;
        System.out.println("Total Bill is : " + bill);
    }
}