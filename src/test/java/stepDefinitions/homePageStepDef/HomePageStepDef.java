package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePages.HomePage;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class HomePageStepDef  {

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



}
