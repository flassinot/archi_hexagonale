package com.example.archihexa.data;

import com.example.archihexa.domain.DepositService;
import com.example.archihexa.domain.model.Account;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SpringDataAccountRepo {
    public Optional<Account> findById(String id) {
        return Optional.of(new Account("1", 10));
    }

    public void save(Account account) {

    }
}
