import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void addSubject(Subject s) { subjects.add(s); }
    public List<Subject> getSubjects() { return subjects; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', subjects=" + subjects + "}";
    }
}
