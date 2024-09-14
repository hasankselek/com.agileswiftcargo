package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.Pages;

import java.time.Duration;

public abstract class BasePage {

	public WebDriver driver;

	public Actions actions;

	public WebDriverWait wait;

	public ConfigLoader configLoader;

	public ExcelDataReader hasanExcelReader;

	public Pages pages;



	public BasePage() {
		driver = Driver.getDriver();
		configLoader = new ConfigLoader();
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hasanExcelReader = new ExcelDataReader(configLoader.getConfigValue("testData"), configLoader.getConfigValue("hasan"));
		pages = new Pages();
	}

}
