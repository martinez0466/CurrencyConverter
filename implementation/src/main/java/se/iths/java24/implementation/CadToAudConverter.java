package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("CAD_TO_AUD")
public class CadToAudConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "CAD_TO_AUD";
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("CAD") && toCurrency.equals("AUD")) {
            return amount * 1.07;
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("CAD", "AUD");
    }
}
