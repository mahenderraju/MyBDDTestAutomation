package com.retail.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.retail.base.InitiateDriver;
import com.retail.pages.RegisterUser;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterUserStepDefinition {
	public WebDriver driver;
	public RegisterUser register;
	
	@Given("^I am on retail upskill website$")
	public void i_am_on_retail_upskill_website() throws Throwable {
		InitiateDriver init = new InitiateDriver();
		driver = init.getDriverInstance();
	}

	@When("^I enter firstname on register page$")
	public void i_enter_firstname_on_register_page(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register = new RegisterUser(driver);
		register.clickAccountLink();
		register.clickRegisterLink();
		register.enterFirstName(data.get(0).get(1));
	}

	@When("^enter lastname$")
	public void enter_lastname(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterLastName(data.get(0).get(1));
	}

	@When("^enter email$")
	public void enter_email(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterEmail(data.get(0).get(1));
	}

	@When("^enter mobilenumber$")
	public void enter_mobilenumber(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterTelephone(data.get(0).get(1));
	}
	
	@When("^enter addressOne$")
	public void enter_addressOne(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterAddress1(data.get(0).get(1));
	}

	@When("^enter addressTwo$")
	public void enter_addressTwo(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterAddress2(data.get(0).get(1));
	}

	@When("^enter city$")
	public void enter_city(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterCity(data.get(0).get(1));
	}

	@When("^enter postcode$")
	public void enter_postcode(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterPostalCode(data.get(0).get(1));
	}

	@When("^enter country$")
	public void enter_country(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterCountry(data.get(0).get(1));
	}

	@When("^enter region or state$")
	public void enter_region_or_state(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterState(data.get(0).get(1));
	}

	@When("^enter password$")
	public void enter_password(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterPassword(data.get(0).get(1));
	}

	@When("^enter confirm password$")
	public void enter_confirm_password(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register.enterConfirmPassword(data.get(0).get(1));
	}

	@When("^select radio button to subscribe$")
	public void select_radio_button_to_subscribe() throws Throwable {
	    register.clickSubscribeNewsletter();
	}

	@When("^select checkbox to agree terms and privacy policy$")
	public void select_checkbox_to_agree_terms_and_privacy_policy() throws Throwable {
	    register.selectAgreeTermsConditions();
	}

	@When("^click Continue$")
	public void click_Continue() throws Throwable {
		register.clickContinue();
	}

	@Then("^User is registered successfully$")
	public void user_is_registered_successfully() throws Throwable {
		register.validateAccountCreated();
	}
	
	@When("^I enter userid and password$")
	public void i_enter_userid_and_password(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		register = new RegisterUser(driver);
		register.clickAccountLink();
		register.enterEmailAddress(data.get(0).get(1));
		register.enterPasswordtoLogin(data.get(1).get(1));
		register.clickLogin();	
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	    register.validateUserLoggedIn();
	}





}
