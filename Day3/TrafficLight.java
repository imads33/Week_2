import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float time;

        System.out.println("Enter the time to know Trafiic");
        time = s.nextFloat();

        if (time > 24.00f) {
            System.out.println("Invalid time");
        } else {
            if (time >= 7 && time < 10) {
                System.out.println("Red Light");
                System.out.println("heavy Trafiic");
            }
            if (time < 12.30f) {
                System.out.println("Orange Light");
                System.out.println("Low Trafiic");
            }
            if (time <= 14.30f) {
                System.out.println("Red Light");
                System.out.println("heavy Trafiic");
            }
            if (time < 16.00f) {
                System.out.println("Green Light");
                System.out.println("Low Trafiic");
            }
            if (time < 22.00f) {
                System.out.println("Orange Light");
                System.out.println("Medium Trafiic");
            } else {
                System.out.println("Green Light");
                System.out.println("Nooo Trafiic");
            }
        }
    }
}