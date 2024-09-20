package stepDefinitions;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.adminPages.*;
import pages.homePages.HomePage;
import pages.homePages.OurPartnersPage;
import pages.homePages.ServiceDetailsPage;
import pages.merchantPages.*;
import stepDefinitions.adminPageStepDef.AdminMerchantManageMerchantStepDef;
import stepDefinitions.merchanPageStepDef.MerchantParcelsStepDefinitions;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.Pages;

import java.time.Duration;
import java.util.Random;

public abstract class BaseStep {

	protected final WebDriver DRIVER;

	protected static Pages PAGES;

	protected static ConfigLoader configLoader;

	protected static AdminMerchantManageMerchantPage adminMerchantManageMerchantPage;

	protected static Faker faker;

	protected static Accounts accounts;

	protected static MerchantLoginPage merchantLoginPage;

	protected static MerchantAccInvoicePage merchantAccInvoicePage;

	protected static MerchantDashboard merchantDashboard;

	protected static HomePage homePage;

	protected static MerchantForgotPasswordPage merchantForgotPasswordPage;

	protected static MerchantParcelsPage merchantParcelsPage;

	protected static MerchantPickupPointPage merchantPickupPointPage;

	protected static MerchantRegistrationPage merchantRegistrationPage ;

	protected static MerchantReportsParcelStatusPage merchantReportsParcelStatusPage;

	protected static Random random;

	protected static MerchantParcelsStepDefinitions track;

	protected static MerchantReportsPage merchantReportsPage;

	protected static OurPartnersPage ourPartnersPage;

	protected static ServiceDetailsPage serviceDetailsPage;

	protected static AdminBranchManagePaymentsPage adminBranchManagePaymentsPage;

	protected static AdminBranchManagePage adminBranchManagePage;

	protected static WebDriverWait wait;

	protected static AdminDashboard adminDashboard;

	protected static AdminDeliveryManPage adminDeliveryManPage;

	protected static AdminProfilPage adminProfilPage;

	protected static AdminProfilPage adminLoginPage;

	protected static AdminOffersPage adminOffersPage;

	protected static  AdminParcelsPage adminParcelsPage;

	protected static AdminRegistrationPage adminRegistrationPage;

	public BaseStep() {
		DRIVER = Driver.getDriver();

		PAGES = new Pages();

		configLoader=new ConfigLoader();

		faker = new Faker();

		accounts =  new Accounts();

		adminMerchantManageMerchantPage = new AdminMerchantManageMerchantPage();

		merchantLoginPage = new MerchantLoginPage();

		merchantAccInvoicePage = new MerchantAccInvoicePage();

		merchantDashboard = new MerchantDashboard();

		homePage = new HomePage();

		merchantForgotPasswordPage = new MerchantForgotPasswordPage();

		merchantParcelsPage = new MerchantParcelsPage();

		merchantPickupPointPage = new MerchantPickupPointPage();

		merchantRegistrationPage = new MerchantRegistrationPage();

        merchantReportsParcelStatusPage = new MerchantReportsParcelStatusPage();

		random=new Random();

		track = new MerchantParcelsStepDefinitions();

		merchantReportsPage = new MerchantReportsPage();

		ourPartnersPage= new OurPartnersPage();

		serviceDetailsPage = new ServiceDetailsPage();

		adminBranchManagePaymentsPage = new AdminBranchManagePaymentsPage();

		adminBranchManagePage = new AdminBranchManagePage();

		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

		adminDashboard = new AdminDashboard();

		adminDeliveryManPage = new AdminDeliveryManPage();

		adminProfilPage = new AdminProfilPage();

		adminLoginPage = new AdminProfilPage();

		adminOffersPage = new AdminOffersPage();

		adminParcelsPage = new AdminParcelsPage();

		adminRegistrationPage = new AdminRegistrationPage();

	}

}




