public class NumberSquarePrinter {
    public static void main(String[] args) {

        int limit = 10;

        System.out.println("=== NUMBER AND SQUARE LIST ===");

        for (int number = 1; number <= limit; number++) {
            int square = number * number;

            System.out.println("Number: " + number + " | Square: " + square);
        }
    }
}
