package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;



public class AdminDashboardStepDef extends BaseStep {


    @Then("visibility of the Profile icon in the box that appears")
    public void visibility_of_the_profile_icon_in_the_box_that_appears() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminDashboardProfileBildButton));
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.adminDashboardProfileBildButton));
    }

    @And("Click the Profile button")
    public void clickTheProfileButton() {
        adminDashboard.adminDashboardProfileBildButton.click();
        ReusableMethods.hardWait(2);

    }

    @Then("visibility of the icon of the Change password link")
    public void visibility_of_the_icon_of_the_change_password_link() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminChangePasswordButton));
    }

    @Then("visibility of the Logout icon")
    public void visibility_of_the_logout_icon() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminLogoutButton));
    }

    @Then("On the page that opens, the text {string} is verified")
    public void on_the_page_that_opens_the_text_is_verified(String ticket) {
        ReusableMethods.scrollToText(Driver.getDriver(), ticket);
    }

    @Then("Click on the save button to save the ticket.")
    public void click_on_the_save_button_to_save_the_ticket() {
        ReusableMethods.scrollToElement(adminDashboard.ticketSaveButton);
        ReusableMethods.hardWait(1);
        adminDashboard.ticketSaveButton.click();
    }

    @Then("Click on the edit button in the drop-down menu")
    public void click_on_the_edit_button_in_the_drop_down_menu() {
        ReusableMethods.hardWait(2);
        JSUtilities.clickWithJS(Driver.getDriver(), adminDashboard.ticketEditButton);
    }

    @Then("Click the Save Change button to save the edits.")
    public void click_the_save_change_button_to_save_the_edits() {
        ReusableMethods.scrollToElement(adminDashboard.ticketSaveChangeButton);
        ReusableMethods.hardWait(1);
        adminDashboard.ticketSaveChangeButton.click();
    }

    @Then("The page that opens is verified")
    public void the_page_that_opens_is_verified() {
        ReusableMethods.hardWait(1);
        adminDashboard.nameText.isDisplayed();
    }

    @And("Click on the Payroll link in the left menu.")
    public void clickOnThePayrollLinkInTheLeftMenu() {

        JSUtilities.scrollToElement(Driver.getDriver(), adminDashboard.payrollText);
        adminDashboard.payrollText.click();
        ReusableMethods.hardWait(2);


    }

    @And("Click on the Salary Generate link in the left menu.")
    public void clickOnTheSalaryGenerateLinkInTheLeftMenu() {

        adminDashboard.salaryGenerateText.click();
        ReusableMethods.hardWait(2);
    }
}
