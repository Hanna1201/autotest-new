import java.util.Scanner;

public class Task1ForLecture4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your score: ");
        int score = scanner.nextInt();

        while (score < 0 || score > 100) {
            System.out.println("Incorrect value was entered");
            System.out.print("Please enter your score: ");
            score = scanner.nextInt();
        }

        if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");
        } else if (score >= 60) {
            System.out.println("Your grade is D!");
        } else if (score >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }
    }
}
