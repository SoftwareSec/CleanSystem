package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;
public class feature7 {


    public static class StatisticsSteps {
        int totalDeliveredItems;
        double totalCashReceived;
        double totalPaymentsMade;
        double totalDebtsOwed;

        @Given("the delivery service has completed deliveries")
        public void the_delivery_service_has_completed_deliveries() {
            // implementation to setup completed deliveries data
            totalDeliveredItems = 100;
            totalCashReceived = 5000.0;
            totalPaymentsMade = 3000.0;
            totalDebtsOwed = 2000.0;
        }

        @When("the user requests the statistics")
        public void the_user_requests_the_statistics() {
            // implementation to trigger statistics generation
        }

        @Then("the system should display the total number of delivered items")
        public void the_system_should_display_the_total_number_of_delivered_items() {
            // implementation to display total delivered items
            System.out.println("Total Delivered Items: " + totalDeliveredItems);
        }

        @Then("the system should display the total amount of cash received")
        public void the_system_should_display_the_total_amount_of_cash_received() {
            // implementation to display total cash received
            System.out.println("Total Cash Received: " + totalCashReceived + " NIS");
        }

        @Then("the system should display the total amount of payments made")
        public void the_system_should_display_the_total_amount_of_payments_made() {
            // implementation to display total payments made
            System.out.println("Total Payments Made: " + totalPaymentsMade + " NIS");
        }

        @Then("the system should display the total amount of debts owed")
        public void the_system_should_display_the_total_amount_of_debts_owed() {
            // implementation to display total debts owed
            System.out.println("Total Debts Owed: " + totalDebtsOwed + " NIS");
        }
    }
    public class Delivery {
        private int deliveredItems;
        private double cashReceived;
        private double paymentsMade;
        private double debtsOwed;

        public Delivery(int deliveredItems, double cashReceived, double paymentsMade, double debtsOwed) {
            this.deliveredItems = deliveredItems;
            this.cashReceived = cashReceived;
            this.paymentsMade = paymentsMade;
            this.debtsOwed = debtsOwed;
        }
        public int getDeliveredItems() {
            int total = 0;
            // implementation to calculate total number of delivered items
            // for example, by iterating over a list of completed deliveries
            Delivery[] completedDeliveries = new Delivery[0];
            for (Delivery delivery : completedDeliveries) {
                total += delivery.getItemsDelivered();
            }
            return total;
        }

        private int getItemsDelivered() {

            return deliveredItems;
        }

    }}
