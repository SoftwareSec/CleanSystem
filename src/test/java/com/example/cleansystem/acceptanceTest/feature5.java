package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.LocalDateTime;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Order;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class feature5 {
    private User user;
    private Order order;
    private String selectedOption;
    private String orderStatus;
    private LocalDateTime completionDateTime;

    @Given("the user is logged in to the order tracking system")
    public void the_user_is_logged_in_to_the_order_tracking_system() {
        user = new User();
        user.login();
    }

    @Given("the user has permission to view orders")
    public void the_user_has_permission_to_view_orders() {
        user.setPermission(Permission.valueOf("viewOrders"));
    }

    @Given("the user has an order to track")
    public void the_user_has_an_order_to_track() {
        order = new Order("12345", LocalDateTime.now().minusDays(2), "in treatment");
        user.addOrder(order);
    }

    @When("the user selects the {string} option")
    public void the_user_selects_the_option(String option) {
        selectedOption = option;
    }

    @When("enters the order number")
    public void enters_the_order_number() {
        order = user.getOrder("12345");
    }

    @When("clicks the {string} button")
    public void clicks_the_button(String button) {
        if (selectedOption.equals("Track Order")) {
            orderStatus = order.getStatus();
            if (orderStatus.equals("in treatment")) {
                order.setTreatmentProgress(50);
            } else if (orderStatus.equals("complete")) {
                completionDateTime = order.getCompletionDateTime();
            }
        }
    }

    @Then("the system displays the status of the order")
    public void the_system_displays_the_status_of_the_order() {
        String displayedStatus = String.valueOf(user.getOrder(order.getOrderNumber()));
        assertEquals(orderStatus, displayedStatus);
    }

    @Then("if the order is in {string} status, the system displays the estimated time for treatment")
    public void if_the_order_is_in_status_the_system_displays_the_estimated_time_for_treatment(String status) {
        if (status.equals("in treatment")) {
            int progress = order.getTreatmentProgress();
            assertEquals(50, progress);
        }
    }

    @Then("if the order is in {string} status, the system displays the progress of the treatment")
    public void if_the_order_is_in_status_the_system_displays_the_progress_of_the_treatment(String status) {
        if (status.equals("in treatment")) {
            int progress = order.getTreatmentProgress();
            assertEquals(50, progress);
        }
    }

    @Then("if the order is in {string} status, the system displays the date and time of completion.")
    public void if_the_order_is_in_status_the_system_displays_the_date_and_time_of_completion(String status) {
        if (status.equals("complete")) {
            assertEquals(LocalDateTime.now().minusDays(2), completionDateTime);
        }}
}
