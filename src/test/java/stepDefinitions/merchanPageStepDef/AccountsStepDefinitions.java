package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MerchantPages.Accounts;
import pages.merchantPages.MerchantLoginPage;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class AccountsStepDefinitions {

    ConfigLoader configLoader = new ConfigLoader();
    Accounts accounts = new Accounts();
    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();


    @Given("Go to the {string}")
    public void go_to_the(String string) {
        Driver.getDriver().get(configLoader.getConfigValue("homepageUrl"));

    }

    @Then("Login as an merchant")
    public void login_as_an_merchant() {

        merchantLoginPage.directlyLoginAsMerchant(6);

    }

    @Then("Click on the {string} link in the left menu.")
    public void click_on_the_link_in_the_left_menu(String string) {
        ReusableMethods.findMenuItemByTextMerchant(Driver.getDriver(), string).click();
        ReusableMethods.hardWait(1);

    }

    @Then("Verify that the {string} link under Accounts is visible and clickable.")
    public void verify_that_the_link_under_is_visible_and_clickable(String string) {

        Assert.assertTrue(ReusableMethods.findMenuItemByTextMerchant(Driver.getDriver(), string).isDisplayed());
        Assert.assertTrue(ReusableMethods.findMenuItemByTextMerchant(Driver.getDriver(), string).isEnabled());

    }

    @Then("Verify that the {string} page loads correctly by checking the page title and URL.")
    public void verify_that_the_page_loads_correctly_by_checking_the_page_title_and_url(String menuName) {

        String expectedTitle = menuName;
        String actualTitle = accounts.menuPageLabel.getText();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Given("Verify that {string} table is displayed")
    public void verify_that_table_is_displayed(String string) {
        Assert.assertTrue(accounts.paymentReceivedListTable.isDisplayed());

    }

    @Given("Verify that the table headers {string}, {string}, {string}, {string}, {string} is displayed correctly.")
    public void verify_that_the_table_headers_is_displayed_correctly(String header1, String header2, String header3, String header4, String header5) {

        List<String> expectedHeaders = Arrays.asList(header1, header2, header3, header4, header5);

        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertEquals(expectedHeaders.get(i), accounts.paymentRLTHeader.get(i).getText());
        }


    }

    @And("Verify that Payout List have at least {int} data")
    public void verifyThatPayoutListHaveAtLeastData(int numberOfLines) {
        Assert.assertTrue(accounts.transactionsListAllData.size() > numberOfLines);
    }

    @Then("Verify if the Stripe logo is visible")
    public void verify_if_the_logo_is_visible() {
        Assert.assertTrue(accounts.stripeLogo.isDisplayed());
    }

    @Then("Verify that the Stripe link is visible and clickable.")
    public void verify_that_the_stripe_link_is_visible_and_clickable() {

        Assert.assertTrue(accounts.stripeButton.isEnabled());

    }

    @Then("Click on the Stripe link.")
    public void click_on_the_stripe_link() {
        accounts.stripeButton.click();
    }

    @Then("Verify that Stripe link redirected to the relevant page.")
    public void verify_that_stripe_link_redirected_to_the_relevant_page() {

        String expectedLabel = "Stripe Payout Details";

        Assert.assertEquals(expectedLabel, accounts.stripeMenuLabel.getText());
    }


    public String getPaymentLineDataText(int transactionLineNumber) {

        String xpath = "//tbody//tr[" + transactionLineNumber + "]";

        return Driver.getDriver().findElement(By.xpath(xpath)).getText();

    }

    public String getSpecificPaymentDataText(int transactionLineNumber, int transactionDataColoumn) {

        String xpath = "//tbody//tr[" + transactionLineNumber + "]//td[" + transactionDataColoumn + "]";

        return Driver.getDriver().findElement(By.xpath(xpath)).getText();
    }


}
