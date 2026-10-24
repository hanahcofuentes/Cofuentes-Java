
public class ATMTransactionAuthorizer {
    public static void main(String[] args) {
      
        String username = "hanah123";
        int pin = 2468;
        double balance = 12000.00;
        double withdrawal = 3000.00;

        if (username.equals("hanah123")) {
            if (pin >= 1000 && pin <= 9999 && pin == 2468) {

                String tier;

                if (balance < 5000) {
                    tier = "Bronze";
                } else if (balance < 15000) {
                    tier = "Silver";
                } else if (balance < 30000) {
                    tier = "Gold";
                } else {
                    tier = "Platinum";
                }

                double dailyLimit;

                if (tier.equals("Bronze")) {
                    dailyLimit = 2000;
                } else if (tier.equals("Silver")) {
                    dailyLimit = 5000;
                } else if (tier.equals("Gold")) {
                    dailyLimit = 10000;
                } else {
                    dailyLimit = 20000;
                }

                double feeRate;

                switch (tier) {
                    case "Bronze":
                        feeRate = 0.02;
                        break;
                    case "Silver":
                        feeRate = 0.015;
                        break;
                    case "Gold":
                        feeRate = 0.01;
                        break;
                    case "Platinum":
                        feeRate = 0.005;
                        break;
                    default:
                        feeRate = 0.03;
                }

                double fee = withdrawal * feeRate;
                double totalDeduction = withdrawal + fee;

                System.out.println("=== ATM TRANSACTION ===");
                System.out.println("Account Tier: " + tier);
                System.out.println("Current Balance: P" + balance);
                System.out.println("Withdrawal Amount: P" + withdrawal);
                System.out.println("Transaction Fee: P" + fee);

                if (withdrawal <= 0) {
                    System.out.println("DENIED: Withdrawal amount must be greater than zero.");
                } else if (withdrawal > dailyLimit) {
                    System.out.println("DENIED: Withdrawal exceeds your tier's daily limit.");
                } else if (totalDeduction > balance) {
                    System.out.println("DENIED: Insufficient balance to cover withdrawal and fee.");
                } else {
                    System.out.println("APPROVED: Please collect your cash.");
                    System.out.println("Remaining Balance: P" + (balance - totalDeduction));
                }

            } else {
                System.out.println("DENIED: Incorrect PIN. Enter a valid 4-digit PIN.");
            }
        } else {
            System.out.println("DENIED: Username not recognized.");
        }
    }
}
