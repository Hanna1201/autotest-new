import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Issue[] issues = new Issue[10];
        int menuPoint;
        int taskCount = 0;

        printHello();

        do {
            printMenu();
            menuPoint = scanner.nextInt();
            scanner.nextLine();

            switch (menuPoint) {
                case 1 -> {
                    enterTask(scanner, issues, taskCount);
                    taskCount++;
                }
                case 2 -> printInfoTask(issues, taskCount);
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

    public static void enterTask(Scanner scanner, Issue[] issues, int taskCount) {
        System.out.print("Введите название задачи: ");
        String title = scanner.nextLine();

        System.out.print("Введите описание задачи: ");
        String description = scanner.nextLine();

        System.out.print("Введите приоритет задачи: ");
        int priority = scanner.nextInt();
        scanner.nextLine();

        issues[taskCount] = new Issue(title, description, priority);
    }

    public static void enterExit() {
        System.out.println("Выход");
    }

    public static void incorrectMenu() {
        System.out.println("Неверный пункт меню");
    }

    public static void printInfoTask(Issue[] issues, int taskCount) {
        for (int i = 0; i < taskCount; i++) {
            System.out.printf("Задача: %s\nОписание: %s\nПриоритет: %d\n--------\n",
                    issues[i].getTitleTask(), issues[i].getDescriptionTask(), issues[i].getPriorityTask());
        }
    }
}