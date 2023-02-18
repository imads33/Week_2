import java.util.Scanner;
import java.lang.Math;

class EMIcalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float loanAmount, intrestRate = 0,power=0, totalAmount = 0; 
        float totalIntrest = 0, emi = 0;
        int period;

        System.out.println("Enter Loan amount");
        loanAmount = s.nextFloat();

        System.out.println("Enter intrest rate");
        intrestRate = s.nextFloat();

        System.out.println("Enter period in months");
        period = s.nextInt();

        intrestRate=intrestRate/(12*100);
        
        power=(float)(Math.pow(1+intrestRate,period));
        
        emi = (loanAmount * intrestRate * power) / (power- 1);
        System.out.println("\nEMI is"+emi);
        
        System.out.println("Principal amount is " + loanAmount);
        
        totalAmount = emi * period;
        totalIntrest =totalAmount-loanAmount;
        
        System.out.println("total intrest amount is " + totalIntrest);

        System.out.println("total amount is " + totalAmount);
        
    }
}