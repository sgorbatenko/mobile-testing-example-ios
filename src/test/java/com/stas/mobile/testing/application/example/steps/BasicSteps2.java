
package com.stas.mobile.testing.application.example.steps;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

import com.stas.mobile.testing.application.example.pages.MyPage2;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicSteps2
{
    // private final WebDriver webDriver;
    private MyPage2 _p;

    @Before("@test")
    public void beforeCallingScenario()
    {
        System.out.println("*********** About to start the scenario.");

    }

    @After("@test")
    public void afterRunningScenario(Scenario scenario)
    {
        System.out.println("*********** Just finished running scenario: "
            + scenario.getStatus());
    }

    @Given("^I am on the app homepage$")
    public void i_am_on_the_app_homepage()
    {
        _p = new MyPage2();
    }

    @When("^I enter (-?\\d+) in the first editbox$")
    public void i_enter_in_the_first_editbox(String firstNumber)
    {
        _p.getFistNumber().sendKeys(firstNumber);
    }

    @When("^I enter (\\d+) in the second editbox and click Compute button$")
    public void i_enter_in_the_second_editbox(String secondNumber)
    {
        _p.getSecondNumber().sendKeys(secondNumber);
        _p.getComputeSum().click();
    }

    @Then("^I should see (\\d+) in the \"Answer\" element$")
    public void i_should_see_in_the_element(String result)
    {
        String answer = _p.getResult().getText();
        assertThat(answer, is(result));
    }

    // public BasicSteps2(SharedDriver webDriver)
    // {
    // this.webDriver = webDriver;
    // }
}
