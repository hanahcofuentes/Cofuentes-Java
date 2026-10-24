
import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondValue = scanner.nextInt();

        System.out.println("\n=== CALCULATION SUMMARY ===");

        System.out.println("Sum: " + (firstValue + secondValue));
        System.out.println("Difference: " + (firstValue - secondValue));
        System.out.println("Product: " + (firstValue * secondValue));

        if (secondValue != 0) {
            System.out.println("Quotient: " + (firstValue / secondValue));
            System.out.println("Remainder: " + (firstValue % secondValue));
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
            System.out.println("Remainder: Cannot calculate modulo by zero.");
        }
        scanner.close();
    }
}
