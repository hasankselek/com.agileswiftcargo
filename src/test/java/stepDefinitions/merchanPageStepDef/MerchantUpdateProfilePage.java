package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepDefinitions.BaseStep;

public class MerchantUpdateProfilePage extends BaseStep {

    @Then("Verifies that user name, address and profile photo are displayed")
    public void verifies_that_user_name_address_and_profile_photo_are_displayed() {

        PAGES.getMerchantUpdateProfilPage().getVerifyDisplayedMerchantInfo();

    }
    @Then("The user confirms that they can change their {string}, {string} and {string}")
    public void the_user_confirms_that_they_can_change_their_name_address_and_profile_photo(String name,String adress,String picture) {

        PAGES.getMerchantUpdateProfilPage().setMerchantInfo(name,adress,picture);


    }

    @Then("Verifies that all changes have been successfully saved")
    public void verifiesThatAllChangesHaveBeenSuccessfullySaved() {

        PAGES.getMerchantUpdateProfilPage().getSuccessMessages();
    }

    @And("Clicks Save Change button")
    public void clicksSaveChangeButton() {

        PAGES.getMerchantUpdateProfilPage().getClickSaveChangeButton();
    }
}
