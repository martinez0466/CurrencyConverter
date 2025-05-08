package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("CNY_TO_EUR")
public class CnyToEurConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "CNY_TO_EUR";  // Unik identifierare för CNY till EUR
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("CNY") && toCurrency.equals("EUR")) {
            return amount * 0.13;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("CNY", "EUR");  // Valutorna som denna konvertering stödjer
    }
}
