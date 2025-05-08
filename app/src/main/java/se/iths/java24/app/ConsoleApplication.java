package se.iths.java24.app;

import se.iths.java24.api.CurrencyConverter;

import java.util.Scanner;
import java.util.Set;

public class ConsoleApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hämta tillgängliga konverterare
        Set<String> availableConverters = CurrencyConverterFactory.getAllConverters();
        if (availableConverters.isEmpty()) {
            System.out.println("No currency converters available.");
            return;
        }

        // Lista tillgängliga alternativ
        System.out.println("Select a currency converter:");
        int index = 1;
        for (String converter : availableConverters) {
            System.out.println(index + ". " + converter);
            index++;
        }

        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine().trim();

        CurrencyConverter converter;
        try {
            int selectedIndex = Integer.parseInt(choice) - 1;
            String selectedKey = availableConverters.toArray(new String[0])[selectedIndex];
            converter = CurrencyConverterFactory.getConverter(selectedKey);
            if (converter == null) throw new IllegalArgumentException("Converter not found.");
        } catch (Exception e) {
            System.out.println("Invalid choice. Exiting application.");
            return;
        }

        Set<String> supportedCurrencies = converter.getAvailableCurrencies();

        System.out.print("Enter FROM currency (e.g., USD): ");
        String fromCurrency = scanner.nextLine().trim().toUpperCase();
        if (!supportedCurrencies.contains(fromCurrency)) {
            System.out.println("FROM currency not supported by this converter.");
            return;
        }

        System.out.print("Enter TO currency (e.g., EUR): ");
        String toCurrency = scanner.nextLine().trim().toUpperCase();
        if (!supportedCurrencies.contains(toCurrency)) {
            System.out.println("TO currency not supported by this converter.");
            return;
        }

        System.out.print("Enter amount to convert: ");
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount.");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
