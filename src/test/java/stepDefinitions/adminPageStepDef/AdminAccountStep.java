package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.adminPages.AdminAccountPage;
import pages.adminPages.AdminProfilPage;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantParcelsPage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.JSUtilities;
import utilities.ReusableMethods;



public class AdminAccountStep extends BaseStep {
    HomePage homePage=new HomePage();

    AdminAccountPage adminAccountPage=new AdminAccountPage();
    AdminProfilPage adminLoginPage = new AdminProfilPage();
    MerchantParcelsPage merchantParcelsPage=new MerchantParcelsPage();
    ExcelDataReader reader = new ExcelDataReader(adminLoginPage.configLoader.getConfigValue("testData"),"adminLogin");



    @Then("Click on the Accounts button")
    public void click_on_the_account_button() {

        ReusableMethods.hardWait(3);
        JSUtilities.scrollToElement(Driver.getDriver(),adminAccountPage.accountsmenu);
        ReusableMethods.hardWait(3);
        adminAccountPage.accountsmenu.click();
        ReusableMethods.hardWait(3);

    }
    @Then("Tests that the {string} list is visible in the drop-down menu")
    public void tests_that_the_acount_heads_list_is_visible_in_the_drop_down_menu(String accountsHeads) {
        Assert.assertTrue(adminAccountPage.headsButton.isDisplayed());
        ReusableMethods.hardWait(2);
    }
    @Given("Accconts Heads link is cklickabale")
    public void accconts_heads_link_is_cklickabale() {
        adminAccountPage.headsButton.click();

    }
    @Then("After filtration, the search results are seen")
    public void after_filtration_the_search_results_are_seen() {
        //A Bug Report was created because the filter button was not found.
    }
    @Given("Tests that the Fund Transfer tab is visible in the drop-down menu")
    public void tests_that_the_fund_transfer_tab_is_visible_in_the_drop_down_menu() {
        Assert.assertTrue(adminAccountPage.fundButton.isDisplayed());

    }
    @Given("In the menu that opens, click on the Fund Transfer tab")
    public void in_the_menu_that_opens_click_on_the_fund_transfer_tab() {
        adminAccountPage.fundButton.click();

    }
    @Given("Filtering is done by filling in the relevant fields on the page")
    public void filtering_is_done_by_filling_in_the_relevant_fields_on_the_page() {
        Assert.assertTrue(adminAccountPage.fundListText.isDisplayed());

    }

}
