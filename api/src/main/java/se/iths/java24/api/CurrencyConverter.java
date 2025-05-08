package se.iths.java24.api;

import java.util.Set;

public interface CurrencyConverter {
    // Returnerar en unik nyckel, t.ex. "CAD_TO_AUD"
    String getKey();

    // Dynamisk konvertering från en valuta till en annan
    double convert(String fromCurrency, String toCurrency, double amount);

    // Returnerar ett set av valutakoder denna konverterare hanterar
    Set<String> getAvailableCurrencies();
}
