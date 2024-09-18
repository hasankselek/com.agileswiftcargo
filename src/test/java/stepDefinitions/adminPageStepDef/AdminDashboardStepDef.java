package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.adminPages.AdminDashboard;
import stepDefinitions.BaseStep;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class AdminDashboardStepDef extends BaseStep {
    AdminDashboard adminDashboard=new AdminDashboard();
    WebDriverWait  wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(4));

    @Then("visibility of the Profile icon in the box that appears")
    public void visibility_of_the_profile_icon_in_the_box_that_appears() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.AdminDashboardProfileBildButton));
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.AdminDashboardProfileBildButton));
    }
    @And("Click the Profile button")
    public void clickTheProfileButton() {
        adminDashboard.AdminDashboardProfileBildButton.click();
        ReusableMethods.hardWait(6);

    }
    @Then("visibility of the icon of the Change password link")
    public void visibility_of_the_icon_of_the_change_password_link() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.AdminChangePasswordButton));
    }
    @Then("visibility of the Logout icon")
    public void visibility_of_the_logout_icon() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.AdminLogoutButton));
    }


}
