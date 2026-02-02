package com.example.archihexa.domain;

// Port entrant (use case)
public interface DepositUseCase {
    void deposit(String accountId, double amount);
}
