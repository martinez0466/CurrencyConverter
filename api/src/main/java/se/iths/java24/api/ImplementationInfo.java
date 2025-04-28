package se.iths.java24.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ImplementationInfo {
    String value(); // Used to name the currency converter
}
