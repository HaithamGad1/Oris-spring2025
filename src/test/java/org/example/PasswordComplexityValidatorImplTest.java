package org.example;

import org.example.validation.impl.PasswordComplexityValidatorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordComplexityValidatorImplTest {

    private final PasswordComplexityValidatorImpl validator = new PasswordComplexityValidatorImpl();

    @Test
    void testValidPassword() {
        assertTrue(validator.validate("Password123"));
    }

    @Test
    void testPasswordWithoutUpperCase() {
        assertFalse(validator.validate("password123"));
    }

    @Test
    void testPasswordWithoutLowerCase() {
        assertFalse(validator.validate("PASSWORD123"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(validator.validate("Password"));
    }

    @Test
    void testShortPassword() {
        assertFalse(validator.validate("Pass1"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.validate(null));
    }
}