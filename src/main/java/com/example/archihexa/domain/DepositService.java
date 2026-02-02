package com.example.archihexa.domain;


import com.example.archihexa.domain.model.Account;
import com.example.archihexa.domain.ports.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

// Implémentation du use case
@Service
public class DepositService implements DepositUseCase {

    private final AccountRepository repository;

    public DepositService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deposit(String accountId, double amount) {
        Account acc = repository.findById(accountId).orElse(new Account("0", 0));
        acc.deposit(amount);
        repository.save(acc);
    }
}
