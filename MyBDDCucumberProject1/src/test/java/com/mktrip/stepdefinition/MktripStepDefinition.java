package com.mktrip.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.mktrip.base.InitiateDriver;
import com.mktrip.pages.MktripHome;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

public class MktripStepDefinition {
	public WebDriver driver;
	String source = null;
	String destination = null;
	@Given("^I am on makemytrip$")
	public void i_am_on_makemytrip() throws Throwable {
		 InitiateDriver init = new InitiateDriver();
		 driver = init.getDriverInstance();
	}

	@When("^I perform one way search$")
	public void i_perform_one_way_search(DataTable arg1) throws Throwable {
		 List<List<String>> data = arg1.raw();
		 source = data.get(0).get(1);
		 destination = data.get(1).get(1);
		 MktripHome home = new MktripHome(driver);
		 home.selectFromCity(source);
		 home.selectToCity(destination);
		 home.clickSearch();
	}

	@Then("^Search results should be display availabe flights$")
	public void search_results_should_be_display_availabe_flights() throws Throwable {
		MktripHome home = new MktripHome(driver);
		home.verifySearchResultsDisplayed(source, destination);
	}

	@When("^I perform roundtrip search$")
	public void i_perform_roundtrip_search(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		source = data.get(0).get(1);
		destination = data.get(1).get(1);
		MktripHome home = new MktripHome(driver);
		home.selectRoundTrip();
		home.selectFromCity(source);
		home.selectToCity(destination);
		home.selectStartDate();
		home.selectEndDate();
		home.clickRoundTripSearch();
	}

}
