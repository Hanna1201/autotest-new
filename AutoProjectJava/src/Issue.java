public abstract class Issue {
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

    public abstract String getDataForFW();

    public abstract void printInfoTask();
}
