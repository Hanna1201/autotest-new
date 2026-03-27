public class Issue {
    protected String title;
    protected String description;
    protected int priority;

    public Issue(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitleTask() {
        return title;
    }

    public String getDescriptionTask() {
        return description;
    }

    public int getPriorityTask() {
        return priority;
    }
}
