package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.Then;
import stepDefinitions.BaseStep;

public class AdminMerchantManageMerchantStepDef extends BaseStep {

    @Then("Verifies that the search box is visible")
    public void verifies_that_the_search_box_is_visible() {


        PAGES.getAdminMerchantManageMerchantPage().getVerifiesSearchBoxDisplay();
    }

    @Then("Verifies that the search box is functional")
    public void verifies_that_the_search_box_is_functional() {

        PAGES.getAdminMerchantManageMerchantPage().getVerifiesSearchBoxEnable();
    }

    @Then("Inputs {string} data to the search box")
    public void ınputs_data_to_the_search_box(String searchText) {

        PAGES.getAdminMerchantManageMerchantPage().getFillSearchBox(searchText);
    }

    @Then("Verifies that the correct data is displayed")
    public void verifies_that_the_correct_data_is_displayed() {

        PAGES.getAdminMerchantManageMerchantPage().getCheckMerchantList();

    }
}
