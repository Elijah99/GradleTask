package com.epam.task.gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    void testShouldReturnTrueWhenNumberPositive() {
        assertTrue(StringUtils.isPositiveNumber("11"));

    }

}
