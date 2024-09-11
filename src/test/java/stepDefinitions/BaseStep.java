package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utilities.Driver;
import utilities.Pages;

public abstract class BaseStep {

	protected final WebDriver driver;

	protected static Pages PAGES;

	public BaseStep() {
		driver = Driver.getDriver();
		PAGES = new Pages();
	}

}
