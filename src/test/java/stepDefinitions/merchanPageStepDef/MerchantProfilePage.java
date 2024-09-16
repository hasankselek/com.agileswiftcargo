package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import stepDefinitions.BaseStep;

public class MerchantProfilePage extends BaseStep {


    @Then("Verifies that user {string} {string} {string} {string} {string} information is displayed")
    public void verifies_that_user_information_is_displayed(String name, String email, String phone, String businessName, String adress) {

        PAGES.getMerchantProfilePage().getDisplayedMerchantInformation(name,email,phone,businessName,adress);
    }

}
