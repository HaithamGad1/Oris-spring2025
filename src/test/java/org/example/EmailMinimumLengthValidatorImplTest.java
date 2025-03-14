package org.example;

import org.example.validation.impl.EmailMinimumLengthValidatorImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailMinimumLengthValidatorImplTest {

    private static EmailMinimumLengthValidatorImpl validator;

    @BeforeAll
    static void beforeAll() {
        validator = new EmailMinimumLengthValidatorImpl(5);
    }

    @Test
    void testLongEmail() {
        assertDoesNotThrow(() -> validator.validate("longEmail"));
    }

    @Test
    void testShortEmail() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate("short"));
    }

    @Test
    void testNullEmail() {
        assertThrows(IllegalArgumentException.class, () -> validator.validate(null));
    }

    @Test
    void testExactLengthEmail() {
        assertDoesNotThrow(() -> validator.validate("12345"));
    }
}