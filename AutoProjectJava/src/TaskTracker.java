import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printHello();

        int menuPoint;
        Task[] tasks = new Task[10];
        int taskCount = 0;

        do {
            printMenu();
            menuPoint = scanner.nextInt();
            scanner.nextLine();

            switch (menuPoint) {
                case 1 -> {
                    tasks[taskCount] = enterTitleTask(scanner);
                    taskCount++;
                }
                case 2 -> enterDescriptionAndPriority(scanner, tasks[taskCount - 1]);
                case 0 -> enterExit();
                default -> incorrectMenu();
            }
        }
        while (menuPoint != 0);
        scanner.close();

        printInfoTask(tasks, taskCount);
    }

    public static void printHello() {
        System.out.println("Привет! Я таск-трэкер");
    }

    public static void printMenu() {
        System.out.print("Меню :\n1 - Ввести задачу;\n2 - Ввести информацию о задачах;\n0 - Выход\nВыберите действие: ");
    }

    public static Task enterTitleTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String titleTask = scanner.nextLine();
        return new Task(titleTask);
    }

    public static void enterDescriptionAndPriority(Scanner scanner, Task task) {
        System.out.print("Введите описание задачи: ");
        String descriptionTask = scanner.nextLine();

        System.out.print("Введите приоритет задачи: ");
        int priorityTask = scanner.nextInt();
        scanner.nextLine();

        task.setDescriptionTask(descriptionTask);
        task.setPriorityTask(priorityTask);
    }

    public static void enterExit() {
        System.out.println("Выход");
    }

    public static void incorrectMenu() {
        System.out.println("Неверный пункт меню");
    }

    public static void printInfoTask(Task[] tasks, int taskCount) {
        for (int i = 0; i < taskCount; i++) {
            System.out.printf("Задача: %s\nОписание: %s\nПриоритет: %d\n========\n",
                    tasks[i].getTitleTask(), tasks[i].getDescriptionTask(), tasks[i].getPriorityTask());
        }
    }
}
