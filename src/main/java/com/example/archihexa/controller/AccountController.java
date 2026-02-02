package com.example.archihexa.controller;

import com.example.archihexa.domain.DepositUseCase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final DepositUseCase depositUseCase;

    public AccountController(DepositUseCase depositUseCase) {
        this.depositUseCase = depositUseCase;
    }

    @PostMapping("/accounts/{id}/deposit")
    public void deposit(@PathVariable String id, @RequestParam double amount) {
        depositUseCase.deposit(id, amount);
    }
}
