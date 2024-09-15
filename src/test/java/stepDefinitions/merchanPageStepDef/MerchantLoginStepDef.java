package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.merchantPages.MerchantLoginPage;
import utilities.ConfigLoader;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class MerchantLoginStepDef {

    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();
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


}
