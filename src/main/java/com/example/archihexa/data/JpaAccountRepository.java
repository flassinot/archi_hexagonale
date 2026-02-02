package com.example.archihexa.data;

import com.example.archihexa.domain.model.Account;
import com.example.archihexa.domain.ports.AccountRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaAccountRepository implements AccountRepository {

    private final SpringDataAccountRepo repo;

    public JpaAccountRepository(SpringDataAccountRepo repo) {
        this.repo = repo;
    }

    @Override
    public Optional<Account> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public void save(Account account) {
        repo.save(account);
    }
}
