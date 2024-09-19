package stepDefinitions;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import pages.adminPages.AdminMerchantManageMerchantPage;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantLoginPage;
import pages.merchantPages.MerchantRegistrationPage;
import stepDefinitions.adminPageStepDef.AdminMerchantManageMerchantStepDef;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.Pages;

public abstract class BaseStep {

	protected final WebDriver DRIVER;

	protected static Pages PAGES;

	protected static ConfigLoader configLoader;

	protected static AdminMerchantManageMerchantPage adminMerchantManageMerchantPage;

	protected static Faker faker;

	public BaseStep() {
		DRIVER = Driver.getDriver();

		PAGES = new Pages();

		configLoader = new ConfigLoader();

		adminMerchantManageMerchantPage = new AdminMerchantManageMerchantPage();

		faker = new Faker();
	}

}




