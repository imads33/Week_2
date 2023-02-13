import java.util.Scanner;

class EligibleToVote {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int age;

        // Ask user to enter values
        System.out.println("Enter Age : ");
        age = sc.nextInt();

        if (age < 18)
            System.out.println("Not Eligible");
        else
            System.out.println("Yess! Eligible");
    }
}