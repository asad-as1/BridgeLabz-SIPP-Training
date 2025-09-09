import java.lang.reflect.Method;

class ProjectTasks {
    @Todo(task = "Implement login", assignedTo = "Asad")
    public void login() {}

    @Todo(task = "Fix logout bug", assignedTo = "Ali", priority = "HIGH")
    public void logout() {}

    public static void main(String[] args) throws Exception {
        for (Method method : ProjectTasks.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task() + ", Assigned: " + todo.assignedTo() + ", Priority: " + todo.priority());
            }
        }
    }
}
