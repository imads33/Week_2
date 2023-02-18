import java.util.Scanner;

class SimpleIntrest {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        float principleAmount, intrest = 0, total = 0;
        int period;

        System.out.println("Enter principal amount");
        principleAmount = s.nextInt();

        System.out.println("Enter period \n1.Year 2.Months 3.Day 4.Quarter");
        period = s.nextInt();

        if (period == 1) {
            intrest = (10 * principleAmount) / 100;
        } else if (period == 2) {
            System.out.println("Enter number of months");
            float months = s.nextInt();
            if (months <= 12) {
                intrest = ((months * 10) / 12 * principleAmount) / 100;
            } else {
                System.out.println("Enter valid months");
            }
        } else if (period == 4) {
            System.out.println("Enter number of Quarters");
            float quarters = s.nextInt();
            if (quarters <= 4) {
                intrest = ((quarters * 10) / 4 * principleAmount) / 100;
            } else {
                System.out.println("Enter valid Quarters");
            }
        } else {
            System.out.println("Enter number of Days");
            float days = s.nextInt();
            if (days <= 31) {
                intrest = ((days * 10) / 365 * principleAmount) / 100;
            } else {
                System.out.println("Enter valid days");
            }
        }
        System.out.println("Intrest is " + intrest);
        System.out.println("Principal amount is  " + principleAmount);

        total = principleAmount + intrest;
        System.out.println("total amount is " + total);
    }
}