package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.*;
import stepDefinitions.BaseStep;
import utilities.ReusableMethods;

import static org.junit.Assert.*;



public class TrackingPageStepDef extends BaseStep {

    @Then("Verifies that it redirects to the Tracking page")
    public void verifies_that_it_redirects_to_the_tracking_page() {

        PAGES.getTrackingPage().verifiesTrackingPage();
    }

    @Then("Verifies that the entered Tracking Id {string} matches the Parcel Tracking No")
    public void verifiesThatTheEnteredTrackingIdMatchesTheParcelTrackingNo(String trackingID) {

        String newParcelTrackingNo = PAGES.getTrackingPage().getParcelTrackingNo().replace(" ", "").replace("#", "");

        assertEquals(trackingID, newParcelTrackingNo);
    }

    @Then("Verifies that cargo information is displayed")
    public void verifiesThatCargoInformationIsDisplayed() {
		ReusableMethods.hardWait(3);
		PAGES.getTrackingPage().getVisibleCargoInfo();
	}


    @Then("Verifies that error messages")
    public void verifiesThatErrorMessages() {

        ReusableMethods.hardWait(3);
        PAGES.getTrackingPage().getParcelNotFoundPic();
    }

}
