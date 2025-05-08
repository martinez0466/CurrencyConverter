// SekToNokConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("SEK_TO_NOK")
public class SekToNokConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "SEK_TO_NOK";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("SEK") && toCurrency.equals("NOK")) return amount * 1.02;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("SEK", "NOK");
    }
}
