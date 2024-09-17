package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.homePages.HomePage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.time.Duration;

import static org.junit.Assert.*;

public class HomePageStepDef extends BaseStep {

	HomePage homePage = new HomePage();

	@Then("Enters the {string}")
	public void enters_the(String configdenUrl) {

		homePage.driver.get(homePage.configLoader.getConfigValue(configdenUrl));

	}

	@Then("Verifies access to homepage")
	public void verifies_access_to_homepage() {

		assertEquals(homePage.configLoader.getConfigValue("homepageUrl"), homePage.driver.getCurrentUrl());
	}

	@Then("Verifies homepage load successfully")
	public void verifies_homepage_load_successfully() {

		assertTrue(homePage.ourServicesHeader.isDisplayed());

	}

	@Then("Verifies register button is displayed")
	public void verifiesRegisterButtonIsDisplayed() {

		assertTrue(homePage.registerButton.isDisplayed());

	}

	@Then("Clicks register button and verifies register page opens")
	public void clicksRegisterButtonAndVerifiesRegisterPageOpens() {

		homePage.registerButton.click();
		ReusableMethods.waitForPageToLoad(1);
	}

	@When("The user goes to the Why Agile Swift Cargo title")
	public void user_goes_to_the_why_agile_swift_cargo_title() {

		JSUtilities.scrollToElement(DRIVER, PAGES.getHomePage().getWhyAgileSwiftCargoText());
	}

	@Then("The user verifies that the headers are displayed")
	public void user_verifies_that_the_headers_are_displayed() {

		PAGES.getHomePage().getWhyAgileSwiftCargoHeadings();
	}

	@Then("The user verifies that the images are displayed")
	public void userVerifiesThatTheImagesAreDisplayed() {

		PAGES.getHomePage().getWhyAgileSwiftCargoImages();

	}

	@Then("Verifies that the text box labelled Enter tracking id is displayed")
	public void verifiesThatTheTextBoxLabelledEnterTrackingIdIsDisplayed() {

		PAGES.getHomePage().getTrackingIdBoxIsDisplayed();

	}

	@Then("Verifies that data can be entered in the Text Box")
	public void verifiesThatDataCanBeEnteredInTheTextBox() {

		PAGES.getHomePage().getTrackingIdBoxIsEnabled();
	}

	@When("Enter tracking id {string} in the Enter tracking id box")
	public void enterTrackingIdInTheEnterTrackingIdBox(String trackingID) {

		PAGES.getHomePage().enterTrackingID(trackingID);
	}

	@And("Clicks {string} button")
	public void clicksButton(String text) {

		ReusableMethods.clickWithText(text);
	}

	@Then("Verifies Our Service header visibilty")
	public void verifiesOurServiceHeaderVisibilty() {

		assertTrue(homePage.ourServicesHeader.isDisplayed());

	}

	@Then("Verifies {string}, {string}, {string}, {string} headers visibility")
	public void verifiesECommerceDeliveryPickDropPackageingWarehousingHeadersVisibility(String header1, String header2,
			String header3, String header4) {

		if (homePage.driver.getCurrentUrl().equals("https://qa.agileswiftcargo.com/")) {

			ReusableMethods.scrollToElement(homePage.ourServicesHeader);

			homePage.serviceHeadersVisibilty(header1);
			homePage.serviceHeadersVisibilty(header2);
			homePage.serviceHeadersVisibilty(header3);
			homePage.serviceHeadersVisibilty(header4);
		}
		else {

			homePage.serviceHeadersVisibilty(header1);
			homePage.serviceHeadersVisibilty(header2);
			homePage.serviceHeadersVisibilty(header3);
			homePage.serviceHeadersVisibilty(header4);

		}

	}

	@And("Verifies an arrow visible under the services and is clickable")
	public void verifiesAnArrowVisibleUnderTheServicesAndIsClickable() {

		homePage.navigationArrowsVisibility();
		homePage.clickNavigationArrow(1);

	}

	@Then("Clicks arrow under the {string}")
	public void clicksArrowUnderThe(String serviceHeader) {

		if (homePage.driver.getCurrentUrl().equals("https://qa.agileswiftcargo.com/")) {
			ReusableMethods.scrollToElement(homePage.ourServicesHeader);
			ReusableMethods.hardWait(2);

			if (serviceHeader.equals("E-Commerce delivery")) {

				homePage.clickNavigationArrow(1);

			}
			else if (serviceHeader.equals("Pick & Drop")) {

				homePage.clickNavigationArrow(2);

			}
			else if (serviceHeader.equals("Packageing")) {

				homePage.clickNavigationArrow(3);

			}
			else if (serviceHeader.equals("Warehousing")) {

				homePage.clickNavigationArrow(4);

			}
			else {
				System.out.println("Sorry,there is no such a service");
			}
		}
		else {

			if (serviceHeader.equals("E-Commerce delivery")) {

				homePage.clickNavigationArrow(1);

			}
			else if (serviceHeader.equals("Pick & Drop")) {

				homePage.clickNavigationArrow(2);

			}
			else if (serviceHeader.equals("Packageing")) {

				homePage.clickNavigationArrow(3);

			}
			else if (serviceHeader.equals("Warehousing")) {

				homePage.clickNavigationArrow(4);

			}
			else {
				System.out.println("Sorry,there is no such a service");
			}

		}

	}

	@Then("On the homepage, it goes all the way down to the footer section")
	public void on_the_homepage_it_goes_all_the_way_down_to_the_footer_section() {
		ReusableMethods.scrollToElement(homePage.SubscribeUsText);
		ReusableMethods.hardWait(5);
	}

	@Then("Tests the visibility {string} text")
	public void tests_the_visibility_and_functionality_of_the_textbox_in_the_menu(String istenenkelime) {

		homePage.footerEnterMailButon.isDisplayed();

	}

	@Then("Enters {string} in the textbox")
	public void enters_in_the_textbox(String email) {
		homePage.enterMailButtonu.sendKeys(email);
		homePage.footerEnterMailButon.click();
		ReusableMethods.hardWait(5);

	}

	@Then("Confirms that registration has been done in a successful")
	public void confirms_that_registration_has_been_done_in_a_successful() {

		Assert.assertTrue(homePage.werifyText.isDisplayed());

	}

	@Then("In the upper section of the home page, the inscription {string} is verified.")
	public void In_the_upper_section_of_the_home_page_the_inscription_is_verified(String arananKelime) {
		ReusableMethods.firstElementByText(arananKelime);

	}

	@Then("Click on {string}")
	public void click_on(String tiklanacakKelime) {
		ReusableMethods.clickWithText(tiklanacakKelime);
		ReusableMethods.hardWait(3);
	}

	@Then("The page that opens is verified as {string}")
	public void the_page_that_opens_is_verified_as(String aranacakUrl) {

		assertEquals(homePage.configLoader.getConfigValue(aranacakUrl), homePage.driver.getCurrentUrl());

	}

    @Then("It is verified that {string} is visible in the Body section of the Home Page")
    public void It_is_verified_that_is_visible_in_the_body_section_of_the_home_page(String aranacakText) {
        ReusableMethods.scrollToText(Driver.getDriver(),aranacakText);
        ReusableMethods.hardWait(3);

    }

}
