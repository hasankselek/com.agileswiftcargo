package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.merchantPages.Accounts;
import pages.merchantPages.MerchantLoginPage;
import utilities.ConfigLoader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.UnhandledAlertException;

import java.time.Duration;
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
    public void verify_that_the_table_headers_is_displayed_correctly(String header1, String header2, String header3,
                                                                     String header4, String header5) {

        verifyTableHeaders(header1, header2, header3, header4, header5);

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

    @Then("Verify that the To Account and Amount fields are visible and allow data input.")
    public void verify_that_the_to_account_and_amount_fields_are_visible_and_allow_data_input() {
        Assert.assertTrue(accounts.stripeToAccountBox.isEnabled());
        Assert.assertTrue(accounts.stripeAmountBox.isEnabled());
    }

    @Then("Enter valid data into the To Account and Amount fields on the Stripe Payout Details page.")
    public void enter_valid_data_into_the_to_account_and_amount_fields_on_the_stripe_payout_details_page() {
        selectToAccount();
        enterAmount();
    }

    @Then("Click the Pay Now button.")
    public void click_the_pay_now_button() {
        clickPayNow();
    }

    @Then("Verify that the Merchant Payment window opens.")
    public void verify_that_the_merchant_payment_window_opens() {

        Assert.assertTrue(accounts.merchantPaymentWindow.isDisplayed());
    }

    @Then("Fill in the Email, Card number, MMYY, and CVC information, then click the Pay button.")
    public void fill_in_the_email_card_number_mmyy_and_cvc_information_then_click_the_pay_button() {

        enterCardInformation();
    }

    @Then("Verify that the payment is processed successfully.")
    public void verify_that_the_payment_is_processed_successfully() {

        Assert.assertTrue(ReusableMethods.paymentNotificationCatcher());

    }

    @Then("Enter valid data into the To Account but do not enter any data into the Amount field.")
    public void enter_valid_data_into_the_to_account_but_do_not_enter_any_data_into_the_amount_field() {

        selectToAccount();
    }

    @Then("Verify that the {string} notification is displayed.")
    public void verify_that_the_notification_is_displayed(String string) {
        Assert.assertTrue(ReusableMethods.paymentNotificationCatcher());

    }

    @Then("On the Stripe Payout Details page, enter non-numeric data into the Amount field while leaving the To Account field valid.")
    public void onTheStripePayoutDetailsPageEnterNonNumericDataIntoTheAmountFieldWhileLeavingTheToAccountFieldValid() {
        selectToAccount();
        enterNonNumbericAmount();
    }

    public String getPaymentLineDataText(int transactionLineNumber) {

        String xpath = "//tbody//tr[" + transactionLineNumber + "]";


        return Driver.getDriver().findElement(By.xpath(xpath)).getText();


    }

    public String getSpecificPaymentDataText(int transactionLineNumber, int transactionDataColoumn) {

        String xpath = "//tbody//tr[" + transactionLineNumber + "]//td[" + transactionDataColoumn + "]";

        return Driver.getDriver().findElement(By.xpath(xpath)).getText();
    }

    public void clickPayNow() {
        accounts.stripePayNowButton.click();
        ReusableMethods.hardWait(2); // Sabit bekleme yerine explicit wait kullanabilirsiniz

        try {
            // Kısa süreli bekleme ile alert olup olmadığını kontrol et
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());

            // Eğer alert varsa yakala ve kabul et
            Alert alert = Driver.getDriver().switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();

            // Eğer alert varsa burada işlemi sonlandırabiliriz çünkü amount boş bırakılmış
            System.out.println("Alert was handled, transaction cannot proceed.");
            return; // Alert yakalandıysa işlemi burada durduruyoruz

        } catch (TimeoutException e) {
            // Eğer alert yoksa işlemlere devam et
            System.out.println("No alert, continuing to process the transaction.");
        }


        // Alerti yönettikten sonra iframe'e geçiş yap
        Driver.getDriver().switchTo().frame(1);

    }

    public void enterCardInformation() {
        // This will be method!!!

        String email = "qweqe@gm.com";
        String cardNumber = "4242";
        String month = "12";
        String year = "26";
        String cvc = "123";

        accounts.paymentEmailBox.sendKeys(email);
        ReusableMethods.hardWait(2);
        accounts.paymentCardNumberBox.click();

        for (int i = 0; i < 4; i++) {
            accounts.paymentCardNumberBox.sendKeys(cardNumber);
            ReusableMethods.hardWait(1);
        }

        accounts.paymentMMYYBox.click();
        accounts.paymentMMYYBox.sendKeys(month);
        ReusableMethods.hardWait(1);
        accounts.paymentMMYYBox.sendKeys(year);
        ReusableMethods.hardWait(2);
        accounts.paymentCVCBox.sendKeys(cvc);
        ReusableMethods.hardWait(2);
        accounts.paymentPayButton.click();
        Driver.getDriver().switchTo().defaultContent();
    }

    public void selectToAccount() {
        Select select = new Select(accounts.stripeToAccountBox);
        select.selectByIndex(0);

    }

    public void enterAmount() {
        accounts.stripeAmountBox.click();
        accounts.stripeAmountBox.sendKeys("500");
        accounts.stripePayNowButton.click();
    }

    public void enterNonNumbericAmount() {
        accounts.stripeAmountBox.click();
        accounts.stripeAmountBox.sendKeys("abc");
    }

    public void verifyTableHeaders(String header1, String header2, String header3, String header4, String header5) {
        List<String> expectedHeaders = Arrays.asList(header1, header2, header3, header4, header5);

        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertEquals(expectedHeaders.get(i), accounts.paymentRLTHeader.get(i).getText());
        }

    }
}
