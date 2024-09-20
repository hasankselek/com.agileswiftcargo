package stepDefinitions.merchanPageStepDef;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.homePages.HomePage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantLoginPage;
import pages.merchantPages.MerchantParcelsPage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.ExcelDataReader;
import utilities.JSUtilities;
import utilities.ReusableMethods;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MerchantParcelsStepDefinitions extends BaseStep {


    MerchantDashboard merchantDashboard=new MerchantDashboard();
    MerchantLoginPage merchantLoginPage = new MerchantLoginPage();
    HomePage homePage = new HomePage();
    MerchantParcelsPage merchantParcelsPage=new MerchantParcelsPage();

    ExcelDataReader reader = new ExcelDataReader(merchantLoginPage.configLoader.getConfigValue("testData"),"merchantLogin");

    public static String trackID;

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
        assertTrue(merchantParcelsPage.csvButton.getText().contains(csv));
        assertTrue(merchantParcelsPage.excelButton.getText().contains(exel));
    }
    @Then("the user clicks on the {string} button on the parcels page")
    public void the_user_clicks_on_the_button_on_the_parcels_page(String addtext) {
        ReusableMethods.clickWithText(addtext);

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
        ReusableMethods.hardWait(2);
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.categorytButton);
        merchantParcelsPage.categorytButton.click();
        ReusableMethods.hardWait(2);
        merchantParcelsPage.selectKG.click();
        ReusableMethods.hardWait(2);
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.selectDeliveryTypeButton);
        ReusableMethods.hardWait(3);

        merchantParcelsPage.selectDeliveryTypeButton.click();
        ReusableMethods.hardWait(1);
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.selectSumDay);
        ReusableMethods.hardWait(1);
        merchantParcelsPage.selectSumDay.click();

        ReusableMethods.hardWait(2);
        merchantParcelsPage.custumerNameButton.sendKeys("Bugra");
        ReusableMethods.hardWait(1);
        merchantParcelsPage.customerPhoneButton.sendKeys("12345665432");
        ReusableMethods.hardWait(1);
        merchantParcelsPage.addressButton.sendKeys("1234 Main st");

    }
    @Then("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {

        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.saveButton);
        merchantParcelsPage.saveButton.click();


    }
    @Then("the user clicks on the Import button on the parcels page")
    public void the_user_clicks_on_the_import_button_on_the_parcels_page() {
        merchantParcelsPage.importButton.isDisplayed();
        ReusableMethods.hardWait(3);

        merchantParcelsPage.importButton.click();
        ReusableMethods.hardWait(3);

    }

    //11
    @Then("the {string} button should be visible")
    public void the_download_sample_button_should_be_visible(String downloadtext) {
        merchantParcelsPage.downloadSampleButton.isDisplayed();

    }
    @Then("the {string} button should be functional")
    public void the_download_sample_button_should_be_functional(String downloadtext) {
        merchantParcelsPage.downloadSampleButton.click();
        ReusableMethods.hardWait(5);

    }

    @Then("the user clicks the {string} File button to upload a file")
    public void the_user_clicks_the_choose_file_button_to_upload_a_file(String coose) {
        merchantParcelsPage.cooseButton.click();

    }
    @Then("the user uploads a parcels import Excel file")
    public void the_user_uploads_a_parcels_import_excel_file() {





    }
    @Then("the user verifies that the uploaded file contains the list of parcels")
    public void the_user_verifies_that_the_uploaded_file_contains_the_list_of_parcels() {

    }

    @Then("the user clicks the {string} button for a parcel")
    public void the_user_clicks_the_button_for_a_parcel(String dataicon) {
        merchantParcelsPage.dropdownButton.click();
        ReusableMethods.hardWait(2);

    }
    @Then("the user should see the {string} link for a parcel")
    public void the_user_should_see_the_link_for_a_parcel(String string) {
        merchantParcelsPage.viewtext.isDisplayed();
        ReusableMethods.hardWait(2);

    }
    @Then("the {string} link should be functional")
    public void the_link_should_be_functional(String string) {
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.viewtext);
        ReusableMethods.hardWait(2);
        assertTrue(merchantParcelsPage.viewtext.isSelected());


    }
    @When("the user selects {string} from the menu")
    public void the_user_selects_from_the_menu(String string) {
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.parcelLogsButton);
        assertTrue(merchantParcelsPage.parcelLogsButton.isSelected());



        //14

    }
    @Then("the user should see the location and status updates of the parcel on the page")
    public void the_user_should_see_the_location_and_status_updates_of_the_parcel_on_the_page() {
        merchantParcelsPage.parcelsTable.isDisplayed();
    }
    @Then("the user should see a new copy of the parcel created")
    public void the_user_should_see_a_new_copy_of_the_parcel_created() {
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.cloneButton);
        assertTrue(merchantParcelsPage.cloneButton.isSelected());

    }
    @Then("the {string} option should be functional")
    public void the_option_should_be_functional(String string) {
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.editButton);
        assertTrue(merchantParcelsPage.deletButton.isSelected());
        ReusableMethods.hardWait(3);
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.submitButton);


    }

    @When("the user selects {string}")
    public void the_user_selects(String string) {
        JSUtilities.clickWithJS(Driver.getDriver(),merchantParcelsPage.deletButton);


    }


    @Then("the user should be redirected to the import page")
    public void theUserShouldBeRedirectedToTheImportPage() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://qa.agileswiftcargo.com/merchant/parcel/import-parcel");
        ReusableMethods.hardWait(2);
        ReusableMethods.uploadFile(configLoader.getConfigValue("testExcel"),merchantParcelsPage.importPath);
        ReusableMethods.hardWait(3);
        merchantParcelsPage.importButton2.click();
        ReusableMethods.hardWait(2);
        trackID = merchantParcelsPage.trackingID.getText();
    }

    public String getTrackingID(){

        return trackID;
    }

}
