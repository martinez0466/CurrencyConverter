package se.iths.java24.api.util;

import se.iths.java24.api.CurrencyConverter;
import se.iths.java24.api.ImplementationInfo;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class AnnotationScanner {

    // Metod för att hämta alla implementeringar som har ImplementationInfo-annotation
    public static List<String> getImplementationNames() {
        List<String> implementationNames = new ArrayList<>();

        // Använd ServiceLoader för att hitta alla implementeringar av CurrencyConverter
        ServiceLoader<CurrencyConverter> serviceLoader = ServiceLoader.load(CurrencyConverter.class);

        for (CurrencyConverter converter : serviceLoader) {
            // Hämta annotationen från varje implementation
            Annotation[] annotations = converter.getClass().getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof ImplementationInfo) {
                    ImplementationInfo implementationInfo = (ImplementationInfo) annotation;
                    implementationNames.add(implementationInfo.value()); // Lägg till namnet på implementationen
                }
            }
        }

        return implementationNames;
    }
}
