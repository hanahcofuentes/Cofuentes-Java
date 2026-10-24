public class GradeThresholdChecker {
    public static void main(String[] args) {
      
        double averageGrade = 88.5;
        int absences = 4;

        boolean passed = (averageGrade >= 75 && absences <= 3)
                         || (averageGrade >= 90);

        System.out.println("=== STUDENT GRADE REPORT ===");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Number of Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("Reason: You met at least one of the passing conditions.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: You did not meet either passing condition.");
        }
    }
}
