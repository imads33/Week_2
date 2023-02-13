import java.util.Scanner;

class NumberofNotes {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int amount;

        // Ask user to enter values
        System.out.println("Enter Amount : ");
        amount = sc.nextInt();

        if (amount % 100 != 0 && amount <= 0) {
            System.out.println("Invalid Amount");
        }
    }
}