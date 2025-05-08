package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("JPY_TO_CNY")
public class JpyToCnyConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "JPY_TO_CNY";  // Unik identifierare för JPY till CNY
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("JPY") && toCurrency.equals("CNY")) {
            return amount * 0.063;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("JPY", "CNY");  // Valutorna som denna konvertering stödjer
    }
}
