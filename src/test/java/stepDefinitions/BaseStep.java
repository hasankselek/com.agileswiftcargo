package stepDefinitions;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantLoginPage;
import pages.merchantPages.MerchantRegistrationPage;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.Pages;

public abstract class BaseStep {

	protected final WebDriver DRIVER;

	protected static Pages PAGES;

protected static ConfigLoader configLoader;

	public BaseStep() {
		DRIVER = Driver.getDriver();

		PAGES = new Pages();

		configLoader=new ConfigLoader();

	}

}




