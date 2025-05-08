// UsdToEurConverter.java
package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("USD_TO_EUR")
public class UsdToEurConverter implements CurrencyConverter {
    @Override
    public String getKey() {
        return "USD_TO_EUR";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) return amount * 0.92;
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("USD", "EUR");
    }
}
