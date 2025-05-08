package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;

@ImplementationInfo("USD_TO_JPY")
public class UsdToJpyConverter implements CurrencyConverter {

    @Override
    public String getKey() {
        return "USD_TO_JPY";  // Unik identifierare för USD till JPY
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
            return amount * 110.0;  // Exempel på konverteringslogik
        }
        throw new UnsupportedOperationException("Conversion not supported for " + fromCurrency + " to " + toCurrency);
    }

    @Override
    public Set<String> getAvailableCurrencies() {
        return Set.of("USD", "JPY");  // Valutorna som denna konvertering stödjer
    }
}
