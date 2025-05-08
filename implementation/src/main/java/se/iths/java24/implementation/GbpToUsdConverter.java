// GbpToUsdConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("GBP_TO_USD")
public class GbpToUsdConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "GBP_TO_USD";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) return amount * 1.27;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("GBP", "USD");
    }
}
