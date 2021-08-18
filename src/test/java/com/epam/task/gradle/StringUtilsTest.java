package com.epam.task.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void testIsPositiveNumberShouldReturnTrueWhenNumberPositive() {
        assertTrue(StringUtils.isPositiveNumber("11"));
    }

    @Test
    void testIsPositiveNumberShouldReturnFalseWhenNumbersNegative() {
        assertFalse(StringUtils.isPositiveNumber("-12"));
    }

    @Test
    void testIsPositiveNumberShouldReturnTrueWhenNumberNull() {
        assertTrue(StringUtils.isPositiveNumber("0"));
    }

    @Test
    void testIsPositiveNumberShouldFalseTrueWhenInputString() {
        assertFalse(StringUtils.isPositiveNumber("some string"));
    }

    @Test
    void testIsPositiveNumberShouldFalseTrueWhenInputEmpty() {
        assertFalse(StringUtils.isPositiveNumber(""));
    }

}
