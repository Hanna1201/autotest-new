public class Story extends Issue  {
    private int storyPoints;
    private String acceptanceCriteria;

    public Story(String title, String description, int priority, Status status,
                 String acceptanceCriteria, int storyPoints) {
        super(title, description, priority, status);
        this.acceptanceCriteria = acceptanceCriteria;
        this.storyPoints = storyPoints;
    }

    @Override
    public void printInfoTask() {
        System.out.printf("Story %s, %s, %d, %s, %s, %d\n-------\n" ,
                title, description, priority, status, acceptanceCriteria, storyPoints);
    }

    @Override
    public String getDataForFW() {
        return String.format("Story %s, %s, %d, %s, %s, %d\n-------\n",
                title, description, priority, status, acceptanceCriteria, storyPoints);
    }
}
