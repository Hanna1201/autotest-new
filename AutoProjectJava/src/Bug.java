public class Bug extends Issue {
    private String severity;
    private String stepsToReproduce;
    private String actualResult;
    private String expectedResult;

    public Bug(String title, String description, int priority, Status status,
               String severity, String stepsToReproduce,
               String actualResult, String expectedResult) {
        super(title, description, priority, status);
        this.severity = severity;
        this.stepsToReproduce = stepsToReproduce;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
    }

    @Override
    public void printInfoTask() {
        System.out.printf("BUG, %s, %s, %d, %s, %s, %s, %s, %s\n-------\n",
                title, description, priority, status, severity, stepsToReproduce, actualResult, expectedResult);
    }

    @Override
    public String getDataForFW() {
        return String.format("BUG, %s, %s, %d, %s, %s, %s, %s, %s\n-------\n",
                title, description, priority, status, severity, stepsToReproduce, actualResult, expectedResult);
    }

}
