public class Bug extends Issue {
    private Severity severity;
    private String stepsToReproduce;
    private String actualResult;
    private String expectedResult;

    public Bug(String title, String description, int priority, Status status,
               Severity severity, String stepsToReproduce,
               String actualResult, String expectedResult) {
        super(title, description, priority, status);
        this.severity = severity;
        this.stepsToReproduce = stepsToReproduce;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
    }

    public String messageBug() {
        return String.format("BUG/%s/%s/%d/%s/%s/%s/%s/%s",
                title, description, priority, status, severity, stepsToReproduce, actualResult, expectedResult);
    }

    @Override
    public void printInfoTask() {
        System.out.println(messageBug());
    }

    @Override
    public String getDataForFW() {
        return messageBug();
    }
}
