import java.lang.reflect.Method;

class BugTracker {
    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    public void testMethod() {}

    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("testMethod");
        BugReport[] reports = method.getAnnotationsByType(BugReport.class);
        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
