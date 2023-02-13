import java.util.Scanner;

class RockPaperScissor {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        char person, computer;

        // Ask user to enter values
        System.out.println("Computer : ");
        computer = sc.next();
        System.out.println("Person : ");
        person = sc.next();

        if (person == p && computer == s) {
            System.out.println("Winner Computer");
        } else if (person == s && computer == p) {
            System.out.println("Winner Person");
        }

        else if (person == r && computer == p) {
            System.out.println("Winner computer");
        } else if (person == p && computer == r) {
            System.out.println("Winner Person");
        }

        else if (person == s && computer == r) {
            System.out.println("Winner Computer");
        } else if (person == r && computer == s) {
            System.out.println("Winner Person");
        } else {
            System.out.println("Match Tie!");

        }

    }
}