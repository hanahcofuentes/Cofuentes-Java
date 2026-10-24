import java.util.Scanner;

public class SumUntilSentinel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.println("=== SUM CALCULATOR ===");
        System.out.println("Enter integers to add.");
        System.out.println("Enter -1 to stop.");

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while (number != -1) {
            total += number;

            System.out.print("Enter another number: ");
            number = scanner.nextInt();
        }

        System.out.println("Final Sum: " + total);

        scanner.close();
    }
}
