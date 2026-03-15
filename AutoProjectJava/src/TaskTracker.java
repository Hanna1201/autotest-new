import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {

        System.out.println("Привет! Я таск-трэкер");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название задачи :");
        String titleTask = scanner.nextLine();

        System.out.print("Введите описание задачи :");
        String descriptionTask = scanner.nextLine();

        System.out.print("Введите приоритет задачи :");
        int priorityTask = scanner.nextInt();

        System.out.printf("Информация о задаче \nНазвание задачи: %s \nОписание задачи: %s \nПриоритет задачи: %d", titleTask, descriptionTask, priorityTask);

    }
}
