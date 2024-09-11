package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public abstract class BasePage {

	public WebDriver driver;

	public Actions actions;

	protected WebDriverWait wait;

	public BasePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

}
