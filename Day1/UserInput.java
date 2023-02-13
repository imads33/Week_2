// program to take inputfrom user and count sum and average of 3 subjects

// import Scanner class for accepting input from user/scan input
// Scanner class
import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int subject1 = 0, subject2 = 0, subject3 = 0, total = 0, average = 0;

        // Ask user to enter values
        System.out.println("Enter 3 Subject marks : ");
        subject1 = sc.nextInt();
        subject2 = sc.nextInt();
        subject3 = sc.nextInt();

        total=subject1+subject2+subject3;

        average=total/3;
        System.out.println("Total Marks is : "+total);
        System.out.println("Average Marks is : "+average);
        

   }
}