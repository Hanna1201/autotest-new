public class Task {

    private String titleTask;
    private String descriptionTask;
    private int priorityTask;

    public Task(String titleTask, String descriptionTask, int priorityTask) {
        this.titleTask = titleTask;
        this.descriptionTask = descriptionTask;
        this.priorityTask = priorityTask;
    }

    public String getTitleTask() {
        return titleTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public int getPriorityTask() {
        return priorityTask;
    }
}
