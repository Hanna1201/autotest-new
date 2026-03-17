import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {

        System.out.println("Привет! Я таск-трэкер");

        Scanner scanner = new Scanner(System.in);
        int menuPoint;
        String[][] arrayTasks = new String[10][3];
        int taskCount = 0;

        do {
            System.out.print("Меню : \n1 - Ввести задачу; \n2 - Ввести информацию о задачах; \n0 - Выход \nВыберите действие: ");
            menuPoint = scanner.nextInt();
            scanner.nextLine();

            switch (menuPoint) {
                case 1:
                    System.out.print("Введите название задачи: ");
                    String titleTask = scanner.nextLine();
                    arrayTasks[taskCount][0] = titleTask;
                    taskCount++;
                    break;
                case 2:
                    System.out.print("Введите описание задачи: ");
                    String descriptionTask = scanner.nextLine();

                    System.out.print("Введите приоритет задачи: ");
                    int priorityTask = scanner.nextInt();
                    scanner.nextLine();

                    arrayTasks[taskCount-1][1] = descriptionTask;
                    arrayTasks[taskCount-1][2] = String.valueOf(priorityTask);
                    break;
                case 0:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный пункт меню");
            }
        }
        while (menuPoint != 0);
        scanner.close();

        for (int i = 0; i < arrayTasks.length; i++) {
            for (int j = 0; j < arrayTasks[0].length; j++) {
                System.out.println(arrayTasks[i][j]);
            }
            System.out.println();
        }
    }
}
