package com.example.archihexa.domain.model;

// Entité métier
    public class Account {
        private String id;
        private double balance;

        public Account(String id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public Account deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
            this.balance += amount;
            return this;
        }
    }
