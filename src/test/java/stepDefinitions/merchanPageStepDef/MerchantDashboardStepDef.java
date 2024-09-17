package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantLoginPage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MerchantDashboardStepDef extends BaseStep {

    MerchantDashboard merchantDashboard=new MerchantDashboard();
    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();
    HomePage homePage = new HomePage();
    ExcelDataReader reader = new ExcelDataReader(merchantLoginPage.configLoader.getConfigValue("testData"),"merchantLogin");

  @Then("Click profile icon")
    public void click_profile_icon() {
    PAGES.getMerchantDashboard().getClickProfileIcon();
	}

	@Then("Verifies {string} {string} {string} {string} links are displayed")
	public void verifies_links_are_displayed(String Profile, String PaymentInformation, String ChangePassword,
			String Logout) {

		PAGES.getMerchantDashboard().getVerifyProfileIconLinks(Profile, PaymentInformation, ChangePassword, Logout);
	}

    @Then("the {string} link should be visible in the dashboard menu")
    public void the_link_should_be_visible_in_the_dashboard_menu(String text) {
        ReusableMethods.findElementByText(text);

    }
    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String kelime) {
        ReusableMethods.hardWait(5);
        merchantDashboard.parcelsButton.click();

    }
    @Then("the opened page should be the {string} page")
    public void the_opened_page_should_be_the_page(String url) {
        assertEquals(homePage.configLoader.getConfigValue("parcelUrl"),merchantDashboard.driver.getCurrentUrl());

    }

    @Then("the parcels List should be visible on the opened page")
    public void the_parcels_list_should_be_visible_on_the_opened_page() {
        ReusableMethods.hardWait(3);
        merchantDashboard.listyazisi.isDisplayed();

    }
    @Then("the text boxes in the filter section should be clickable and editable")
    public void the_text_boxes_in_the_filter_section_should_be_clickable_and_editable() {
        merchantDashboard.textboxses.isDisplayed();

        ReusableMethods.hardWait(10);
    }
    @When("the user enters the date {string} and customer name {string} in the filter inputs")
    public void the_user_enters_the_date_and_customer_name_in_the_filter_inputs(String enterData, String custumerName) {
        merchantDashboard.dateButton.click();
        ReusableMethods.hardWait(3);
        merchantDashboard.todayButton.click();
        merchantDashboard.custumerButton.click();
        ReusableMethods.hardWait(2);
        merchantDashboard.custumerButton.sendKeys("Murat");





    }
    @When("the user applies the filter")
    public void the_user_applies_the_filter() {


    }


}
