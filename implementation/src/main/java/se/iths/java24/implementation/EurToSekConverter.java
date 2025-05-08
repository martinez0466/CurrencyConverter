// EurToSekConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("EUR_TO_SEK")
public class EurToSekConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "EUR_TO_SEK";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("SEK")) return amount * 11.2;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("EUR", "SEK");
    }
}
