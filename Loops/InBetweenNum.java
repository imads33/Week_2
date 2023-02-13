import java.util.Scanner;

class InBetweenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = 0, stop = 0;

        System.out.println("Enter Start and Stop values");
        start = sc.nextInt();
        stop = sc.nextInt();

        if (start < stop) {
            while (start <= stop) {
                System.out.println(start);
                start += 1;
            }
        } else if (start > stop) {
            while (start >= stop) {
                System.out.println(start);
                start -= 1;
            }
        } else {
            System.out.println("Both are same");
        }
    }
}