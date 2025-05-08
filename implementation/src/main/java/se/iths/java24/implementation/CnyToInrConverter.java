// CnyToInrConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("CNY_TO_INR")
public class CnyToInrConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "CNY_TO_INR";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("CNY") && toCurrency.equals("INR")) return amount * 11.5;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("CNY", "INR");
    }
}
