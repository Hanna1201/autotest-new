public class Story extends Issue {
    private int storyPoints;
    private String acceptanceCriteria;

    public Story(String title, String description, int priority,
                 String acceptanceCriteria, int storyPoints) {
        super(title, description, priority);
        this.acceptanceCriteria = acceptanceCriteria;
        this.storyPoints = storyPoints;
    }
}
