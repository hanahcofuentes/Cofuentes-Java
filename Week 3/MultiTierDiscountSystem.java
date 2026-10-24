
public class MultiTierDiscountSystem {
    public static void main(String[] args) {

        double purchaseAmount = 2500.00;
        double discountRate;

        if (purchaseAmount >= 3000) {
            discountRate = 0.15;
        } else if (purchaseAmount >= 2000) {
            discountRate = 0.10;
        } else if (purchaseAmount >= 1000) {
            discountRate = 0.05;
        } else {
            discountRate = 0.00;
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("=== DISCOUNT SUMMARY ===");
        System.out.println("Purchase Amount: P" + purchaseAmount);
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: P" + discountAmount);
        System.out.println("Final Price: P" + finalPrice);
    }
}
