public abstract class Issue{
    protected String title;
    protected String description;
    protected int priority;
    protected Status status;

    public Issue(String title, String description, int priority, Status status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
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

    public Status getStatus() {
        return status;
    }

    public abstract String getDataForFW();
    public abstract void printInfoTask();
}
