package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void formatName() {
        String prefix = "Mr.";
        String firstName = "John";
        String lastName = "Doe";
        String expected = "Doe Mr. John";
        String actual = NameFormatter.formatName(prefix, firstName, lastName);
        assertEquals(expected, actual);
    }
}