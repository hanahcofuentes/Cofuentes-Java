
public class ShoppingCalculator {
    public static void main(String[] args) {

        String storeName = "Hanah's Mini Mart";
        int quantity = 5;
        double unitPrice = 89.50;

        double totalCost = quantity * unitPrice;

        System.out.println("=== SHOPPING SUMMARY ===");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: P" + unitPrice);
        System.out.println("Total Cost: P" + totalCost);
    }
}
