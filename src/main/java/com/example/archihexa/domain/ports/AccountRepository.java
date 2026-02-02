package com.example.archihexa.domain.ports;

import com.example.archihexa.domain.model.Account;

import java.util.Optional;

// Port sortant
public interface AccountRepository {
    Optional<Account> findById(String id);
    void save(Account account);
}
