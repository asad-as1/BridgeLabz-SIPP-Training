import java.lang.reflect.Method;

class TaskManager {
    @TaskInfo(priority = "HIGH", assignedTo = "Asad")
    public void completeTask() {
        System.out.println("Task completed");
    }

    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo info = method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}
