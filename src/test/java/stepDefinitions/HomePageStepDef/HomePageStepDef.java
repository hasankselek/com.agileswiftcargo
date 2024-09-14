package stepDefinitions.HomePageStepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import utilities.JSUtilities;

public class HomePageStepDef extends BasePage {



    @Then("Enters the {string}")
    public void enters_the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verifies access to homepage")
    public void verifies_access_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verifies homepage load successfully")
    public void verifies_homepage_load_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user goes to the Why Agile Swift Cargo section")
    public void the_user_goes_to_the_why_agile_swift_cargo_section() {
        JSUtilities.scrollToElement(driver,pages.getHomePage().getWhyAgileSwiftCargoText());
    }

    @Then("The user verifies that the headers are displayed")
    public void the_user_verifies_that_the_headers_are_displayed() {
        pages.getHomePage().getWhyAgileSwiftCargoHeadings();

    }



}
