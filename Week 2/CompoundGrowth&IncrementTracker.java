
public class CompoundGrowthTracker {
    public static void main(String[] args) {

        double balance = 1000.0;

        System.out.println("Starting Balance: " + balance);

        balance += 250.0;
        System.out.println("After adding 250: " + balance);

        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        balance += 150.0;
        System.out.println("After adding 150: " + balance);

        System.out.println();

        int count = 5;

        System.out.println("Postfix result: " + count++);
        System.out.println("Count after postfix: " + count);

        System.out.println();

        System.out.println("Prefix result: " + ++count);
        System.out.println("Count after prefix: " + count);

    }
}
