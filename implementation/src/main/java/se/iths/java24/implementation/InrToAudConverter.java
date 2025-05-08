// InrToAudConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("INR_TO_AUD")
public class InrToAudConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "INR_TO_AUD";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("INR") && toCurrency.equals("AUD")) return amount * 0.018;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("INR", "AUD");
    }
}
