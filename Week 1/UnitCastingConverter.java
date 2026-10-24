public class UnitCastingConverter {
    public static void main(String[] args) {

        double measurement = 325.6;

        int meters = (int) (measurement / 100);
        double extraCm = measurement % 100;

        System.out.println("=== MEASUREMENT RESULT ===");
        System.out.println("Original Length: " + measurement + " cm");
        System.out.println("Length in Meters: " + meters);
        System.out.println("Unused Centimeters: " + extraCm);

        System.out.println();

        int wholeNum = 18;
        double decimalNum = wholeNum;

        System.out.println("=== AUTOMATIC CONVERSION ===");
        System.out.println("Starting Number: " + wholeNum);
        System.out.println("Converted Number: " + decimalNum);

        System.out.println();

        double priceValue = 92.75;
        int roundedValue = (int) priceValue;

        System.out.println("=== MANUAL CONVERSION ===");
        System.out.println("Decimal Number: " + priceValue);
        System.out.println("Integer Result: " + roundedValue);
    }
}
