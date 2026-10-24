class Student {
    String name;
    int[] quizzes;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }

    double getAverage() {
        int total = 0;

        for (int score : quizzes) {
            total += score;
        }

        return (double) total / quizzes.length;
    }
}

public class ClassRankingSystem {
    public static void main(String[] args) {

        String[] names = {"Hanah", "Maria", "Tala", "Kae", "Jhon"};

        int[][] quizData = {
            {90, 85, 88, 92},
            {95, 90, 93, 94},
            {85, 80, 87, 88},
            {95, 90, 93, 94},
            {78, 82, 80, 85}
        };
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].getAverage() <
                    students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
      
        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s%n",
                          "Rank", "Name", "Average");
        System.out.println("---------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                students[i].getAverage() !=
                students[i - 1].getAverage()) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                              rank,
                              students[i].name,
                              students[i].getAverage());
        }
      
        String searchName = "Hanah";
        int foundRank = linearSearchRank(students, searchName);

        System.out.println("\n========== STUDENT SEARCH ==========");

        if (foundRank != -1) {
            System.out.println(searchName + "'s rank: " + foundRank);
        } else {
            System.out.println(searchName + " was not found.");
        }
    }
  
    static int linearSearchRank(Student[] students, String name) {
        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                students[i].getAverage() !=
                students[i - 1].getAverage()) {
                rank = i + 1;
            }

            if (students[i].name.equalsIgnoreCase(name)) {
                return rank;
            }
        }

        return -1;
    }
}
