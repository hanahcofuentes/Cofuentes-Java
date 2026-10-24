import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {

        int[] scores = {85, 92, 78, 88, 95, 76, 89, 81};
      
        int target = 88;
        int foundIndex = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("=== LINEAR SEARCH ===");

        if (foundIndex != -1) {
            System.out.println("Target score: " + target);
            System.out.println("Result: Found at index " + foundIndex);
        } else {
            System.out.println("Score " + target + " was not found.");
        }
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("\n=== ARRAY COMPARISON ===");
        System.out.println("Original Scores: " + Arrays.toString(scores));
        System.out.println("Sorted Scores:   " + Arrays.toString(sortedScores));
    }
}
