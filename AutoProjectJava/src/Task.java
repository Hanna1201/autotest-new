public class Task {

    private String titleTask;
    private String descriptionTask;
    private int priorityTask;

    public Task(String titleTask) {
        this.titleTask = titleTask;
    }

    public String getTitleTask(){
        return titleTask;
    }

    public String getDescriptionTask(){
        return descriptionTask;
    }

    public int getPriorityTask(){
        return priorityTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public void setPriorityTask(int priorityTask) {
        this.priorityTask = priorityTask;
    }

//    public Task(String titleTask, String descriptionTask, int priorityTask) {
//        this.titleTask = titleTask;
//        this.descriptionTask = descriptionTask;
//        this.priorityTask = priorityTask;
//    }
}
