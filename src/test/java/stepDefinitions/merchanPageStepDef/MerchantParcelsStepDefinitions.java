package stepDefinitions.merchanPageStepDef;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantLoginPage;
import pages.merchantPages.MerchantParcelsPage;
import stepDefinitions.BaseStep;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;
import static org.junit.Assert.assertEquals;


public class MerchantParcelsStepDefinitions extends BaseStep {


    MerchantDashboard merchantDashboard=new MerchantDashboard();
    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();
    HomePage homePage = new HomePage();
    MerchantParcelsPage merchantParcelsPage=new MerchantParcelsPage();

    ExcelDataReader reader = new ExcelDataReader(merchantLoginPage.configLoader.getConfigValue("testData"),"merchantLogin");


    @Then("the parcels table should be visible under the parcels heading")
    public void the_parcels_table_should_be_visible_under_the_parcels_heading() {
        merchantParcelsPage.parcelsTable.isDisplayed();

    }
    @Then("the {string} and {string} buttons should be visible on the parcels list")
    public void the_and_buttons_should_be_visible_on_the_parcels_list(String string, String string2) {
        merchantParcelsPage.csvButton.isDisplayed();
        merchantParcelsPage.excelButton.isDisplayed();
    }
    @Then("the {string} and {string} buttons should be functional")
    public void the_and_buttons_should_be_functional(String exel, String csv) {
        Assert.assertTrue(merchantParcelsPage.csvButton.getText().contains(csv));
        Assert.assertTrue(merchantParcelsPage.excelButton.getText().contains(exel));
    }
    @Then("the user clicks on the {string} button on the parcels page")
    public void the_user_clicks_on_the_button_on_the_parcels_page(String addtext) {
        merchantParcelsPage.addButton.click();

    }
    @Then("the user should be redirected to the Create Parcel page")
    public void the_user_should_be_redirected_to_the_create_parcel_page() {
        assertEquals(homePage.configLoader.getConfigValue("parcelcreateUrl"),merchantParcelsPage.driver.getCurrentUrl());

    }
    @Then("Fill in the cargo creation form under the text Creat parcels")
    public void fill_in_the_cargo_creation_form_under_the_text_creat_parcels() {
        merchantParcelsPage.cashButton.sendKeys("60");
        merchantParcelsPage.sellingButton.sendKeys("200");
        ReusableMethods.sendKeysWithActions(merchantParcelsPage.invoysButton,"INV12345");
       ReusableMethods.sendKeysWithActions(merchantParcelsPage.custumerNameButton,"Bugra");
        ReusableMethods.hardWait(10);
        ReusableMethods.selectFromDropdownAndEnterText(merchantParcelsPage.categorytButton, "KG"
                ,merchantParcelsPage.kgText,"2KG");

       ReusableMethods.hardWait(10);


       ReusableMethods.sendKeysWithActions(merchantParcelsPage.customerPhoneButton,"12312312312");
       ReusableMethods.hardWait(10);

       ReusableMethods.scrollToElement(merchantParcelsPage.saveButton);
       ReusableMethods.hardWait(10);

        merchantParcelsPage.addressButton.sendKeys("1234 Main st");
        ReusableMethods.hardWait(10);
        ReusableMethods.sendKeysWithActions(merchantParcelsPage.noteButton,"Kargom nerede");

        ReusableMethods.hardWait(5);
        merchantParcelsPage.parcellbankButton.click();
        ReusableMethods.hardWait(3);

    }
    @Then("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
        merchantParcelsPage.saveButton.click();


    }
    @Then("the user should be redirected to the import page")
    public void the_user_should_be_redirected_to_the_import_page() {
        merchantParcelsPage.importButton.isDisplayed();
        ReusableMethods.hardWait(10);

        ReusableMethods.hardWait(10);
        assertEquals(homePage.configLoader.getConfigValue("importUrl"),merchantParcelsPage.driver.getCurrentUrl());
    }









}
