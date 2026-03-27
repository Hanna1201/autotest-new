public class Bug extends Issue {
    private String severity;
    private String stepsToReproduce;
    private String actualResult;
    private String expectedResult;

    public Bug(String title, String description, int priority,
               String severity, String stepsToReproduce,
               String actualResult, String expectedResult) {
        super(title, description, priority);
        this.severity = severity;
        this.stepsToReproduce = stepsToReproduce;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
    }
}
