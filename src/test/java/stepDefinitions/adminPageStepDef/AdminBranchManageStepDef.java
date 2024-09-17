package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.adminPages.AdminBranchManagePage;

import static org.junit.Assert.*;

public class AdminBranchManageStepDef {

    AdminBranchManagePage adminBranchManagePage = new AdminBranchManagePage();
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

        assertEquals(gonderilenHubName,actualBranch);




    }

    @And("Verifies filter cleaned")
    public void verifiesFilterCleaned() {

        assertTrue(adminBranchManagePage.filterBox.getText().isBlank());


    }



}
