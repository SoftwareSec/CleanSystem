package com.example.cleansystem.acceptanceTest;

import com.example.cleansystem.TESTINPUT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import java.util.Objects;
import java.util.*;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class feature2 {
    @Given("user is on the page")
    public void userIsOnThePage() {

    }
    @When("user click on save and flag is {string}")
    public void userClickOnSaveAndFlagIsTrue(String string) {
        if ("true".equals("true")) {
            assertEquals("true", "true");
        } else {
            assertEquals("false", "false");
        }

    }
    @Then("the field {string} shoud be an eppor")
    public void theFieldShoudBeAnEppor(String string) {
    System.out.println("please enter a valid name");
        assertFalse(false);
    }

    @Then("the field {string} shoud be an error the field 'Size' shoud be an eppon")
    public void theFieldShoudBeAnErrorTheFieldISizeShoudBeAnEppon(String string) {
        System.out.println("please enter a valid picture");
        assertFalse(false);
    }
    @Then("the field 'Colon' shoud be an error")
    public void theFieldColonShoudBeAnError() {


    }
    @Then("the field {string} shoud be an error")
    public void theFieldShoudBeAnError(String string) {

    }


    @When("user click on insert and flag is {string}")
    public void userClickOnInsertAndFlagIs(String string) {

    }
    @When("he fill in the field {string} with {string}")
    public void heFillInTheFieldWith(String string, String string2) {
        boolean flag = false;
        if(string.equals("Name")){
            flag = TESTINPUT.checkName(string2);
            if(flag){
                assertEquals("true", "true");
            }
            else{
                assertEquals("false", "false");
            }
        } 
        else if (string.equals("Quantity")) {
            flag = TESTINPUT.checkQuantity(string2);
            if(flag){
                assertEquals("true", "true");
            }
            else{
                assertEquals("false", "false");
            }
        }

        else if (string.equals("Size")) {
            flag = TESTINPUT.checkSize(string2);
            if(flag){
                assertEquals("true", "true");
            }
            else{
                assertEquals("false", "false");
            }

        }
        else if (string.equals("Color")) {
            flag = TESTINPUT.checkColor(string2);
            if(flag){
                assertEquals("true", "true");
            }
            else{
                assertEquals("false", "false");
            }

        }
    }
    @When("he press on {string} and flag is {string}")
    public void hePressOnAndFlagIs(String string, String string2) {

    }
    @Then("the user should see the message {string}")
    public void theUserShouldSeeTheMessage(String string) {

    }

}
