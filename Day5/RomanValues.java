// PROGRAM TO PRINT ROMAN NUMBER FOR GIVEN NUMBER BETWEEN 1-4000

import java.util.Scanner;

class RomanValues {
    // Scanner class
    Scanner s = new Scanner(System.in);

    // Required Roman Characters and variables
    String one = "I", five = "V", ten = "X", fifty = "L", hundred = "C", fiveHundred = "D", thousand = "M";

    int number = 0, diffrence = 0, reminder = 0, quotient = 0;
    // Output variable
    String romanValue = "";

    public void inputNumber() {
        number = s.nextInt();
        while (number != 0) {
            if (number < 9) {
                oneTo9();
                break;
            } else if (number < 40) {
                nineTo39();
                break;
            } else if (number < 90) {
                fourtyTo89();
                break;
            } else if (number < 400) {
                _90To399();
                break;
            } else if (number < 900) {
                _400To899();
                break;
            } else if (number < 4000) {
                _900To4000();
                break;
            } else {
                System.out.println("Sorry! unable to print Roman Value for :" + number);
                break;
            }
        }
        System.out.println("Roman value is " + romanValue);
    }

    public void oneTo9() {
        reminder = number % 10;
        if (reminder <= 3) {
            for (int i = reminder; i > 0; i--) {
                romanValue = romanValue + one;
            }
        } else {
            if (reminder == 5) {
                romanValue = romanValue + five;
            } else {
                diffrence = reminder - 5;
                if (diffrence > 0) {
                    for (int i = diffrence; i > 0; i--) {
                        five = five + one;
                    }
                    romanValue = romanValue + five;
                } else {
                    romanValue = romanValue + "IV";
                }
            }
        }
        number = number / 10;
    }

    public void nineTo39() {
        reminder = number % 10;
        if (reminder == 0) {
            quotient = number / 10;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + ten;
            }
        } else if (reminder < 9) {
            quotient = number / 10;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + ten;
            }
            oneTo9();
        } else {
            quotient = number / 10;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + ten;
            }
            romanValue = romanValue + "IX";
        }
        number = number / 10;
    }

    public void fourtyTo89() {
        if (number < 50) {
            if (number < 40) {
                nineTo39();
            } else if (number <= 49) {
                romanValue = romanValue + "XL";
                number = number % 10;
                nineTo39();
            } else {
                romanValue = romanValue + "IX";
            }
        } else if (number > 89) {
            number = number % 100;
            _90To399();
        } else {
            reminder = number % 50;
            quotient = number / 50;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + fifty;
            }
            if (reminder != 0) {
                if (reminder < 9) {
                    number = reminder % 100;
                    oneTo9();
                } else {
                    number = reminder % 100;
                    nineTo39();
                }
            }
        }
        number = number / 10;
    }

    public void _90To399() {
        if (number < 100) {
            if (number < 90) {
                fourtyTo89();
            } else if (number >= 90) {
                romanValue = romanValue + "XC";
                number = number % 10;
                fourtyTo89();
            } else {
                romanValue = romanValue + "IX";
            }
        } else if (number > 399) {
            number = number % 400;
            _400To899();
        } else {
            reminder = number % 100;
            quotient = number / 100;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + hundred;
            }
            if (reminder != 0) {
                fourtyTo89();
            }
        }
        number = number / 100;
    }

    public void _400To899() {
        if (number < 500) {
            reminder = number % 400;
            quotient = number / 400;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + "CD";
            }
            if (reminder != 0) {
                number = number % 400;
                _90To399();
            }
        } else if (number > 899) {
            number = number % 1000;
            _900To4000();
        } else {
            reminder = number % 500;
            romanValue = romanValue + fiveHundred;
            if (reminder != 0) {
                number = number % 500;
                _90To399();
            }
        }
        number = number / 500;
    }

    public void _900To4000() {
        if (number < 1000) {
            reminder = number % 900;
            quotient = number / 900;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + "CM";
            }
            if (reminder != 0) {
                number = number % 900;
                _400To899();
            }
        } else {
            reminder = number % 1000;
            quotient = number / 1000;
            for (int i = quotient; i > 0; i--) {
                romanValue = romanValue + thousand;
            }
            if (reminder != 0) {
                number = number % 1000;
                _400To899();
            }
        }
        number = number / 1000;
    }

    public static void main(String[] args) {

        RomanValues roman = new RomanValues();
        System.out.println("Enter the number to convert it into Roman value");
        roman.inputNumber();
    }
}