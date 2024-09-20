package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.*;
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

        PAGES.getAdminMerchantManageMerchantPage().getCheckMerchantListName();

    }

    @Then("Verifies that merchant list is visible")
    public void verifies_that_merchant_list_is_visible() {

        PAGES.getAdminMerchantManageMerchantPage().getCheckMerchantList();
    }

    @Then("Verifies that + Button is visible and functional")
    public void verifies_that_button_is_visible_and_functional() {

        PAGES.getAdminMerchantManageMerchantPage().getCheckPlusButton();

    }

    @And("Click on the + Button")
    public void clickOnTheButton() {

        PAGES.getAdminMerchantManageMerchantPage().getClickPlusButton();
    }

    @Then("Verifies that the Create Merchant page has been opened")
    public void verifiesThatTheCreateMerchantPageHasBeenOpened() {

        PAGES.getAdminMerchantManageMerchantPage().getCheckCreateMerchantUrl();
    }

    @Given("Clicks on the Actions button")
    public void clicks_on_the_actions_button() {

        PAGES.getAdminMerchantManageMerchantPage().getClickActions();

    }
    @Then("Verifies View,Edit and Delete buttons are visible")
    public void verifies_view_edit_and_delete_buttons_are_visible() {

        PAGES.getAdminMerchantManageMerchantPage().getVerifyActionsVisible();
    }

    @Then("Clicks on the Edit button")
    public void clicks_on_the_Edit_button() {

       PAGES.getAdminMerchantManageMerchantPage().getClickEditButton();
    }

    @And("Fills in the {string} {string} {string} {string} {string} {string} requested information")
    public void fillsInTheRequestedInformation(String businessName, String name, String phone,String hub,String status,String adress) {

        PAGES.getAdminMerchantManageMerchantPage().getFillRequestedEditInformation(businessName,name,phone,hub,status,adress);
    }

    @And("Clicks on the Save Change button")
    public void clicksOnTheSaveChangeButton() {

        PAGES.getAdminMerchantManageMerchantPage().getClickSaveChangeButton();
    }

    @Then("Verifies that the error messages is displayed")
    public void verifiesThatTheErrorMessagesIsDisplayed() {

        PAGES.getAdminMerchantManageMerchantPage().getEmptyInfoErrorMessages();
    }

    @And("Clicks on the Save button")
    public void clicksOnTheSaveButton() {

        PAGES.getAdminMerchantManageMerchantPage().getClickSaveButton();
    }

    @Then("Verifies that the wrong phone number error messages is displayed")
    public void verifiesThatTheWrongPhoneNumberErrorMessagesIsDisplayed() {

        PAGES.getAdminMerchantManageMerchantPage().getWrongPhoneNumberMessage();
    }

    @Then("Clicks on the Delete button")
    public void clicksOnTheDeleteButton() {

        PAGES.getAdminMerchantManageMerchantPage().getClickDelete();
    }
}
