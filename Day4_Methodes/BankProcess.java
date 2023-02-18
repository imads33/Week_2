import java.util.Scanner;

class BankProcess {
    Scanner scanner = new Scanner(System.in);
    int balance = 50000, minBalance = 500, withdrawalAmount = 0, transactionLimit = 0;

    public void pinCheck() {
        int count = 0, pin = 0;

        while (count != 3) {
            System.out.println("Enter Your PIN");
            pin = scanner.nextInt();
            if (count == 3) {
                System.out.println("Invalid Pin! Your card is blocked for the day");
                break;
            }
            if (pin != 1234) {
                System.out.println("Invalid pin! try again");
                count++;
            } else {
                displayChoice();
                break;
            }
        }
        System.out.println("Thank you visit again");
    }

    public void displayChoice() {
        int choice = 0;
        while (true) {
            System.out.println("1. Deposit \n2. Withdraw \n3. Balance Enquiry \n4. Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                amountDeposit();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                balanceenquiry();
            } else if (choice == 4) {
                break;
            } else if (choice > 4) {
                System.out.println("Invalid Choice");
                continue;
            }
            char y = 'y';
            System.out.println("Do you want to continue ?");
            System.out.println("enter 'y' ->Yes OR 'n' ->No");
            y = scanner.next().charAt(0);
            if (y == 'y') {
                continue;
            } else {
                break;
            }
        }
    }

    public void withdraw() {
        int fiveHundreds = 0, twoHundreds = 0, Hundreds = 0;
        if (transactionLimit != 3) {
            System.out.println("Available :100\t200\t500");
            System.out.println("Please enter withdrawal amount");
            int withdrawalAmount = scanner.nextInt();

            if (withdrawalAmount < balance) {
                if (withdrawalAmount % 100 == 0 && withdrawalAmount != 0) {
                    if (withdrawalAmount <= 30000) {
                        if (balance - withdrawalAmount > 500) {
                            balance = balance - withdrawalAmount;
                            while (withdrawalAmount != 0) {
                                if (withdrawalAmount == 100) {
                                    Hundreds = withdrawalAmount / 100;
                                    withdrawalAmount = withdrawalAmount % 100;
                                }
                                if (withdrawalAmount >= 200 && withdrawalAmount < 500) {
                                    twoHundreds = withdrawalAmount / 200;
                                    withdrawalAmount = withdrawalAmount % 200;
                                }
                                if (withdrawalAmount > 500) {
                                    fiveHundreds = withdrawalAmount / 500;
                                    withdrawalAmount = withdrawalAmount % 500;
                                }
                            }
                            transactionLimit++;
                            System.out.println("Withdrawal successful \n500 -->\t" + fiveHundreds + "\n200 -->\t"
                                    + twoHundreds + "\n100-->\t" + Hundreds);
                            System.out.println("Available balance is " + balance);
                            balanceenquiry();
                        } else {
                            System.out.println("You must maintain a minimum balance of 500");
                            withdraw();
                        }
                    } else {
                        System.out.println("Enter amount between 100-30000");
                        withdraw();
                    }
                } else {
                    System.out.println("Enter correct amount");
                    withdraw();
                }
            } else {
                System.out.println("Insufficient Balance");
                balanceenquiry();
                displayChoice();
            }
        } else {
            System.out.println("Daily Transaction limit exceeded/over\nComeBack Tomorrow");

        }
        displayChoice();
    }

    public void amountDeposit() {
        System.out.println("Only enter 100, 200, 500");
        System.out.println("Please enter Deposit amount");
        int depositAmount = scanner.nextInt();

        if (depositAmount % 100 == 0 && depositAmount != 0) {
            if (depositAmount <= 50000) {
                balance = depositAmount + balance;
                System.out.println("Deposit Success!");
                balanceenquiry();
            } else {
                System.out.println("Enter amount below 50000");
                amountDeposit();
            }
        } else {
            System.out.println("Enter amount above 100");
            amountDeposit();
        }
        displayChoice();
    }

    public void balanceenquiry() {
        System.out.println("the balance is :" + balance);
    }

    public static void main(String[] args) {
        BankProcess obj = new BankProcess();

        System.out.println("======== WELCOM TO XYZ BANK =======");
        
        obj.pinCheck();
    }
}