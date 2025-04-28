package se.iths.java24.app;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.implementation.CurrencyConverterFactory;

import java.util.Scanner;
import java.util.Set;

public class ConsoleApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available converters
        Set<String> availableConverters = CurrencyConverterFactory.getAllConverters();
        System.out.println("Select a currency converter:");
        int index = 1;
        for (String converter : availableConverters) {
            System.out.println(index + ". " + converter);
            index++;
        }
        System.out.print("Enter your choice: ");

        String choice = scanner.nextLine().trim();
        CurrencyConverter converter = null;

        // Validate user input and fetch the selected converter
        try {
            String selectedConverter = (String) availableConverters.toArray()[Integer.parseInt(choice) - 1];
            converter = CurrencyConverterFactory.getConverter(selectedConverter);
        } catch (Exception e) {
            System.out.println("Invalid choice. Exiting application.");
            System.exit(1);
        }

        // Use the selected converter
        System.out.println("\nAvailable currencies: " + converter.getAvailableCurrencies());
        System.out.print("Enter source currency: ");
        String fromCurrency = scanner.nextLine().trim().toUpperCase();
        System.out.print("Enter target currency: ");
        String toCurrency = scanner.nextLine().trim().toUpperCase();
        System.out.print("Enter amount to convert: ");
        double amount;

        try {
            amount = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Exiting application.");
            return;
        }

        try {
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (UnsupportedOperationException e) {
            System.out.println("Conversion not supported: " + e.getMessage());
        }
    }
}
