
import java.util.Scanner;

public class WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] warehouse = {
            {15, 8, 20},
            {5, -1, 12},
            {3, 18, 7}
        };

        int choice;
      
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Calculate Total Stock");
            System.out.println("3. Find Critically Low Shelf");
            System.out.println("4. Restock a Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                input.next();
            }
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nWarehouse Shelf Counts:");

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {
                            if (warehouse[row][col] == -1) {
                                System.out.print("[DAMAGED] ");
                            } else {
                                System.out.print(warehouse[row][col] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {
                            if (warehouse[row][col] == -1) {
                                continue;
                            }
                            total += warehouse[row][col];
                        }
                    }

                    System.out.println("Total Available Inventory: " + total);
                    break;

                case 3:
                    boolean found = false;
                    int lowRow = -1;
                    int lowCol = -1;

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {
                            if (warehouse[row][col] == -1) {
                                continue; 
                            }

                            if (warehouse[row][col] < 5) {
                                lowRow = row;
                                lowCol = col;
                                found = true;
                                break; 
                            }
                        }

                        if (found) {
                            break; 
                        }
                    }

                    if (found) {
                        System.out.println("Critically low shelf found!");
                        System.out.println("Row: " + (lowRow + 1));
                        System.out.println("Column: " + (lowCol + 1));
                        System.out.println("Stock: " + warehouse[lowRow][lowCol]);
                    } else {
                        System.out.println("No critically low shelves found.");
                    }
                    break;

                case 4:
                    restockShelf(warehouse, input);
                    break;

                case 5:
                    System.out.println("Exiting inventory system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 to 5.");
            }

        } while (choice != 5);

        input.close();
    }

    public static void restockShelf(int[][] warehouse, Scanner input) {
        int row, col, amount;

        while (true) {
            System.out.print("Enter shelf row (1-" + warehouse.length + "): ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                input.next();
                continue;
            }
            row = input.nextInt();

            System.out.print("Enter shelf column (1-" + warehouse[0].length + "): ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                input.next();
                continue;
            }
            col = input.nextInt();

            if (row < 1 || row > warehouse.length ||
                col < 1 || col > warehouse[row - 1].length) {
                System.out.println("Invalid shelf position. Try again.");
                continue;
            }
          
            if (warehouse[row - 1][col - 1] == -1) {
                System.out.println("That shelf is damaged. Choose another shelf.");
                continue;
            }

            System.out.print("Enter quantity to add: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Enter a positive whole number.");
                input.next();
                continue;
            }
            amount = input.nextInt();

            if (amount <= 0) {
                System.out.println("Quantity must be greater than zero.");
                continue;
            }

            warehouse[row - 1][col - 1] += amount;

            System.out.println("Restocking successful!");
            System.out.println("Updated stock: " + warehouse[row - 1][col - 1]);

            return; 
        }
    }
}
