package functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	public static WebDriver driver;
	public static void countrySelect (WebDriver driver, String s, String s1) {
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id(s));
		country.click();
		country.sendKeys(s1);
		country.click();
	}
	public static void citySelect (WebDriver driver, String s, String s1) {
		WebElement city = driver.findElement(By.id(s));
		city.click();
		city.sendKeys(s1);
		city.click();
	}
	public static void dateSelect (WebDriver driver, String s, String s1, String s2, String s3, String s4, String s5) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(s)));
		date.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement month = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s1)));
		month.click();
		WebElement chosenMonth = driver.findElement(By.xpath(s2));
		chosenMonth.click();
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement day = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s3)));
		day.click();
		WebElement time = driver.findElement(By.id(s4));
		time.sendKeys(s5);
	 
	
	}
	public static void endDateSelect (WebDriver driver, String s, String s1, String s2, String s3, String s4, String s5) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(s)));
		date.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement month = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s1)));
		month.click();
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement chosenDate = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s2)));
		chosenDate.click();
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement day = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s3)));
		day.click();
		WebElement time = driver.findElement(By.id(s4));
		time.sendKeys(s5);
} 
	public static void submitButton (WebDriver driver, String s, String s1) {
	WebElement popUp = driver.findElement(By.xpath(s));
	popUp.click();
	JavascriptExecutor jsx = (JavascriptExecutor)driver; jsx.executeScript("window.scrollBy(0,555)", ""); 
	WebDriverWait wait1 = new WebDriverWait (driver, 10);
	WebElement search = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s1)));
	search.click();
	}
	public static void cancelPopUp (WebDriver driver, String s) {
		WebDriverWait wait = new WebDriverWait (driver, 10);
		WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
		popUp.click();
	}
}