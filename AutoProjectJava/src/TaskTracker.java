import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printHello();

        int menuPoint;
        Task[] tasks = new Task[10];
        int taskCount = 0;
        String titleTask = "";

        do {
            printMenu();
            menuPoint = scanner.nextInt();
            scanner.nextLine();

            switch (menuPoint) {
                case 1 -> titleTask = enterTitleTask(scanner);
                case 2 -> {
                    enterDescriptionAndPriority(scanner, tasks, taskCount, titleTask);
                    taskCount++;
                }
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

    public static String enterTitleTask(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        return scanner.nextLine();
    }

    public static void enterDescriptionAndPriority(Scanner scanner, Task[] tasks, int taskCount, String titleTask) {
        System.out.print("Введите описание задачи: ");
        String descriptionTask = scanner.nextLine();

        System.out.print("Введите приоритет задачи: ");
        int priorityTask = scanner.nextInt();
        scanner.nextLine();

        tasks[taskCount] = new Task(titleTask, descriptionTask, priorityTask);
    }

    public static void enterExit() {
        System.out.println("Выход");
    }

    public static void incorrectMenu() {
        System.out.println("Неверный пункт меню");
    }

    public static void printInfoTask(Task[] tasks, int taskCount) {
        for (int i = 0; i < taskCount; i++) {
            System.out.printf("Задача: %s\nОписание: %s\nПриоритет: %d\n--------\n",
                    tasks[i].getTitleTask(), tasks[i].getDescriptionTask(), tasks[i].getPriorityTask());
        }
    }
}
