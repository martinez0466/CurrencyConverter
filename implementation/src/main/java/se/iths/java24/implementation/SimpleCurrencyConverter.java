package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;
import java.util.HashSet;

@ImplementationInfo("Simple Currency Converter")
public class SimpleCurrencyConverter implements CurrencyConverter {

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        // Adding AUD to SEK conversion
        if (fromCurrency.equals("USD") && toCurrency.equals("SEK")) {
            return amount * 10;
        } else if (fromCurrency.equals("SEK") && toCurrency.equals("USD")) {
            return amount / 10;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return amount * 1.1;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("SEK")) {
            return amount * 12;
        } else if (fromCurrency.equals("AUD") && toCurrency.equals("SEK")) {
            return amount * 6.5; // Example conversion rate from AUD to SEK
        } else if (fromCurrency.equals("SEK") && toCurrency.equals("AUD")) {
            return amount / 6.5; // Example conversion rate from SEK to AUD
        } else {
            throw new UnsupportedOperationException("Conversion not supported for the given currencies");
        }
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        Set<String> currencies = new HashSet<>();
        currencies.add("USD");
        currencies.add("SEK");
        currencies.add("EUR");
        currencies.add("GBP");
        currencies.add("JPY");
        currencies.add("AUD"); // Adding AUD to the list of available currencies
        return currencies;
    }
}
