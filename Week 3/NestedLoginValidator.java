public class NestedLoginValidator {
    public static void main(String[] args) {

        String enteredUsername = "hanahganda";
        String enteredPassword = "cuteko";
        boolean accountUnlocked = true;

        if (enteredUsername.equals("hanahaganda")) {

            if (enteredPassword.equals("cuteko")) {

                if (accountUnlocked) {
                    System.out.println("Login successful! Welcome, Hanah.");
                } else {
                    System.out.println("Login failed: Your account is locked.");
                }

            } else {
                System.out.println("Login failed: Incorrect password.");
            }

        } else {
            System.out.println("Login failed: Username not found.");
        }
    }
}
