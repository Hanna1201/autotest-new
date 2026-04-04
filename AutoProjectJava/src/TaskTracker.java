import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Issue> issues = new ArrayList<>();
        int menuPoint;

        printHello();

        do {
            printMenu();
            menuPoint = scanner.nextInt();
            scanner.nextLine();

            switch (menuPoint) {
                case 1 -> enterTask(scanner, issues);
                case 2 -> printInfoTask(issues);
                case 0 -> enterExit();
                default -> incorrectPoint();
            }
        } while (menuPoint != 0);
        scanner.close();
    }

    public static void printHello() {
        System.out.println("Привет! Я таск-трэкер");
    }

    public static void printMenu() {
        System.out.print("Меню :\n1 - Ввести задачу;\n2 - Вывести информацию о задачах;\n0 - Выход\nВыберите действие: ");
    }

    public static void enterTask(Scanner scanner, ArrayList<Issue> issues) throws IOException {
        System.out.println("1 - Bug;\n2 - Story;\n3 - Task\nВведите тип задачи: ");
        int typeIssue = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите название задачи: ");
        String title = scanner.nextLine();

        System.out.print("Введите описание задачи: ");
        String description = scanner.nextLine();

        System.out.print("Введите приоритет задачи: ");
        int priority = scanner.nextInt();
        scanner.nextLine();

        Status status = readStatus(scanner);

        Issue issue = null;

        switch (typeIssue) {
            case 1 -> issue = createBug(scanner, title, description, priority, status);
            case 2 -> issue = createStory(scanner, title, description, priority, status);
            case 3 -> issue = createTask(scanner, title, description, priority, status);
            default -> incorrectPoint();
        }

        issues.add(issue);
        saveIssuesToFile(issues);
    }

    public static Status readStatus(Scanner scanner) {
        System.out.print("1 - TO_DO\n2 - IN_PROGRESS\n3 - DONE\nВыберите статус: ");

        int status = scanner.nextInt();
        scanner.nextLine();

        return switch (status) {
            case 1 -> Status.TO_DO;
            case 2 -> Status.IN_PROGRESS;
            case 3 -> Status.DONE;
            default -> Status.TO_DO;
        };
    }

    public static Bug createBug(Scanner scanner, String title, String description, int priority, Status status) {

        Severity severity = readSeverity(scanner);

        System.out.print("Введите шаги воспроизведения: ");
        String stepsToReproduce = scanner.nextLine();

        System.out.print("Введите фактический результат: ");
        String actualResult = scanner.nextLine();

        System.out.print("Введите ожидаемый результат: ");
        String expectedResult = scanner.nextLine();

        return new Bug(title, description, priority, status,
                severity, stepsToReproduce, actualResult, expectedResult);
    }

    public static Severity readSeverity(Scanner scanner) {
        System.out.print("1 - BLOCKER\n2 - MAJOR\n3 - MEDIUM\n4 - MINOR\nВыберите важность: ");

        int severity = scanner.nextInt();
        scanner.nextLine();

        return switch (severity) {
            case 1 -> Severity.BLOCKER;
            case 2 -> Severity.MAJOR;
            case 3 -> Severity.MEDIUM;
            case 4 -> Severity.MINOR;
            default -> Severity.MEDIUM;
        };
    }

    public static Story createStory(Scanner scanner, String title, String description, int priority, Status status) {
        System.out.print("Введите acceptance criteria: ");
        String acceptanceCriteria = scanner.nextLine();

        System.out.print("Введите story points: ");
        int storyPoints = scanner.nextInt();
        scanner.nextLine();

        return new Story(title, description, priority, status,
                acceptanceCriteria, storyPoints);
    }

    public static Task createTask(Scanner scanner, String title, String description, int priority, Status status) {
        System.out.print("Введите эстимацию в часах: ");
        int estimateHours = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите deadline: ");
        String deadline = scanner.nextLine();

        System.out.print("Введите компонент: ");
        String component = scanner.nextLine();

        return new Task(title, description, priority, status,
                estimateHours, deadline, component);
    }

    public static void enterExit() {
        System.out.println("Выход");
    }

    public static void incorrectPoint() {
        System.out.println("Выбран неверный пункт");
    }

    public static void saveIssuesToFile(ArrayList<Issue> issues) throws IOException {
        FileWriter file = new FileWriter("issues.txt", false);

        for (Issue issue : issues) {
            file.write(issue.getDataForFW());
        }
        file.close();
    }

    public static void printInfoTask(ArrayList<Issue> issues) {
        issues.stream().forEach(Issue::printInfoTask);
    }
}
