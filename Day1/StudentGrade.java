import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        // creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Declaring vaiables
        int project = 0, internal = 0, external = 0, total = 0;
        char grade = 'N';

        // Ask user to enter values
        System.out.println("Enter Project marks : ");
        project = sc.nextInt();
        System.out.println("Enter Internal marks : ");
        internal = sc.nextInt();
        System.out.println("Enter External marks : ");
        external = sc.nextInt();

        if (project < 50 && internal < 50 && external < 50) {
            if (project < 50) {
                System.out.println("You failed in Project with " + project + " marks");
            }
            if (internal < 50) {
                System.out.println("You failed in Internals " + internal + " marks");
            }
            if (external < 50) {
                System.out.println("You failed in External " + external + " marks");
            }
        } else {
            int projectGrade = 0, internalGrade = 0, externalGrade = 0;

            projectGrade = (70 * project) / 100;
            internalGrade = (10 * project) / 100;
            externalGrade = (20 * project) / 100;

            total = projectGrade + internalGrade + externalGrade;

            if (total >= 90) {
                grade = 'A';
            } else if (total >= 70 && total < 90) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            System.out.println("You were assigned grade " + grade);
        }
    }
}