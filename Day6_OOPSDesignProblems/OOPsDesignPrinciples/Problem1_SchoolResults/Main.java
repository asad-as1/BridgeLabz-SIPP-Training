public class Main {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        System.out.println("Student: " + john.getName());
        john.getSubjects().forEach(s -> System.out.println("  " + s));
        double avg = GradeCalculator.calculateAverage(john);
        System.out.println(String.format("Average = %.2f", avg));
        System.out.println("Grade = " + GradeCalculator.calculateGrade(john));
    }
}
