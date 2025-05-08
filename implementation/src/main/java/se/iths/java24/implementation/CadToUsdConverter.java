// CadToUsdConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("CAD_TO_USD")
public class CadToUsdConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "CAD_TO_USD";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("CAD") && toCurrency.equals("USD")) return amount * 0.74;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("CAD", "USD");
    }
}
