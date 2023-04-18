package com.example.cleansystem.acceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class feature1 {

    private LoginPage loginPage;
    private HomePage homePage;

    @Given("I go to login choice")
    public void iGoToLoginChoice() {
        loginPage = new LoginPage();
        loginPage.goToLoginPage();
    }

    @Given("the field 'email' is empty")
    public void theFieldEmailIsEmpty() {
        loginPage.setEmail("");
    }

    @Given("the field 'password' is empty")
    public void theFieldPasswordIsEmpty() {
        loginPage.setPassword("");
    }

    @When("I click on login and flag is 'true'")
    public void iClickOnLoginAndFlagIsTrue() {
        loginPage.submitForm(true);
    }

    @Then("field 'email' should be with error")
    public void fieldEmailShouldBeWithError() {
        assertEquals("error", loginPage.getEmailStatus());
    }

    @Then("field 'password' should be with error")
    public void fieldPasswordShouldBeWithError() {
        assertEquals("error", loginPage.getPasswordStatus());
    }

    @When("he fills in 'email' with 'sulaiman@gmail.com'")
    public void heFillsInEmailWithSulaimanGmailCom() {
        loginPage.setEmail("sulaiman@gmail.com");
    }

    @When("be fills in 'password' with '123456'")
    public void beFillsInPasswordWith123456() {
        loginPage.setPassword("123456");
    }

    @Then("T should see 'E-mail on password is incorrect!'")
    public void tShouldSeeEmailOnPasswordIsIncorrect() {
        assertEquals("E-mail on password is incorrect!", loginPage.getErrorMessage());
    }

    @When("he fills in 'email' with 'sualiman@gmail.com'")
    public void heFillsInEmailWithSualimanGmailCom() {
        loginPage.setEmail("sualiman@gmail.com");
    }

    @When("he fill in 'password' with '123456'")
    public void heFillInPasswordWith123456() {
        loginPage.setPassword("123456");
    }

    @Then("I should see 'Welcome to Shining Carpets'")
    public void iShouldSeeWelcomeToShiningCarpets() {
        homePage = new HomePage();
        assertEquals("Welcome to Shining Carpets", homePage.getWelcomeMessage());
    }
}

