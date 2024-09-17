package stepDefinitions.adminPageStepDef;




import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.adminPages.AdminProfilPage;
import stepDefinitions.BaseStep;
import utilities.ConfigLoader;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;
import static org.junit.Assert.*;

public class AdminLoginStepDef extends BaseStep {

    AdminProfilPage adminLoginPage = new AdminProfilPage();
    ExcelDataReader reader = new ExcelDataReader(adminLoginPage.configLoader.getConfigValue("testData"),"adminLogin");


    @Given("Enters home page {string}")
    public void enterHomePage(String homePageUrl) {
        adminLoginPage.driver.get(adminLoginPage.configLoader.getConfigValue(homePageUrl));

    }
    @Then("Enters row {int} in Email")
    public void entersRowColumnInEmail(int rowNo) {
        String email = reader.getCellData(rowNo,1);
        adminLoginPage.email.sendKeys(email);
    }

    @Then("Enters row {int} in Password")
    public void entersRowColumnInPassword(int rowNo) {
        String password = reader.getCellData(rowNo,2);
        adminLoginPage.password.sendKeys(password);

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
        assertEquals(adminLoginPage.configLoader.getConfigValue("homepageUrl"),adminLoginPage.driver.getCurrentUrl());
    }


    @Given("Click on Sign Up Here")
    public void clickOnSignUpHere() {
        adminLoginPage.signUpHere.click();
        ReusableMethods.waitForPageToLoad( 5);
    }


}


