package com.mktrip.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MktripHome {
	@FindBy(xpath="//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")
	public WebElement fromCity1;
	
	@FindBy(xpath="//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")
	public WebElement fromCity2;
	
	@FindBy(xpath="//div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween']/div/input")
	public WebElement toCity;
	
	@FindBy(xpath="//div[@class='loginModal displayBlock modalLogin dynHeight personal ']")
	public WebElement blockModal;
	
	@FindBy(xpath="//div[@class='DayPicker-Day DayPicker-Day--selected']")
	public WebElement blockModal2;
	
	@FindBy(xpath="//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']")
	public WebElement startDate;
	
	@FindBy(xpath="//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']/following-sibling::div")
	public WebElement endDate;
	
	@FindBy(xpath="//p[@class='font24 blackFont whiteText appendBottom20 journey-title']")
	public WebElement searchResults;
	
	@FindBy(xpath="//li[@data-cy='roundTrip']/span[@class='tabsCircle appendRight5']")
	public WebElement rd_roundTrip;
	
	
	public WebDriver driver;
	
	public MktripHome(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void selectFromCity(String source) throws Exception {
		//Thread.sleep(3000);
		//blockModal.click();
		//Thread.sleep(3000);
		fromCity1.click();
		Thread.sleep(3000);
		fromCity2.sendKeys(source);
		List<WebElement> cityList = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		for(int i=0; i<cityList.size();i++) {
			String text=cityList.get(i).getText();
			if(text.contains(source)) {
				cityList.get(i).click();
				break;
			}
		}
		
	}
	public void selectToCity(String destination) throws Exception {
		Thread.sleep(3000);
		toCity.sendKeys(destination);
		Thread.sleep(3000);
		List<WebElement> cityList = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		for(int i=0; i<cityList.size();i++) {
			String text=cityList.get(i).getText();
			if(text.contains(destination)) {
				cityList.get(i).click();
				break;
			}
		}
	}
	public void clickSearch() throws Exception {
		Thread.sleep(3000);
		blockModal2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}
	public void selectStartDate() throws Exception {
		Thread.sleep(3000);
		startDate.click();
	}
	public void selectEndDate() throws Exception {
		Thread.sleep(3000);
		endDate.click();
	}
	public void clickRoundTripSearch() throws Exception {
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}
	public void verifySearchResultsDisplayed(String source, String destination) {
		if(searchResults.getText().contains(source) && searchResults.getText().contains(destination) ) {
			System.out.println("Search results are displayed");
		}
	}
	public void selectRoundTrip() throws Exception {
		rd_roundTrip.click();
	}

}
