import java.util.Scanner;

class NumberofNotes {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int amount = 0, FiveHundreds = 0, TwoHundreds = 0, Hundreds = 0;

        // Ask user to enter values
        System.out.println("Enter Amount : ");
        amount = sc.nextInt();

        if (amount % 100 != 0 && amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            if (amount >= 500) {
                FiveHundreds = amount / 500;
                amount = amount % 500;
            } else if (amount >= 200 && amount < 500) {
                TwoHundreds = amount / 200;
                amount = amount % 200;
            } else {
                Hundreds = amount / 100;
                amount = amount % 100;
            }
            System.out.println("No.Of Notes for given amount is ");
            System.out.println("Five Hundreds: " + FiveHundreds);
            System.out.println("Two Hundreds: " + TwoHundreds);
            System.out.println("Hundreds: " + Hundreds);
        }
    }
}