package com.example.cleansystem.acceptanceTest;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private double balance;
    private List<Transaction> transactionList;

    public Customer(String name) {
        this.name = name;
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    public void charge(double amount) {
        this.balance -= amount;
    }

    // Getter and setter methods omitted for brevity
}
