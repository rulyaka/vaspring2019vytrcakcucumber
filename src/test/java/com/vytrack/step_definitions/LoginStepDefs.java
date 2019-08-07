package com.vytrack.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
    @Given("I am on the  login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Going to login page");
    }

    @When("I login as a driver")
    public void i_login_as_a_driver() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("logging in as driver");
    }

    @Then("I should be able to see the dashboard page")
    public void i_should_be_able_to_see_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("verifying dashboard page");
    }
}
