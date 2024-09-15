package stepDefinitions.merchanPageStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.merchantPages.MerchantRegistrationPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MerchantRegisterStepDef {

    MerchantRegistrationPage merchantRegistrationPage = new MerchantRegistrationPage();
    Faker faker = new Faker();
    




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

        merchantRegistrationPage.businessNameBox.sendKeys(faker.company().name());


    }

    @Then("Enters into Full Name box")
    public void entersIntoFullNameBox() {

        merchantRegistrationPage.fullNameBox.sendKeys(faker.name().fullName());
    }

    @And("Selects hub")
    public void selectsHub() {

        merchantRegistrationPage.selectHubDropdown.click();

        merchantRegistrationPage.newYorkHub.click();
        ReusableMethods.hardWait(2);
        merchantRegistrationPage.selectHubDropdown.click();
    }

    @And("Enters into Mobile box")
    public void entersIntoMobileBox() {

        merchantRegistrationPage.mobileBox.sendKeys(faker.phoneNumber().subscriberNumber(11));
        ReusableMethods.hardWait(1);
    }

    @Then("Enters into Password box")
    public void entersIntoPasswordBox() {

        merchantRegistrationPage.passwordBox.sendKeys(faker.internet().password(6,10));
        ReusableMethods.hardWait(1);

    }

    @Then("Enters into Address box")
    public void entersIntoAddressBox() {

        merchantRegistrationPage.addressBox.sendKeys(faker.address().fullAddress());
        ReusableMethods.hardWait(1);

    }

    @When("Clicks Privacy Policy & Terms. checkbox")
    public void clicksPrivacyPolicyTermsCheckbox() {

        merchantRegistrationPage.privacyPolicyCheckbox.click();
    }

    @And("Verifies login page opens")
    public void verifiesLoginPageOpens() {

        assertTrue(merchantRegistrationPage.driver.getCurrentUrl().contains("login"));

    }


    @Then("Clicks Register My Account button")
    public void clicksRegisterMyAccountButton() {

        merchantRegistrationPage.registerMyAccButton.click();
    }


    @And("Verifies warning message visiblty")
    public void verifiesWarningMessageVisiblty() {

        merchantRegistrationPage.warningMessage.isDisplayed();


    }

    @Then("Enters wrong format password into Password box")
    public void entersWrongFormatPasswordIntoPasswordBox() {

        merchantRegistrationPage.passwordBox.sendKeys(faker.internet().password(1,5));

    }


}
