package ChibuzorAssignment;

import java.util.Scanner;

public class CreditCardValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Credit card prefixes
        String[] creditCardPrefixes = { "4", "5", "37", "6" };

        // Credit card names
        String[] creditCardNames = { "Visa", "MasterCard", "American Express", "Discover" };

        // Request credit card number
        System.out.print("Enter credit card number: ");
        String creditCardNumber = scanner.nextLine();

        // Check credit card type
        String creditCardType = "Unknown";
        for (int i = 0; i < creditCardPrefixes.length; i++) {
            if (creditCardNumber.startsWith(creditCardPrefixes[i])) {
                creditCardType = creditCardNames[i];
                break;
            }
        }

        // Check credit card validity
        boolean isValid = false;
        if (creditCardNumber.length() >= 13 && creditCardNumber.length() <= 16) {
            isValid = true;
        }

        // Print credit card type and validity
        System.out.println("Credit card type: " + creditCardType);
        System.out.println("Credit card is " + (isValid ? "valid" : "invalid"));
    }
}

