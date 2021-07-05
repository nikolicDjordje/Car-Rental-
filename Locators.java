package sources;

public class Locators {

	public static final String COUNTRY_ID = "search-country";
	public static final String Country = "Serbia";
	public static final String CITY_ID = "search-city";
	public static final String City = "Ladevci";
	public static final String START_DATE_ID = "search-rental-start-date";
	public static final String END_DATE_ID = "search-rental-end-date";
	public static final String MONTH_XPATH = "/html/body/div[4]/div/div[1]/table/thead/tr[1]/th[2]";
	public static final String END_MONTH_XPATH = "/html/body/div[5]/div/div[1]/table/thead/tr[1]/th[2]";
	public static final String DATE_XPATH = "/html/body/div[4]/div/div[2]/table/tbody/tr/td/span[9]";
	public static final String END_DATE_XPATH = "/html/body/div[5]/div/div[2]/table/tbody/tr/td/span[9]";
	public static final String DAY_XPATH = "/html/body/div[4]/div/div[1]/table/tbody/tr[3]/td[3]";
	public static final String END_DAY_XPATH = "/html/body/div[5]/div/div[1]/table/tbody/tr[5]/td[4]";
	public static final String TIME_ID = "search-rental-start-time";
	public static final String END_TIME_ID = "search-rental-end-time";
	public static String time = "10:00";
	public static String endTime = "12:00";
	public static final String SUBMIT_ID = "search-button";
	public static final String SUBMIT_XPATH = "//*[@id=\"main-search-body\"]/div[7]";
	public static final String POP_UP_XPATH = "//*[@id=\"cookie-policy-msg\"]/div[2]/button";
	public static final String OK_XPATH = "//*[@id=\"warningModal\"]/div/div/div[3]/button";
}
