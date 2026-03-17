import java.util.Scanner;

public class TaskForLecture4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Task1
        System.out.print("Please enter your score: ");
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
        scanner.nextLine();

        // Task 2
        String userInput = "";

        while (!userInput.trim().equalsIgnoreCase("exit")) {
            System.out.print("Please enter exit: ");
            userInput = scanner.nextLine();
        }
        System.out.println("Exit!");

        //Task 3
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= Math.abs(x); i++) {
            sum += i;
        }

        if (x < 0) {
            sum *= -1;
        }

        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
        scanner.close();
    }
}
