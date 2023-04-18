package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class feature6 {

    private Customer customer;
    private Transaction transaction;
    private double originalAmount;

    @Given("the customer has made transactions with a total amount greater than {int} NIS")
    public void the_customer_has_made_transactions_with_a_total_amount_greater_than_nis(Integer amount) {
        customer = new Customer("John Doe");
        originalAmount = amount + 100; // set a total amount greater than amount
        customer.addTransaction(new Transaction(originalAmount));
    }

    @When("the customer makes a transaction")
    public void the_customer_makes_a_transaction() {
        transaction = new Transaction(originalAmount / 2); // create a new transaction for half the original amount
        customer.addTransaction(transaction);
    }

    @Then("the system applies a {int}% discount to the transaction")
    public void the_system_applies_a_discount_to_the_transaction(Integer discountRate) {
        double expectedAmount = transaction.getAmount() * (1 - (discountRate / 100.0));
        Assert.assertEquals(expectedAmount, transaction.getDiscountedAmount(), 0.001); // check that the discount was applied correctly
    }

    @Then("the customer pays the discounted amount")
    public void the_customer_pays_the_discounted_amount() {
        customer.charge(transaction.getDiscountedAmount()); // deduct the discounted amount from the customer's balance
    }

    @Given("the customer has made transactions with a total amount less than or equal to {int} NIS")
    public void the_customer_has_made_transactions_with_a_total_amount_less_than_or_equal_to_nis(Integer amount) {
        customer = new Customer("John Doe");
        originalAmount = amount - 100; // set a total amount less than amount
        customer.addTransaction(new Transaction(originalAmount));
    }

    @Then("the system does not apply a discount to the transaction")
    public void the_system_does_not_apply_a_discount_to_the_transaction() {
        Assert.assertEquals(originalAmount / 2, transaction.getDiscountedAmount(), 0.001); // check that no discount was applied
    }

    @Then("the customer pays the full amount")
    public void the_customer_pays_the_full_amount() {
        customer.charge(transaction.getAmount()); // deduct the full amount from the customer's balance
    }
}




