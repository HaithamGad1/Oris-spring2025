package org.example.blacklist.impl;

import org.example.blacklist.PasswordBlacklistRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PasswordBlacklistInMemoryRepositoryImpl implements PasswordBlacklistRepository {

    private final Set<String> badPasswords;

    public PasswordBlacklistInMemoryRepositoryImpl() {
        this.badPasswords = new HashSet<>();
        badPasswords.add("qwerty007");
        badPasswords.add("123");
        badPasswords.add("bad");
    }

    @Override
    public boolean contains(String password) {
        return badPasswords.contains(password);
    }
}
