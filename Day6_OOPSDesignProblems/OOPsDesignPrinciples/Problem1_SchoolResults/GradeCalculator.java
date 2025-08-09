public class GradeCalculator {

    public static double calculateAverage(Student s) {
        return s.getSubjects().stream()
                .mapToDouble(Subject::getMarks)
                .average()
                .orElse(0.0);
    }

    public static String calculateGrade(Student s) {
        double avg = calculateAverage(s);
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        if (avg >= 50) return "D";
        return "F";
    }
}
