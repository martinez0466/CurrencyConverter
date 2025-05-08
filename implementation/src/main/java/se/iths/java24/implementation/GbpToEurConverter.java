package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("GBP_TO_EUR")
public class GbpToEurConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "GBP_TO_EUR";  // Unik identifierare för GBP till EUR
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            return amount * 1.18;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("GBP", "EUR");  // Valutorna som denna konvertering stödjer
    }
}
