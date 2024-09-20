package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.*;

import stepDefinitions.BaseStep;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class AdminLoginStepDef extends BaseStep {

    ExcelDataReader reader = new ExcelDataReader(adminLoginPage.configLoader.getConfigValue("testData"), "adminLogin");

    @Given("Enters home page {string}")
    public void enterHomePage(String homePageUrl) {
        adminLoginPage.driver.get(adminLoginPage.configLoader.getConfigValue(homePageUrl));

    }

    @Then("Enters row {int} in Email")
    public void entersRowColumnInEmail(int rowNo) {
        String email = reader.getCellData(rowNo, 1);
        adminLoginPage.email.sendKeys(email);
    }

    @Then("Enters row {int} in Password")
    public void entersRowColumnInPassword(int rowNo) {
        String password = reader.getCellData(rowNo, 2);
        adminLoginPage.password.sendKeys(password);
    }

    @And("Clicks Sign In Button Admin")
    public void clicksSignInButton() {
        adminLoginPage.signInButton.click();
        ReusableMethods.waitForPageToLoad(2);
    }

    @And("Clicks the login button")
    public void clicksLoginButton() {
        adminLoginPage.loginButton.click();
    }

    @Then("Verifies Admin Dashboard page opens")
    public void verifiesAdminDashboardPageOpens() {
        ReusableMethods.waitForPageToLoad(2);
        assertTrue(adminLoginPage.driver.getCurrentUrl().contains("dashboard"));
    }

    @Then("Click on the logo")
    public void clickOnTheLogo() {
        adminLoginPage.logo.click();
        ReusableMethods.waitForPageToLoad(2);
    }

    @Then("User is redirected to the homepage")
    public void userIsRedirectedToTheHomepage() {
        assertEquals(adminLoginPage.configLoader.getConfigValue("homepageUrl"), adminLoginPage.driver.getCurrentUrl());
    }


    @Given("Click on Sign Up Here")
    public void clickOnSignUpHere() {
        adminLoginPage.signUpHere.click();
        ReusableMethods.waitForPageToLoad(5);

    }

    @And("Als Admin,Verifies {string} button is visible and redirect to {string}.")
    public void alsAdminVerifiesButtonIsVisibleAndRedirectTo(String arg0, String arg1) {
    }

    @And("test the visibility of the Forgot Password icon on the opened page")
    public void testTheVisibilityOfTheForgotPasswordIconOnTheOpenedPage() {
        assertTrue(adminLoginPage.forgotPasswordButton.isDisplayed());
    }

    @And("Click on the Forgot Password icon")
    public void clickOnTheIcon() {
        adminLoginPage.forgotPasswordButton.click();
    }

    @And("test the visibility of the Email Address text box")
    public void testTheVisibilityOfTheEmailAddressTextBoxAndEnterANewEmailAddress() {
        assertTrue(adminLoginPage.forgotEmailTextBox.isDisplayed());
        ReusableMethods.hardWait(2);
    }

    @And("Test the visibility of the `Send Password Reset Link` Icon")
    public void testTheVisibilityOfTheSendPasswordResetLinkIcon() {
        assertTrue(adminLoginPage.sendPassResetLinkButton.isDisplayed());
    }

    @And("enter a new Email Address and click on the link")
    public void enterANewEmailAddressAndClickOnTheLink() {
        String email = "gulcihan.admin@agileswiftcargo.com";
        adminLoginPage.forgotEmailTextBox.sendKeys(email);
        ReusableMethods.hardWait(2);
        adminLoginPage.sendPassResetLinkButton.click();
        ReusableMethods.hardWait(2);
    }

    @Then("Test that Verifies email has been sent to the entered email address")
    public void testThatVerifiesEmailHasBeenSentToTheEnteredEmailAddress() {
        String succesText = "We have emailed your password reset link!";
        assertTrue(adminLoginPage.succesAlerttext.isDisplayed());
        assertEquals(adminLoginPage.succesAlerttext.getText(), succesText);
    }
}


