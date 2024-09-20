package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.merchantPages.MerchantAccInvoicePage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.ReusableMethods;

public class MerchantAccInvoiceStepDef extends BaseStep {

    MerchantAccInvoicePage merchantAccInvoicePage = new MerchantAccInvoicePage();

    @Then("Clicks Accounts menu on left side")
    public void clicks_accounts_menu_on_left_side() {
        ReusableMethods.hardWait(1);
        merchantAccInvoicePage.accountsMenuMerch.click();
    }

    @Then("Verify that the Invoice link under Accounts is visible and clickable.")
    public void verifyThatTheInvoiceLinkUnderAccountsIsVisibleAndClickable() {
        ReusableMethods.hardWait(1);
        Assert.assertTrue(merchantAccInvoicePage.invoiceMenuMerch.isDisplayed());
        Assert.assertTrue(merchantAccInvoicePage.invoiceMenuMerch.isEnabled());
    }

    @Then("Clicks Invoice section under Accounts")
    public void clicksInvoiceSectionUnderAccounts() {
        merchantAccInvoicePage.invoiceMenuMerch.click();
    }

    @Then("Verify invoice list is displayed")
    public void verifyInvoiceListIsDisplayed() {
        Assert.assertTrue(merchantAccInvoicePage.invoiceListTableMerch.isDisplayed());
    }
}
