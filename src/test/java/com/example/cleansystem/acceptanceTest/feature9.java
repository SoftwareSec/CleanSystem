package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class feature9 {
    private boolean orderCompleted;
    private boolean emailSent;

    @Given("a customer has placed an order")
    public void a_customer_has_placed_an_order() {
        // Implement code to set up a new order
    }

    @When("the order is marked as complete")
    public void the_order_is_marked_as_complete() {
        orderCompleted = true;
    }

    @Then("the system sends an email notification to the customer with the order details")
    public void the_system_sends_an_email_notification_to_the_customer_with_the_order_details() {
        if (orderCompleted) {
            // Implement code to send email notification to the customer with order details
            emailSent = true;
        } else {
            throw new RuntimeException("Order has not been completed yet");
        }
    }

    @When("the order is marked as incomplete")
    public void the_order_is_marked_as_incomplete() {
        orderCompleted = false;
    }

    @Then("the system does not send an email notification to the customer")
    public void the_system_does_not_send_an_email_notification_to_the_customer() {
        if (emailSent) {
            throw new RuntimeException("Email has been sent to the customer for an incomplete order");
        }  // Implement code to do nothing, as no email notification is required for an incomplete order

    }
}
