package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDateTime;
import java.util.HashMap;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class feature3 {
    private HashMap<String, Integer> items;
    private HashMap<String, String> deliveryInfo;
    private String service;
    private  String assertEquals;
    private LocalDateTime deliveryTime;
    private  String context;

    private double totalPrice;


    @Given("I am logged in to my Shining Carpets account")
    public void i_am_logged_in_to_my_shining_carpets_account() {
        // Implementation of logging in to the Shining Carpets account
    }

    @Given("I have items to be cleaned in my possession")
    public void i_have_items_to_be_cleaned_in_my_possession() {
        // Implementation of getting items to be cleaned
        items = new HashMap<String, Integer>();
        items.put("Carpet", 2);
        items.put("Rug", 1);
        items.put("Upholstery", 3);
    }

    @Given("I have provided my delivery information, including my name, address, and phone number")
    public void i_have_provided_my_delivery_information_including_my_name_address_and_phone_number() {
        // Implementation of providing delivery information
        deliveryInfo = new HashMap<String, String>();
        deliveryInfo.put("name", "John Doe");
        deliveryInfo.put("address", "123 Main St");
        deliveryInfo.put("phone", "555-1234");
    }

    @Given("I have provided a list of items that I want to be cleaned")
    public void i_have_provided_a_list_of_items_that_i_want_to_be_cleaned() {
        // Implementation of providing the list of items to be cleaned
        items = new HashMap<String, Integer>();
        items.put("Carpet", 2);
        items.put("Rug", 1);
        items.put("Upholstery", 3);
    }

    @When("I select the type of cleaning service and the preferred delivery time")
    public void i_select_the_type_of_cleaning_service_and_the_preferred_delivery_time() {
        // Implementation of selecting the type of cleaning service and preferred delivery time
        service = "Deep Cleaning";
        deliveryTime = LocalDateTime.of(2023, 4, 30, 14, 30);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String string) {
        // Implementation of generating the invoice
        generateInvoice();
    }

    @Then("I should see the total price of the cleaning services on the invoice")
    public void i_should_see_the_total_price_of_the_cleaning_services_on_the_invoice() {
        // Implementation of checking the total price on the invoice
        assert totalPrice == 250.00;
    }

    @Then("the invoice should include the details of the items to be cleaned, such as the name and quantity of each item")
    public void the_invoice_should_include_the_details_of_the_items_to_be_cleaned_such_as_the_name_and_quantity_of_each_item() {
        // Implementation of checking the details of the items on the invoice

    }

    @Then("the invoice should include the delivery information, such as the delivery address and phone number")
    public void the_invoice_should_include_the_delivery_information_such_as_the_delivery_address_and_phone_number() {
        // Implementation of checking the delivery information on the invoice
        Map<String, String> deliveryInfo = context.deliveryInfo;

        // Get the delivery information from the generated invoice
        Map<String, String> invoiceDeliveryInfo = context.invoice.getDeliveryInfo();

        // Compare the delivery information
        assertEquals(deliveryInfo.get("name"), invoiceDeliveryInfo.get("name"));
        assertEquals(deliveryInfo.get("address"), invoiceDeliveryInfo.get("address"));
        assertEquals(deliveryInfo.get("phone"), invoiceDeliveryInfo.get("phone"));

    }

    private void generateInvoice() {
        // Implementation of generating the invoice

    }

}
