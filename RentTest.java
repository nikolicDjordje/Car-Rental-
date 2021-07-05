package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import functions.Methods;
import sources.Links;
import sources.Locators;

public class RentTest {

	private WebDriver driver;

	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void chooseCountry () {
		driver.navigate().to(Links.HOME_URL);
		Methods.countrySelect(driver, Locators.COUNTRY_ID, Locators.Country);
		Methods.citySelect(driver, Locators.CITY_ID, Locators.City);
		Methods.dateSelect(driver, Locators.START_DATE_ID, Locators.MONTH_XPATH, Locators.DATE_XPATH, Locators.DAY_XPATH, Locators.TIME_ID, Locators.time);
		Methods.endDateSelect(driver, Locators.END_DATE_ID, Locators.END_MONTH_XPATH, Locators.END_DATE_XPATH, Locators.END_DAY_XPATH, Locators.END_TIME_ID, Locators.endTime);
		Methods.submitButton(driver, Locators.POP_UP_XPATH, Locators.SUBMIT_XPATH);
		Methods.cancelPopUp(driver, Locators.OK_XPATH);
		Assert.assertEquals(driver.getCurrentUrl(), Links.EXPECTED_URL);
	}
	
}
