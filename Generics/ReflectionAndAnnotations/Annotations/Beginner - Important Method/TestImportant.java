import java.lang.reflect.Method;

class TestImportant {
    @ImportantMethod
    public void criticalTask() {}

    @ImportantMethod(level = "MEDIUM")
    public void normalTask() {}

    public static void main(String[] args) throws Exception {
        for (Method method : TestImportant.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " importance: " + im.level());
            }
        }
    }
}
