package org.example.validation.impl;

import org.example.validation.EmailValidator;

public class EmailMinimumLengthValidatorImpl implements EmailValidator {

    private final int minLength;

    public EmailMinimumLengthValidatorImpl(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(String email) {
        if (email == null || email.length() < minLength) {
            throw new IllegalArgumentException("Email too short!");
        }
    }
}