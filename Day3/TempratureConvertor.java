import java.util.Scanner;

class TempratureConvertor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float temprature = 0, celsius = 0, fahrenheit = 0;

        System.out.println("Enter F/f - convert to fahrenheit \n C/c - conver to Celsius ");
        char input = s.next().charAt(0);

        if (input == 'F' || input == 'f') {
            System.out.println("Enter Temprature(in celsius) ");
            temprature = s.nextFloat();

            fahrenheit = ((temprature) * 9 / 5) + 32;

            System.out.println("Fahrenheit : " + fahrenheit);

        } else if (input == 'C' || input == 'c') {
            System.out.println("Enter Temprature(fahrenheit) ");
            temprature = s.nextFloat();

            celsius = ((temprature - 32) * 5) / 9;

            System.out.println("Celsius : " + celsius);

        } else
            System.out.println("Invalid Entry/Choice");
    }
}