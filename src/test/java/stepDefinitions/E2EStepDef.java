package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class E2EStepDef extends BaseStep {


    @When("Enter tracking id trackID in the Enter tracking id box")
    public void enterTrackingIdInTheEnterTrackingIdBox() {

        PAGES.getHomePage().trackingIdTextBox.clear();
        ReusableMethods.hardWait(2);
        PAGES.getHomePage().enterTrackingID(track.getTrackingID());
    }

    @Then("Enter tracking id wrong TrackID in the Enter tracking id box")
    public void enterTrackingIdWrongTrackIDInTheEnterTrackingIdBox() {

        PAGES.getHomePage().enterTrackingID(track.getTrackingID().substring(0, 16));
    }
}
