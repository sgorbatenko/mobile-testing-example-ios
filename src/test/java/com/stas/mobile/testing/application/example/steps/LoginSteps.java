
package com.stas.mobile.testing.application.example.steps;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

import com.stas.mobile.testing.application.example.pages.DashboardPage;
import com.stas.mobile.testing.application.example.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps
{
    // private final WebDriver webDriver;
    private LoginPage _loginPage;
    private DashboardPage _dashboardPage;

    @Given("^I am on the Login page$")
    public void i_am_on_the_login_view()
    {
        _loginPage = new LoginPage();
    }

    @When("^I enter (bw\\d+\\s?@bw\\.com|\'\') in the username editbox$")
    public void i_enter_value_in_the_username_editbox(String userName)
    {
        _loginPage.getUserName().clear();
        _loginPage.getUserName().sendKeys(userName); // .replace("\"\"", replacement));
    }

    @When("^I enter (bw\\d+|\'\') in the password editbox and click login button$")
    public void i_enter_value_password_editbox_and_click_login_button(String password)
    {
        _loginPage.getPassword().sendKeys(password);
        _loginPage.getLoginBtn().click();
    }

    @Then("^I should see Dashboard page$")
    public void i_should_see_Dashboard_page()
    {
        _dashboardPage = new DashboardPage();
        assertThat(_dashboardPage.getTitle().isDisplayed(), is(true));
    }


    @Then("^I should see Login page and error message$")
    public void i_should_see_Login_page_and_error_message()
    {
        assertThat(_loginPage
            .getAlertOkBtn()
            .isDisplayed(), is(true));
        _loginPage.getAlertOkBtn().click();
    }

    // @When("^I enter '' in the first editbox$")
    // public void i_enter_in_the_first_editbox() throws Throwable
    // {
    // // Write code here that turns the phrase above into concrete actions
    // throw new PendingException();
    // }

    // @When("^I enter bw(\\d+)' '@bw\\.com in the first editbox$")
    // public void i_enter_bw_bw_com_in_the_first_editbox(int arg1) throws Throwable
    // {
    // // Write code here that turns the phrase above into concrete actions
    // // throw new PendingException();
    // }

    // public BasicSteps2(SharedDriver webDriver)
    // {
    // this.webDriver = webDriver;
    // }
}
