import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = 0, age = 0, presentYear = 2023;

        System.out.println("Enter the Birth year");
        year = s.nextInt();

        age = presentYear - year;

        if (age <= 20) {
            System.out.println("Minor");
        } else {
            System.out.println("Adult");
        }
    }
}