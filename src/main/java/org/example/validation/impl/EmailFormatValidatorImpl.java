package org.example.validation.impl;

import org.example.validation.EmailValidator;

import java.util.regex.Pattern;

public class EmailFormatValidatorImpl implements EmailValidator {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    @Override
    public void validate(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email format.");
        }
    }
}