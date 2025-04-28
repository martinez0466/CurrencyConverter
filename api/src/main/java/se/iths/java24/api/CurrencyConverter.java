package se.iths.java24.api;

import java.util.Set;

public interface CurrencyConverter {
    double convert(String fromCurrency, String toCurrency, double amount) throws UnsupportedOperationException;
    Set<String> getAvailableCurrencies();
}
