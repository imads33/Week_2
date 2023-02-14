import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number, rem, rev = 0;

        System.out.println("Enter the number");
        number = s.nextInt();

        int temp=number;

        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }

        if(temp==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");      
    }
}