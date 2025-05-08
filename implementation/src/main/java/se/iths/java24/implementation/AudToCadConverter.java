package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("AUD_TO_CAD")
public class AudToCadConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "AUD_TO_CAD";  // Unik identifierare för AUD till CAD
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("AUD") && toCurrency.equals("CAD")) {
            return amount * 0.93;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("AUD", "CAD");  // Valutorna som denna konvertering stödjer
    }
}
