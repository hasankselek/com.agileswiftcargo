package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.adminPages.AdminDashboard;
import pages.adminPages.AdminProfileUpdatePage;
import stepDefinitions.BaseStep;
import utilities.ReusableMethods;

public class AdminProfileUpdateStepDef extends BaseStep {

    AdminDashboard adminDashboard = new AdminDashboard();
    AdminProfileUpdatePage adminProfileUpdatePage = new AdminProfileUpdatePage();

    @Then("Click profile under profile icon")
    public void click_profile_under_profile_icon() {
        ReusableMethods.hardWait(1);
        adminDashboard.adminProfileButton.click();
    }

    @Then("Validate Name, salary, role, department information is visible")
    public void validateNameSalaryRoleDepartmentInformationIsVisible() {
        ReusableMethods.hardWait(2);
        Assert.assertTrue(adminProfileUpdatePage.adminProfileFirstTable.isDisplayed());
        Assert.assertTrue(adminProfileUpdatePage.adminProfileSecondTable.isDisplayed());
    }

    @Then("Verify Admin Profile Edit button is visible")
    public void verifyAdminProfileEditButtonIsVisible() {
        ReusableMethods.hardWait(1);
        Assert.assertTrue(adminProfileUpdatePage.adminProfileEditButton.isDisplayed());
    }

    @Then("Click Admin profile Edit button")
    public void clickAdminProfileEditButton() {
        ReusableMethods.hardWait(1);
        adminProfileUpdatePage.adminProfileEditButton.click();
    }

    @Then("Edit Name as {string} and click Save Change")
    public void editNameAs(String name) {
        ReusableMethods.hardWait(1);
        adminProfileUpdatePage.adminProfileUpdateNameTextbox.clear();
        adminProfileUpdatePage.adminProfileUpdateNameTextbox.sendKeys(name);
        adminProfileUpdatePage.adminUpdateProfileSaveButton.click();
    }

    @Then("Verify Success Message")
    public void verifySuccessMessage() {
        Assert.assertTrue(ReusableMethods.paymentNotificationCatcher());
    }
}
