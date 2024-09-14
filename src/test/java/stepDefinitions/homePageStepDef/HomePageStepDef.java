package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePages.HomePage;
import stepDefinitions.BaseStep;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class HomePageStepDef  extends BaseStep {

    HomePage homePage = new HomePage();


    @Then("Enters the {string}")
    public void enters_the(String configdenUrl) {

        homePage.driver.get(homePage.configLoader.getConfigValue(configdenUrl));

    }
    @Then("Verifies access to homepage")
    public void verifies_access_to_homepage() {

        assertEquals(homePage.configLoader.getConfigValue("homepageUrl"),homePage.driver.getCurrentUrl());


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

    @When("User goes to the Why Agile Swift Cargo title")
    public void user_goes_to_the_why_agile_swift_cargo_title() {

        JSUtilities.scrollToElement(DRIVER,PAGES.getHomePage().getWhyAgileSwiftCargoText());

    }

    @Then("User verifies that the headers are displayed")
    public void user_verifies_that_the_headers_are_displayed() {

        PAGES.getHomePage().getWhyAgileSwiftCargoHeadings();
    }



}
