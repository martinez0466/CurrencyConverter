package se.iths.java24.implementation;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.util.Set;
import java.util.HashSet;
import java.util.ServiceLoader;

public class CurrencyConverterFactory {

    // Method to get the appropriate converter based on the name
    public static CurrencyConverter getConverter(String type) {
        // Load all implementations using SPI
        ServiceLoader<CurrencyConverter> serviceLoader = ServiceLoader.load(CurrencyConverter.class);

        for (CurrencyConverter converter : serviceLoader) {
            ImplementationInfo annotation = converter.getClass().getAnnotation(ImplementationInfo.class);
            if (annotation != null && annotation.value().equalsIgnoreCase(type)) {
                return converter;
            }
        }
        throw new IllegalArgumentException("Unsupported converter type: " + type);
    }

    // Method to get all available converters
    public static Set<String> getAllConverters() {
        Set<String> converters = new HashSet<>();
        ServiceLoader<CurrencyConverter> serviceLoader = ServiceLoader.load(CurrencyConverter.class);

        for (CurrencyConverter converter : serviceLoader) {
            ImplementationInfo annotation = converter.getClass().getAnnotation(ImplementationInfo.class);
            if (annotation != null) {
                converters.add(annotation.value());
            }
        }
        return converters;
    }
}
