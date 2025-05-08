package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("INR_TO_JPY")
public class InrToJpyConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "INR_TO_JPY";  // Unik identifierare för INR till JPY
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("INR") && toCurrency.equals("JPY")) {
            return amount * 1.53;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("INR", "JPY");  // Valutorna som denna konvertering stödjer
    }
}
