package stepDefinitions.adminPageStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.adminPages.AdminDashboard;
import pages.adminPages.AdminProfilPage;
import pages.adminPages.AdminRegistrationPage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

import java.time.Duration;


public class AdminDashboardChangePasswordStepDef extends BaseStep {
    AdminDashboard adminDashboard = new AdminDashboard();
    AdminProfilPage adminProfilPage=new AdminProfilPage();
    AdminRegistrationPage adminRegistrationPage = new AdminRegistrationPage();
    Faker faker = new Faker();
    String oldPass ="Agile.0924";
    String newPass ="123456";
    String enteredOldPassword="";
    String enteredNewPassword="";
    String enteredConfirmPassword="";
    ExcelDataReader reader = new ExcelDataReader(adminDashboard.configLoader.getConfigValue("testData"),"adminLogin");
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
    @Then("Click on the icon of the Change password link")
    public void click_on_the_icon_of_the_change_password_link() {
        adminDashboard.adminChangePasswordButton.click();
    }
    @Then("visibility of the Old Password box on the opened page")
    public void visibility_of_the_old_password_box_on_the_opened_page() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminChangePasswordOldButton));
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.adminChangePasswordOldButton));
    }
    @Then("visibility of the New Password box")
    public void visibility_of_the_new_password_box() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminChangePasswordNewButton));
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.adminChangePasswordNewButton));
    }
    @Then("visibility of the Confirm Password box")
    public void visibility_of_the_confirm_password_box() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminChangePasswordConfirmButton));
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.adminChangePasswordConfirmButton));
    }
    @Then("visibility of the Save Change button")
    public void visibility_of_the_save_change_button() {
        Assert.assertTrue(ReusableMethods.isElementVisible(adminDashboard.adminChangePasswordSaveChange));
        wait.until(ExpectedConditions.elementToBeClickable(adminDashboard.adminChangePasswordSaveChange));
    }


    @Given("On the Change Password page, enter the password registered in the system in the Old password box")
    public void onTheChangePasswordPageEnterThePasswordRegisteredInTheSystemInTheOldPasswordBox() {
        adminDashboard.adminChangePasswordOldButton.sendKeys(oldPass);
        ReusableMethods.hardWait(1);

    }

    @And("Enter a new password in the New Password box")
    public void enterANewPasswordInTheNewPasswordBox() {
        adminDashboard.adminChangePasswordNewButton.sendKeys(newPass);

    }

    @And("Enter the new password in the Confirm Password box")
    public void enterTheNewPasswordInTheConfirmPasswordBox() {
        adminDashboard.adminChangePasswordConfirmButton.sendKeys(newPass);
        ReusableMethods.hardWait(1);
    }

    @Then("Test that passwords are entered correctly")
    public void testThatPasswordsAreEnteredCorrectly() {
        enteredOldPassword = adminDashboard.adminChangePasswordOldButton.getAttribute("value");
        enteredNewPassword = adminDashboard.adminChangePasswordNewButton.getAttribute("value");
        enteredConfirmPassword = adminDashboard.adminChangePasswordConfirmButton.getAttribute("value");
        Assert.assertEquals("Eski şifre doğru girilmedi", oldPass, enteredOldPassword);
        Assert.assertEquals("Yeni şifre doğru girilmedi", newPass, enteredNewPassword);
        Assert.assertEquals("Onay şifresi doğru girilmedi", newPass, enteredConfirmPassword);
    }

    @Given("Click on the Save Change")
    public void clickOnTheSaveChangeButton() {
        adminDashboard.adminChangePasswordSaveChange.click();
        ReusableMethods.hardWait(2);
    }

    @Then("test whether the old password and the new password have changed")
    public void testWhetherTheOldPasswordAndTheNewPasswordHaveChanged() {
    Assert.assertTrue(ReusableMethods.paymentNotificationCatcher());
    }
}
