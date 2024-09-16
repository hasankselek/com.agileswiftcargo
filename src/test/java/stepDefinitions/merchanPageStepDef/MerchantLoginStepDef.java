package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantLoginPage;
import utilities.ConfigLoader;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class MerchantLoginStepDef {

    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();
    HomePage homePage = new HomePage();
    ExcelDataReader reader = new ExcelDataReader(merchantLoginPage.configLoader.getConfigValue("testData"),"merchantLogin");


    @And("Clicks Sign In button")
    public void clicksSignInButton() {

        merchantLoginPage.signInButton.click();


    }

    @Then("Verifies Merchant Dashboard page opens")
    public void verifiesMerchantDashboardPageOpens() {

        ReusableMethods.waitForPageToLoad(2);

        assertTrue(merchantLoginPage.driver.getCurrentUrl().contains("dashboard"));
        System.out.println(merchantLoginPage.driver.getCurrentUrl());

    }

    @Then("Enters row {int} in Email Address textbox")
    public void entersRowColumnInEmailAddressTextbox(int rowNo) {

        String email = reader.getCellData(rowNo,1);
        merchantLoginPage.emailBox.sendKeys(email);


    }

    @Then("Enters row {int} in Password textbox")
    public void entersRowColumnInPasswordTextbox(int rowNo) {


        String password = reader.getCellData(rowNo,2);
        merchantLoginPage.passwordBox.sendKeys(password);

    }


    @Then("Verifies Merchant Dashboard page can't opens")
    public void verifiesMerchantDashboardPageCanTOpens() {

        ReusableMethods.hardWait(1);
        assertTrue(merchantLoginPage.warningMessage.isDisplayed());


    }

    @Then("Verifies logo visibility")
    public void verifiesLogoVisibility() {

        assertTrue(merchantLoginPage.siteLogo.isDisplayed());
    }

    @Then("Clicks the logo and verifies redirect to homepage")
    public void clicksTheLogoAndVerifiesRedirectToHomepage() {

        merchantLoginPage.siteLogo.click();
        assertTrue(homePage.ourServicesHeader.isDisplayed());

    }

    @And("Returns to login page")
    public void returnsToLoginPage() {

        merchantLoginPage.driver.navigate().back();

    }

    @Then("Verifies Enter Email or Mobile, Password text boxes and Sign In button visibility and functionality")
    public void verifiesEnterEmailOrMobilePasswordTextBoxesAndSignInButtonVisibilityAndFunctionality() {

        assertTrue(merchantLoginPage.emailBox.isDisplayed());
        assertTrue(merchantLoginPage.passwordBox.isDisplayed());
        assertTrue(merchantLoginPage.signInButton.isDisplayed());

    }

    @Then("Verifies {string} button is visible and redirect to {string}.")
    public void verifiesButtonIsVisibleAndRedirectTo(String buttonName, String siteName) {





    }

    @Then("Clicks {string} link")
    public void clicksLink(String linkText) {
        merchantLoginPage.clickEasyLinks(linkText);

    }

    @And("Verifies Forgot Password link visiblity")
    public void verifiesForgotPasswordLinkVisiblity() {
        assertTrue(merchantLoginPage.forgotPasswordLink.isDisplayed());
    }


}
