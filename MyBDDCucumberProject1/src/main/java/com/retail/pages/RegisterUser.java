package com.retail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/account']")
	public WebElement lnk_account;
	
	@FindBy(xpath="//a[@href='http://retailm1.upskills.in/account/register']")
	public WebElement lnk_register;
	
	@FindBy(id="input-firstname")
	public WebElement txt_firstName;
	
	@FindBy(id="input-lastname")
	public WebElement txt_lastName;
	
	@FindBy(id="input-email")
	public WebElement txt_email;
	
	@FindBy(id="input-telephone")
	public WebElement txt_telephone;
	
	@FindBy(id="input-address-1")
	public WebElement txt_address1;
	
	@FindBy(id="input-address-2")
	public WebElement txt_address2;
	
	@FindBy(id="input-city")
	public WebElement txt_city;
	
	@FindBy(id="input-postcode")
	public WebElement txt_postalCode;
	
	@FindBy(xpath="//select[@id='input-country']")
	public WebElement lst_country;
	
	@FindBy(xpath="//select[@id='input-zone']")
	public WebElement lst_state;
	
	@FindBy(id="input-password")
	public WebElement txt_password;
	
	@FindBy(id="input-confirm")
	public WebElement txt_confirmPassword;
	
	@FindBy(xpath="//input[@type='radio' and @name='newsletter']")
	public WebElement rd_newsletter;
	
	@FindBy(xpath="//input[@type='checkbox' and @name='agree']")
	public WebElement chk_terms;
	
	@FindBy(xpath="//input[@type='submit' and @value='Continue']")
	public WebElement btn_continue;
	
	@FindBy(xpath="//div[@id='System_nyHsmShk']//p[contains(text(), 'Congratulations')]")
	public WebElement val_successmsg;
	
	@FindBy(id="input-email")
	public WebElement txt_loginEmail;
	
	@FindBy(id="input-password")
	public WebElement txt_loginPassword;
	
	@FindBy(xpath="//input[@type='submit' and @value='Login']")
	public WebElement btn_login;
	
public WebDriver driver;
	
	public RegisterUser(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickAccountLink() {
		lnk_account.click();
	}
	
	public void clickRegisterLink() {
		lnk_register.click();
	}
	
	public void enterFirstName(String firstName) {
		txt_firstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		txt_lastName.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void enterTelephone(String telephoneNumber) {
		txt_telephone.sendKeys(telephoneNumber);
	}
	
	public void enterAddress1(String address1) {
		txt_address1.sendKeys(address1);
	}
	
	public void enterAddress2(String address2) {
		txt_address2.sendKeys(address2);
	}
	
	public void enterCity(String city) {
		txt_city.sendKeys(city);
	}
	
	public void enterPostalCode(String postalCode) {
		txt_postalCode.sendKeys(postalCode);
	}
	
	public void enterCountry(String country) {
		Select countryList = new Select(lst_country);
		countryList.selectByVisibleText(country);
	}
	
	public void enterState(String state) {
		Select stateList = new Select(lst_state);
		stateList.selectByVisibleText(state);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		txt_confirmPassword.sendKeys(confirmPassword);
	}
	
	public void clickSubscribeNewsletter() {
		rd_newsletter.click();
	}
	
	public void selectAgreeTermsConditions() {
		chk_terms.click();
	}
	
	public void clickContinue() {
		btn_continue.click();
	}
	
	public void validateAccountCreated() {
		if(val_successmsg.getText().contains("Congratulations")) {
			System.out.println("Your account is created successfully");
		}
		else {
			System.out.println("Issue creating account");
		}
	}
	
	public void enterEmailAddress(String email) {
		txt_loginEmail.sendKeys(email);
	}
	
	public void enterPasswordtoLogin(String password) {
		txt_loginPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	public void validateUserLoggedIn() {
		if(driver.getTitle().contains("My Account")){
			System.out.println("User successfully logged into his account");
		}
		else {
			System.out.println("User unable to login to his account");
		}
	}

}
