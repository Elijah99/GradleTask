package com.epam.task.gradle;

public class StringUtils {

    private final static String ZERO = "0.0";
    private final static String MINUS = "-";

    public static boolean isPositiveNumber(String str) {
        return  org.apache.commons.lang3.StringUtils.isNumeric(str) && (!str.equals(ZERO) && !str.startsWith(MINUS));
    }

}
