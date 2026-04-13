public class Task extends Issue {

    private int estimateHours;
    private String deadline;
    private String component;

    public Task(String title, String description, int priority, Status status, int estimateHours, String deadline, String component) {
        super(title, description, priority, status);
        this.estimateHours = estimateHours;
        this.deadline = deadline;
        this.component = component;
    }

    public String messageTask() {
        return String.format("TASK/%s/%s/%d/%s/%d/%s/%s",
                title, description, priority, status, estimateHours, deadline, component);
    }

    @Override
    public void printInfoTask() {
        System.out.println(messageTask());
    }

    @Override
    public String getDataForFW() {
        return messageTask();
    }
}
