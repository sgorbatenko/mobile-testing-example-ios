
package com.stas.mobile.testing.application.example.steps;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

import com.stas.mobile.testing.application.example.pages.MyPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicSteps
{
    private MyPage _p;

    @Given("^I am on the app homepage$")
    public void i_am_on_the_app_homepage()
    {
        _p = new MyPage();
    }

    @When("^I enter (\\d+) in the first editbox$")
    public void i_enter_in_the_first_editbox(String firstNumber)
    {
        _p.getFistNumber().enterText(firstNumber);
    }

    @When("^I enter (\\d+) in the second editbox and click Compute button$")
    public void i_enter_in_the_second_editbox(String secondNumber)
    {
        _p.getSecondNumber().enterText(secondNumber);
        _p.getComputeSum().pressButton();
    }

    @Then("^I should see (\\d+) in the \"Answer\" element$")
    public void i_should_see_in_the_element(String result)
    {
        String answer = _p.getResult().getStringValue();
        assertThat(answer, is(result));
    }
}
