package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.homePages.OurPartnersPage;
import stepDefinitions.BaseStep;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OurPartnersStepDef extends BaseStep {

    @Given("Go to page {string}")
    public void go_to_page(String pageUrl) {
        Driver.getDriver().get(configLoader.getConfigValue(pageUrl));

    }

    @Then("Scroll to Our Partners area.")
    public void scrollToOurPartnersArea() {

        ReusableMethods.scrollToElement(ourPartnersPage.ourPartnersTitle);
    }

    @Then("Verify that the logos list is displayed successfully.")
    public void verifyThatTheLogosListIsDisplayedSuccessfully() {
        ReusableMethods.hardWait(1);
        for (int i = 0; i < ourPartnersPage.partnersLogosList.size()-2; i++) {
            ReusableMethods.hardWait(1);
            Assert.assertTrue(ourPartnersPage.partnersLogosList.get(i).isDisplayed());
        }
    }

    @Then("Swipe to slide {int}.")
    public void swipeToSlide(int slide) {
        ReusableMethods.hardWait(1);
        ourPartnersPage.ourPartnersSlideButtons.get(slide-1).click();
    }

    @Then("Verify that first slide is selected.")
    public void verifyThatSlideIsSelected() {
        ReusableMethods.hardWait(1);
        Assert.assertFalse(ourPartnersPage.partnersLogosList.get(8).isDisplayed());
        Assert.assertFalse(ourPartnersPage.partnersLogosList.get(9).isDisplayed());
    }

    @Then("Verify that second slide is selected.")
    public void verifyThatSecondSlideIsSelected() {

        ReusableMethods.hardWait(1);
        Assert.assertFalse(ourPartnersPage.partnersLogosList.get(0).isDisplayed());
        Assert.assertFalse(ourPartnersPage.partnersLogosList.get(9).isDisplayed());
    }

    @Then("Verify that third slide is selected.")
    public void verifyThatThirdSlideIsSelected() {
        ReusableMethods.hardWait(1);
        Assert.assertFalse(ourPartnersPage.partnersLogosList.get(0).isDisplayed());
        Assert.assertFalse(ourPartnersPage.partnersLogosList.get(1).isDisplayed());
    }

    @Then("Click on logo {int}")
    public void clickOnLogo(int number) {

        ReusableMethods.switchToWindowWithTitleContains("Agile");
        ReusableMethods.hardWait(1);
        ourPartnersPage.partnersLogosList.get(number-1).click();
    }

    @Then("Verify new tab title is correct for {string}")
    public void verifyNewTabTitleIsCorrect(String logoNumber) {
        ReusableMethods.switchToWindowWithTitleContains(configLoader.getConfigValue(logoNumber));
        ReusableMethods.hardWait(1);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(configLoader.getConfigValue(logoNumber)) );
        ReusableMethods.switchToWindowWithTitle("Agile");
    }
}
