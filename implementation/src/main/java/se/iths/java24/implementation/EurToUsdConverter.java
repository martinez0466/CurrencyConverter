package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("EUR_TO_USD")
public class EurToUsdConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "EUR_TO_USD";  // Unik identifierare för EUR till USD
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return amount * 1.1;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("EUR", "USD");  // Valutorna som denna konvertering stödjer
    }
}
