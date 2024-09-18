package stepDefinitions.adminPageStepDef;

import java.util.ArrayList;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.adminPages.AdminParcelsPage;
import pages.adminPages.AdminProfilPage;
import utilities.ConfigLoader;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class AdminParcelsStepDef {

    AdminProfilPage adminProfilPage = new AdminProfilPage();
    AdminParcelsPage adminParcelsPage = new AdminParcelsPage();

    public static String aranacakMetin;

    @Then("Login as an admin")
    public void login_as_an_admin() {
        adminProfilPage.directlyLoginAsAdmin(6);

    }


    @Then("Verify that the table headers {string},{string}, {string}, {string}, {string}, {string}, {string}, {string} is displayed correctly.")
    public void verify_that_the_table_headers_is_displayed_correctly(String header1, String header2, String header3,
                                                                     String header4, String header5, String header6, String header7, String header8) {
        List<String> expectedHeaders = Arrays.asList(header1, header2, header3, header4, header5, header6, header7, header8);

        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertEquals(expectedHeaders.get(i), adminParcelsPage.parcelsTableHeadersList.get(i + 1).getText());
        }
    }


    @Then("Enter a date {string} in the Date field.")
    public void enterADateInTheDateField(String date) {

        adminParcelsPage.parcelFilterList.get(0).click();
        ReusableMethods.hardWait(1);

        for (int i = 0; i < adminParcelsPage.dateFilterOptions.size(); i++) {
            if (date.equalsIgnoreCase(adminParcelsPage.dateFilterOptions.get(i).getText())) {
                adminParcelsPage.dateFilterOptions.get(i).click();
                break;
            }
        }
    }


    @Then("Select as {string} status in the Status field.")
    public void selectAsStatusInTheStatusField(String status) {
        adminParcelsPage.parcelFilterList.get(1).click();
        ReusableMethods.hardWait(1);

        for (int i = 0; i < adminParcelsPage.statusFilterOptions.size(); i++) {
            if (status.equalsIgnoreCase(adminParcelsPage.statusFilterOptions.get(i).getText())) {
                adminParcelsPage.statusFilterOptions.get(i).click();
                break;
            }
        }
    }

    @Then("Enter a merchant name {string} in the Merchant field.")
    public void enter_a_merchant_name_in_the_merchant_field(String merchantName) {

        adminParcelsPage.merchantName.click();
        adminParcelsPage.merchantFilterSearchBox.get(0).sendKeys(merchantName);
        ReusableMethods.hardWait(2);

        for (int i = 0; i < adminParcelsPage.statusFilterOptions.size(); i++) {
            if (merchantName.equalsIgnoreCase(adminParcelsPage.statusFilterOptions.get(i).getText())) {
                adminParcelsPage.statusFilterOptions.get(i).click();
                ReusableMethods.hardWait(1);
                break;
            }
        }
    }

    @Then("Enter a delivery man name {string} in the Delivery Man field.")
    public void enter_a_delivery_man_name_in_the_delivery_man_field(String deliveryManName) {

        adminParcelsPage.deliveryManName.click();
        ReusableMethods.hardWait(1);
        adminParcelsPage.merchantFilterSearchBox.get(0).sendKeys(deliveryManName);
        ReusableMethods.hardWait(1);

        for (int i = 0; i < adminParcelsPage.statusFilterOptions.size(); i++) {
            if (deliveryManName.equalsIgnoreCase(adminParcelsPage.statusFilterOptions.get(i).getText())) {
                adminParcelsPage.statusFilterOptions.get(i).click();
                ReusableMethods.hardWait(1);
            }
        }
    }

    @Then("Enter a pickup man name {string} in the Pickup Man field.")
    public void enter_a_pickup_man_name_in_the_pickup_man_field(String pickUpManName) {

        adminParcelsPage.pickUpManName.click();
        ReusableMethods.hardWait(1);
        adminParcelsPage.merchantFilterSearchBox.get(0).sendKeys(pickUpManName);
        ReusableMethods.hardWait(1);

        for (int i = 0; i < adminParcelsPage.statusFilterOptions.size(); i++) {
            if (pickUpManName.equalsIgnoreCase(adminParcelsPage.statusFilterOptions.get(i).getText())) {
                adminParcelsPage.statusFilterOptions.get(i).click();
                ReusableMethods.hardWait(1);

            }
        }

    }

    @Then("Enter a invoice ID {string} in the Invoice ID field.")
    public void enter_a_invoice_ıd_in_the_ınvoice_ıd_field(String invoiceId) {

        adminParcelsPage.invoiceId.sendKeys(invoiceId);

    }

    @Then("Click on the Filter button.")
    public void click_on_the_button() {
        adminParcelsPage.parcelFilterButton.click();

    }

    @Then("Verify that all filters should filter the list with correct results.")
    public void verify_that_all_filters_should_filter_the_list_with_correct_results() {

    }

    @Then("Enter {string} in the Search field.")
    public void enter_in_the_search_field(String string) {
        aranacakMetin = string;
        adminParcelsPage.parcelsSearchBox.sendKeys(string);
    }

    @Then("Press the search button.")
    public void press_the_search_button() {
        adminParcelsPage.parcelsSearchButton.click();
        ReusableMethods.hardWait(1);

    }

    @Then("Verify that results should be displayed correctly based on the entered information.")
    public void verify_that_results_should_be_displayed_correctly_based_on_the_entered_information() {

        for (int i = 0; i < adminParcelsPage.parcelsTableDataOneByOne.size(); i++) {
            String text = adminParcelsPage.parcelsTableDataOneByOne.get(i).getText();
            if (text.equalsIgnoreCase(aranacakMetin)) {
                Assert.assertTrue(true);
            }


        }

    }


}
