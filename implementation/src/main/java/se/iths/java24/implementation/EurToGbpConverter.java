package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("EUR_TO_GBP")
public class EurToGbpConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "EUR_TO_GBP";  // Unik identifierare för EUR till GBP
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            return amount * 0.85;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("EUR", "GBP");  // Valutorna som denna konvertering stödjer
    }
}
