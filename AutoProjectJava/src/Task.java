public class Task extends Issue {

    private int estimateHours;
    private String deadline;
    private String component;

    public Task(String title, String description, int priority, int estimateHours, String deadline, String component) {
        super(title, description, priority);
        this.estimateHours = estimateHours;
        this.deadline = deadline;
        this.component = component;
    }
}
