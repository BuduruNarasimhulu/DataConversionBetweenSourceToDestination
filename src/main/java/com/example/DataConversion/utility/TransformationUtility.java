package com.example.DataConversion.utility;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class TransformationUtility {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter CUSTOM_DATE_FORMATTER = DateTimeFormatter.ofPattern("M/d/yyyy");

    public String formatDate(LocalDate date) {

        return date != null ? date.format(DATE_FORMATTER) : null;
    }

    public String formatCustomDate(LocalDate date) {

        return date != null ? date.format(CUSTOM_DATE_FORMATTER) : null;
    }

    public String formatCurrency(double value) {

        return String.format("%.2f", value);
    }

    public String handleNull(String value) {

        return value != null ? value : "";
    }

    public String booleanToString(boolean value) {

        return Boolean.toString(value);
    }

    public String concatenate(String... values) {
        StringBuilder result = new StringBuilder();
        for (String value : values) {
            if (value != null && !value.trim().isEmpty()) {
                result.append(value).append(", ");
            }
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2); // remove the last ", "
        }
        return result.toString();
    }

}
