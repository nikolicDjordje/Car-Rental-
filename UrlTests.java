package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import sources.Links;
import sources.UrlCheckLocators;

public class UrlTests {
	private WebDriver driver;
// The goal of this test is to check if the links in header really work and do they lead a user to the wished page.
	@BeforeMethod 
	 public void creatingDriver () 	{
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void urlCheck ()  {
		driver.navigate().to(Links.HOME_URL);
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.className(UrlCheckLocators.URL_CLASS));
		SoftAssert sa = new SoftAssert();
		for (int i = 0; i < links.size(); i++) {
			if (i == 0) {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				WebElement club = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UrlCheckLocators.CLUB_XPATH)));
				club.click();
				sa.assertEquals(driver.getCurrentUrl(), Links.EXPECTED_CLUB_URL);
				driver.navigate().to(Links.HOME_URL);
			}
			
			if (i == 1) {
				WebDriverWait wait1 = new WebDriverWait(driver, 10);
				WebElement booking = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UrlCheckLocators.BOOKING_XPATH)));
				booking.click();
				sa.assertEquals(driver.getCurrentUrl(), Links.EXPECTED_BOOKING_URL);
				driver.navigate().to(Links.HOME_URL);
			}
			if (i == 2) {
				WebDriverWait wait2 = new WebDriverWait(driver, 10);
				WebElement faq = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UrlCheckLocators.FAQ_XPATH)));
				faq.click();
				sa.assertEquals(driver.getCurrentUrl(), Links.EXPECTED_FAQ_URL);
				driver.navigate().to(Links.HOME_URL);
			}
			if (i == 3) {
				WebDriverWait wait3 = new WebDriverWait(driver, 10);
				WebElement contact = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UrlCheckLocators.CONTACT_XPATH)));
				contact.click();
				sa.assertEquals(driver.getCurrentUrl(), Links.EXPECTED_CONTACT_URL);
				driver.navigate().to(Links.HOME_URL);
			}
	}
		
}
}
