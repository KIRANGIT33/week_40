import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Please enter a password: ");
            password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Password is valid.");
                break; // Exit the loop if the password is valid
            } else {
                System.out.println("Password is invalid. Needs to be at least 8 characters long, include at least one uppercase letter, one lowercase letter, and one digit.");
            }
        }

        scanner.close();
    }

    /**
     * Validates the password based on specified criteria.
     *
     * @param password the password to validate
     * @return true if the password meets all criteria, false otherwise
     */
    public static boolean isValidPassword(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        // Flags for character types
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        // Check for character types
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Return true if all conditions are met
        return hasUppercase && hasLowercase && hasDigit;
    }
}