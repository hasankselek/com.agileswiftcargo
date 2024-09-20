package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.*;
import pages.adminPages.AdminBranchManagePage;
import stepDefinitions.BaseStep;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AdminBranchManageStepDef extends BaseStep {


    String gonderilenHubName;

    @Then("Opens branch page")
    public void opensBranchPage() {

        adminBranchManagePage.branchManageSideBarMenu.click();
        adminBranchManagePage.branchMenu.click();

    }

    @And("Verifies filter button visibility")
    public void verifiesFilterButtonVisibility() {

        assertTrue(adminBranchManagePage.filterButton.isDisplayed());


    }

    @Then("Verifies clear button visibility")
    public void verifiesClearButtonVisibility() {

        assertTrue(adminBranchManagePage.clearButton.isDisplayed());


    }

    @And("Enters {string} search box")
    public void entersHubNameSearchBox(String hubName) {

        gonderilenHubName = hubName;
        adminBranchManagePage.filterBox.sendKeys(hubName);
        adminBranchManagePage.filterButton.click();


    }

    @Then("Verifies filter works")
    public void verifiesFilterWorks() {

        String actualBranch = adminBranchManagePage.branchNameOnTable.getText();

        assertEquals(gonderilenHubName, actualBranch);


    }

    @And("Verifies filter cleaned")
    public void verifiesFilterCleaned() {

        assertTrue(adminBranchManagePage.filterBox.getText().isBlank());


    }


    @Then("Verifies plus sign to the right of the branch list")
    public void verifiesPlusSignToTheRightOfTheBranchList() {

        assertTrue(adminBranchManagePage.plusSign.isDisplayed());
    }

    @Then("Clicks plus sign")
    public void clicksPlusSign() {

        adminBranchManagePage.plusSign.click();

    }

    @And("Verifies Create Branch page opens")
    public void verifiesCreateBranchPageOpens() {

        String expectedUrl = "https://qa.agileswiftcargo.com/admin/hubs/create";
        String actualUrl = adminBranchManagePage.driver.getCurrentUrl();

        assertEquals(expectedUrl, actualUrl);


    }

    @Then("Clicks actions dropdown menu")
    public void clicksActionsDropdownMenu() {

        adminBranchManagePage.actionsDropdowns.get(1).click();
    }

    @Then("Verifies {string} option displayed")
    public void verifiesOptionDisplayed(String menuName) {


        assertEquals(adminBranchManagePage.getDropdownItem(menuName).getText(), menuName.trim());


    }

    @Then("Verifies that the View option redirects to the relevant page")
    public void verifiesThatTheViewOptionRedirectsToTheRelevantPage() {

        adminBranchManagePage.getDropdownItem(" View").click();
        assertTrue(adminBranchManagePage.driver.getCurrentUrl().contains("view"));


    }

    @Then("Verifies that the Edit option redirects to the relevant page")
    public void verifiesThatTheEditOptionRedirectsToTheRelevantPage() {

        adminBranchManagePage.getDropdownItem(" Edit").click();
        assertTrue(adminBranchManagePage.driver.getCurrentUrl().contains("edit"));

    }

    @Then("Verifies that the Mange In-Charge option redirects to the relevant page")
    public void verifiesThatTheMangeInChargeOptionRedirectsToTheRelevantPage() {

        adminBranchManagePage.getDropdownItem(" Mange In-Charge").click();
        assertTrue(adminBranchManagePage.driver.getCurrentUrl().contains("incharge"));


    }

    @And("Verifies delete the branch")
    public void verifiesDeleteTheBranch() {

        adminBranchManagePage.getDropdownItem(" Delete").click();
        adminBranchManagePage.yesButtonOnDelete.click();
        ReusableMethods.hardWait(1);
        assertTrue(ReusableMethods.paymentNotificationCatcher());

    }

    @Then("Returns to branch page")
    public void returnsToBranchPage() {

        adminBranchManagePage.driver.navigate().back();
    }
}
