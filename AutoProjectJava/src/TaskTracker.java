import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task[] tasks = new Task[10];
        int menuPoint;
        int taskCount = 0;

        printHello();

        do {
            printMenu();
            menuPoint = scanner.nextInt();
            scanner.nextLine();

            switch (menuPoint) {
                case 1 -> {
                    enterTask(scanner, tasks, taskCount);
                    taskCount++;
                }
                case 2 -> printInfoTask(tasks, taskCount);
                case 0 -> enterExit();
                default -> incorrectMenu();
            }
        }
        while (menuPoint != 0);
        scanner.close();
    }

    public static void printHello() {
        System.out.println("Привет! Я таск-трэкер");
    }

    public static void printMenu() {
        System.out.print("Меню :\n1 - Ввести задачу;\n2 - Вывести информацию о задачах;\n0 - Выход\nВыберите действие: ");
    }

    public static void enterTask(Scanner scanner, Task[] tasks, int taskCount) {
        System.out.print("Введите название задачи: ");
        String titleTask = scanner.nextLine();

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