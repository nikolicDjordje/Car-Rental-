package functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sources.CarLocators;
import sources.Links;
import sources.Locators;

public class CarMethods {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\djordje\\IT bootcamp\\Biblioteke\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//allCars(driver, CarLocators.CAR_MODEL);
		chooseCar(driver, CarLocators.CAR_MODEL, CarLocators.wishedModel, CarLocators.SUBMIT_BUTTON_XPATH);
	
	}
	// Idea of this method is to find out all the models available for rent using for loop, because all the car models have the same class name.
	public static void allCars (WebDriver driver, String s)  {
		driver.navigate().to(Links.HOME_URL);
		Methods.countrySelect(driver, Locators.COUNTRY_ID, Locators.Country);
		Methods.citySelect(driver, Locators.CITY_ID, Locators.City);
		Methods.dateSelect(driver, Locators.START_DATE_ID, Locators.MONTH_XPATH, Locators.DATE_XPATH, Locators.DAY_XPATH, Locators.TIME_ID, Locators.time);
		Methods.endDateSelect(driver, Locators.END_DATE_ID, Locators.END_MONTH_XPATH, Locators.END_DATE_XPATH, Locators.END_DAY_XPATH, Locators.END_TIME_ID, Locators.endTime);
		Methods.submitButton(driver, Locators.POP_UP_XPATH, Locators.SUBMIT_XPATH);
		Methods.cancelPopUp(driver, Locators.OK_XPATH);
		List<WebElement> carModels = driver.findElements(By.className(CarLocators.CAR_MODEL));
		for (WebElement webElement : carModels) {
			String carModel = webElement.getText();
			System.out.println(carModel);
		}
	}
		// Now, this method will choose wished model, after we saw all the available models.
		public static void chooseCar (WebDriver driver, String s, String s1, String s2)  {
			driver.navigate().to(Links.HOME_URL);
			Methods.countrySelect(driver, Locators.COUNTRY_ID, Locators.Country);
			Methods.citySelect(driver, Locators.CITY_ID, Locators.City);
			Methods.dateSelect(driver, Locators.START_DATE_ID, Locators.MONTH_XPATH, Locators.DATE_XPATH, Locators.DAY_XPATH, Locators.TIME_ID, Locators.time);
			Methods.endDateSelect(driver, Locators.END_DATE_ID, Locators.END_MONTH_XPATH, Locators.END_DATE_XPATH, Locators.END_DAY_XPATH, Locators.END_TIME_ID, Locators.endTime);
			Methods.submitButton(driver, Locators.POP_UP_XPATH, Locators.SUBMIT_XPATH);
			Methods.cancelPopUp(driver, Locators.OK_XPATH);
			List<WebElement> carModels = driver.findElements(By.className(CarLocators.CAR_MODEL));
			for (WebElement webElement : carModels) {
				if (webElement.getText().contains(CarLocators.wishedModel)) {
					WebDriverWait wait = new WebDriverWait(driver, 10);
					WebElement car = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s2)));
					car.click();
				}
	}
		}
}
