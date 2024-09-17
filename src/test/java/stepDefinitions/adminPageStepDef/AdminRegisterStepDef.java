package stepDefinitions.adminPageStepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.github.javafaker.Faker;

import pages.adminPages.AdminRegistrationPage;
import stepDefinitions.BaseStep;
import utilities.ConfigLoader;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;
import static org.junit.Assert.*;

public class AdminRegisterStepDef extends BaseStep {
    AdminRegistrationPage adminRegistrationPage = new AdminRegistrationPage();
    Faker faker = new Faker();
    @Given("Click on Sign Up Here Icon")
    public void clickOnSignUpHereIcon() {
        adminRegistrationPage.signUpHere.click();
        ReusableMethods.waitForPageToLoad(5);
    }

    @Then("Verifies Business Name, Full Name,Select Hub, Mobile, Password, Address")
    public void verifiesBusinessNameFullNameSelectHubMobilePasswordAddressBox() {
        assertTrue(adminRegistrationPage.businessName.isDisplayed());
        assertTrue(adminRegistrationPage.fullName.isDisplayed());
        assertTrue(adminRegistrationPage.mobile.isDisplayed());
        assertTrue(adminRegistrationPage.passwordBox.isDisplayed());
        assertTrue(adminRegistrationPage.addressBox.isDisplayed());
    }

    @Then("Verifies Business Name, Full Name, Mobile, Password, Address able to enter")
    public void verifiesBusinessNameFullNameMobilePasswordAddressBoxAbleToEnter() {
        assertTrue(adminRegistrationPage.businessName.isEnabled());
        assertTrue(adminRegistrationPage.fullName.isEnabled());
        assertTrue(adminRegistrationPage.mobile.isEnabled());
        assertTrue(adminRegistrationPage.passwordBox.isEnabled());
        assertTrue(adminRegistrationPage.addressBox.isEnabled());
    }

    @Then("Verifies I agree to Agile Swift Cargo Privacy Policy & Terms checkbox")
    public void verifiesIAgreeToAgileSwiftCargoPrivacyPolicyTermsCheckbox() {

        assertTrue(adminRegistrationPage.privacyPolicyCheckbox.isDisplayed());

    }

    @Then("Verifies Agile Swift Cargo Privacy Policy & Terms  text redirect to Privacy Policy & Terms page")
    public void verifiesAgileSwiftCargoPrivacyPolicyTermsTextRedirectToPrivacyPolicyTermsPage() {

        adminRegistrationPage.privacyPolicyLink.click();
        String expectedPageUrl = "https://qa.agileswiftcargo.com/privacy-and-policy";
        assertEquals(expectedPageUrl, adminRegistrationPage.driver.getCurrentUrl());


    }

    @Then("Click on the Business Name and enter the info")
    public void clickOnTheBusinessNameAndEnterTheInfo() {
        adminRegistrationPage.businessName.sendKeys(faker.company().name());
    }

    @And("Click on the Full Name and enter the info")
    public void clickOnTheFullNameAndEnterTheInfo() {
        adminRegistrationPage.fullName.sendKeys(faker.name().fullName());
    }

    @And("Click on Select Hub and enter the info")
    public void clickOnSelectHubAndEnterTheInfo() {
        adminRegistrationPage.selectHubDropdown.click();
        ReusableMethods.hardWait(2);
        adminRegistrationPage.selectHubDropdown.click();

    }

    @And("Click on the Mobile box and enter the info")
    public void clickOnTheMobileBoxAndEnterTheInfo() {
        adminRegistrationPage.mobile.sendKeys(faker.phoneNumber().subscriberNumber(11));
        ReusableMethods.hardWait(1);
    }

    @And("Click on the Password box and enter the info")
    public void clickOnThePasswordBoxAndEnterTheInfo() {
        adminRegistrationPage.passwordBox.sendKeys(faker.internet().password(6, 10));
        ReusableMethods.hardWait(1);

    }

    @And("Click on the Address box and enter the info")
    public void clickOnTheAddressBoxAndEnterTheInfo() {
        adminRegistrationPage.addressBox.sendKeys(faker.address().fullAddress());
        ReusableMethods.hardWait(1);

    }

    @And("Clicks Privacy Policy & Terms.")
    public void clicksVerifiesCheckboxVisibility() {
        adminRegistrationPage.privacyPolicyCheckbox.click();
    }

    @Then("Clicks Register Account button")
    public void clicksRegisterAccountButton() {
        adminRegistrationPage.registerMyAccButton.click();
    }

    @And("Verifies login page open")
    public void verifiesLoginPageOpen() {
        assertTrue(adminRegistrationPage.driver.getCurrentUrl().contains("login"));
    }

}