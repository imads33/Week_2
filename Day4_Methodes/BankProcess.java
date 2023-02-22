import java.util.Scanner;

class BankProcess {
    Scanner scanner = new Scanner(System.in);
    // minimum and account balance
    int balance = 50000, minBalance = 500, withdrawalAmount = 0, depositAmount = 0, transactionLimit = 0;
    // Available number of notes in ATM
    int avlable500 = 5, avlable200 = 5, avlable100 = 10, totalATM_amount;
    // variables for count number of notes
    int fiveHundreds = 0, twoHundreds = 0, Hundreds = 0;
    boolean success;

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
            System.out.println("Please Select to proceed the transaction");
            System.out.println("1. Deposit \n2. Withdraw \n3. Balance Enquiry \n4. Exit ");
            System.out.println("------------------------");
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
        totalATM_amount = (avlable500 * 500) + (avlable200 * 200) + (avlable100 * 100);

        if (transactionLimit != 3) {
            System.out.println("Available :100\t200\t500");
            System.out.println("Please enter withdrawal amount");
            int withdrawalAmount = scanner.nextInt();
            int temp2 = withdrawalAmount;
            if (withdrawalAmount < totalATM_amount) {
                if (withdrawalAmount < balance) {
                    if (withdrawalAmount % 100 == 0 && withdrawalAmount != 0) {
                        if (withdrawalAmount <= 30000) {
                            if (balance - withdrawalAmount > 500) {
                                withdrawalNotesCount();
                                if (success == true) {
                                    transactionLimit++;
                                    balance = balance - temp2;
                                    avlable500 = avlable500 - fiveHundreds;
                                    avlable200 = avlable200 - twoHundreds;
                                    avlable100 = avlable100 - Hundreds;
                                    successMessage();
                                } else {
                                    System.out.println("Transaction failed ! Try different amount");
                                    withdraw();
                                }
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
                System.out.println("Sorry! cant process this transaction\nTry other value");
            }
        } else {
            System.out.println("Daily Transaction limit exceeded/over\nComeBack Tomorrow");

        }
        displayChoice();
    }

    public void amountDeposit() {
        System.out.println("Only enter 100, 200, 500");
        System.out.println("Please enter Deposit amount");
        depositAmount = scanner.nextInt();

        if (depositAmount % 100 == 0 && depositAmount != 0) {
            if (depositAmount <= 50000) {
                balance = depositAmount + balance;
                depositNotesCount();
                avlable500 = avlable500 + fiveHundreds;
                avlable200 = avlable200 + twoHundreds;
                avlable100 = avlable100 + Hundreds;
                successMessage();
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

    // ***************** COUNTs number of N0tes in transaction Amount
    public void withdrawalNotesCount() {
        while (withdrawalAmount != 0) {
            if (withdrawalAmount >= 500) {
                if (avlable500 > 0) {
                    count500();
                } else if (avlable200 > 0) {
                    count200();
                } else if (avlable100 > 0) {
                    count100();
                } else {
                    success = false;
                    break;
                }
            }
            if (withdrawalAmount >= 200 && withdrawalAmount < 500) {
                if (avlable200 > 0) {
                    count200();
                } else if (avlable100 > 0) {
                    count100();
                } else {
                    success = false;
                    break;
                }
            }
            if (withdrawalAmount == 100) {
                if (avlable100 > 0) {
                    count100();
                } else {
                    success = false;
                    break;
                }
            }
        }
    }

    public void depositNotesCount() {
        while (depositAmount != 0) {
            if (depositAmount >= 500) {
                fiveHundreds = depositAmount / 500;
                depositAmount = depositAmount % 500;
            }
            if (depositAmount >= 200 && depositAmount < 500) {
                twoHundreds = depositAmount / 200;
                depositAmount = depositAmount % 200;
            }
            if (depositAmount == 100) {
                Hundreds = depositAmount / 100;
                depositAmount = depositAmount % 100;
            }
        }
    }

    // Number of 500 Notes
    public void count500() {
        fiveHundreds = withdrawalAmount / 500;
        withdrawalAmount = withdrawalAmount % 500;
        // fiveHundreds += fiveHundreds;
        success = true;
    }

    // Number of 200 Notes
    public void count200() {
        twoHundreds = withdrawalAmount / 200;
        withdrawalAmount = withdrawalAmount % 200;
        // twoHundreds += twoHundreds;
        success = true;
    }

    // Number of 100 Notes
    public void count100() {
        Hundreds = withdrawalAmount / 100;
        withdrawalAmount = withdrawalAmount % 100;
        // Hundreds += Hundreds;
        success = true;
    }

    // ******************* End **************** //
    // shows success message
    public void successMessage() {
        System.out.println("Transaction successful \n500 -->\t" + fiveHundreds + "\n200 -->\t" + twoHundreds
                + "\n100-->\t" + Hundreds);
        fiveHundreds = 0;
        twoHundreds = 0;
        Hundreds = 0;
        balanceenquiry();
    }

    // Displays the Available Account Balance
    public void balanceenquiry() {
        System.out.println("Available balance is :" + balance);
    }

    public static void main(String[] args) {
        BankProcess obj = new BankProcess();

        System.out.println("======== WELCOM TO XYZ BANK =======");

        obj.pinCheck();
    }
}
