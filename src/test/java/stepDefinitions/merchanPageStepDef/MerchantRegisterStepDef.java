package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.merchantPage.MerchantRegistrationPage;
import utilities.ExcelDataReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MerchantRegisterStepDef {

    MerchantRegistrationPage merchantRegistrationPage = new MerchantRegistrationPage();




    @Then("Verifies Business Name, Full Name, Mobile, Password, Address box visibility")
    public void verifiesBusinessNameFullNameMobilePasswordAddressBoxVisibility() {
        assertTrue(merchantRegistrationPage.businessNameBox.isDisplayed());
        assertTrue(merchantRegistrationPage.fullNameBox.isDisplayed());
        assertTrue(merchantRegistrationPage.mobileBox.isDisplayed());
        assertTrue(merchantRegistrationPage.passwordBox.isDisplayed());
        assertTrue(merchantRegistrationPage.addressBox.isDisplayed());

    }

    @Then("Verifies Business Name, Full Name, Mobile, Password, Address box able to entering")
    public void verifiesBusinessNameFullNameMobilePasswordAddressBoxAbleToEntering() {

        assertTrue(merchantRegistrationPage.businessNameBox.isEnabled());
        assertTrue(merchantRegistrationPage.fullNameBox.isEnabled());
        assertTrue(merchantRegistrationPage.mobileBox.isEnabled());
        assertTrue(merchantRegistrationPage.passwordBox.isEnabled());
        assertTrue(merchantRegistrationPage.addressBox.isEnabled());

    }

    @Then("Verifies I agree to Agile Swift Cargo Privacy Policy & Terms checkbox visibilty")
    public void verifiesIAgreeToAgileSwiftCargoPrivacyPolicyTermsCheckboxVisibilty() {

        assertTrue(merchantRegistrationPage.privacyPolicyCheckbox.isDisplayed());

    }

    @Then("Verifies I agree to Agile Swift Cargo Privacy Policy & Terms  text redirect to Privacy Policy & Terms page")
    public void verifiesIAgreeToAgileSwiftCargoPrivacyPolicyTermsTextRedirectToPrivacyPolicyTermsPage() {

        merchantRegistrationPage.privacyPolicyLink.click();

        String expectedPageUrl="https://qa.agileswiftcargo.com/privacy-and-policy";

        assertEquals(expectedPageUrl,merchantRegistrationPage.driver.getCurrentUrl());


    }


    @Then("Clicks register button")
    public void clicksRegisterButton() {
        merchantRegistrationPage.registerButton.click();
    }

    @Then("Enters into Business Name box")
    public void entersIntoBusinessNameBox() {

    }

    @Then("Enters into Full Name box")
    public void entersIntoFullNameBox() {
    }

    @And("Selects hub")
    public void selectsHub() {
    }

    @And("Enters into Mobile box")
    public void entersIntoMobileBox() {
    }

    @Then("Enters into Password box")
    public void entersIntoPasswordBox() {
    }

    @Then("Enters into Address box")
    public void entersIntoAddressBox() {
    }

    @When("Clicks Privacy Policy & Terms. checkbox")
    public void clicksPrivacyPolicyTermsCheckbox() {
    }

    @And("Verifies login page opens")
    public void verifiesLoginPageOpens() {
    }



}
