public class Story extends Issue {
    private int storyPoints;
    private String acceptanceCriteria;

    public Story(String title, String description, int priority, Status status,
                 String acceptanceCriteria, int storyPoints) {
        super(title, description, priority, status);
        this.acceptanceCriteria = acceptanceCriteria;
        this.storyPoints = storyPoints;
    }

    public String messageStory() {
        return String.format("STORY/%s/%s/%d/%s/%s/%d",
                title, description, priority, status, acceptanceCriteria, storyPoints);
    }

    @Override
    public void printInfoTask() {
        System.out.println(messageStory());
    }

    @Override
    public String getDataForFW() {
        return messageStory();
    }
}
