package com.example.cleansystem.acceptanceTest;

public class Transaction {
    private final double amount;
    private double discountedAmount;

    public Transaction(double amount) {
        this.amount = amount;
        this.discountedAmount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double getDiscountedAmount() {
        return discountedAmount;
    }

    public void applyDiscount(double discountRate) {
        this.discountedAmount = amount * (1 - (discountRate / 100.0));
    }
}
