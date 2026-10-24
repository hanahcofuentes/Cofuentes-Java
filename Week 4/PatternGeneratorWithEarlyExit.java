public class PatternGenerator {
    public static void main(String[] args) {

        int size = 5;

        System.out.println("=== PATTERN GENERATOR ===");

        for (int row = 1; row <= size; row++) {

            if (row == 3) {
                continue;
            }

            for (int column = 1; column <= row; column++) {

                if (column == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
