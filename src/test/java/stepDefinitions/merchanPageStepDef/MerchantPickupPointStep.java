package stepDefinitions.merchanPageStepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.*;
import org.openqa.selenium.Keys;

import stepDefinitions.BaseStep;
import utilities.ReusableMethods;

public class MerchantPickupPointStep extends BaseStep {


    int tableRows1;
    String nameB;
    String contactB;
    String addressB;
    String nameA;
    String contactA;
    String addressA;


    @Then("Click on the Setting button")
    public void click_on_the_Setting_button() {

        merchantPickupPointPage.setting.sendKeys(Keys.ENTER);
    }

    @Then("Assert visibility and activity of Pickup Point link")
    public void assert_visibility_and_activity_of_pickup_point_link() {
        ReusableMethods.hardWait(3);
        //Assert.assertTrue(merchantPickupPointPage.pickup.isDisplayed());
        Assert.assertTrue(merchantPickupPointPage.pickup.isEnabled());
    }

    @Then("Click on the Pickup Point link")
    public void click_on_the_pickup_point_link() {

        merchantPickupPointPage.pickup.sendKeys(Keys.ENTER);
    }


    @When("Assert the directed page address contains Pickup Point item")
    public void assert_the_directed_page_address_contains_pickup_point_item() {
        Assert.assertTrue(merchantPickupPointPage.pickuptitleAds.isDisplayed());
    }


    @Then("Assert the directed page title contains Pickup Point")
    public void assert_the_directed_page_title_contains_Pickup_Point() {
        Assert.assertTrue(merchantPickupPointPage.pickuptitle.isDisplayed());
    }

    @When("Assert visibility of a list table")
    public void assert_visibility_of_a_list_table() {
        Assert.assertTrue(merchantPickupPointPage.pickupTable.isDisplayed());
    }

    @When("Assert visibility and activity of Plus button")
    public void assert_visibility_and_activity_of_plus_button() {
        Assert.assertTrue(merchantPickupPointPage.plusButton.isDisplayed());
        Assert.assertTrue(merchantPickupPointPage.plusButton.isEnabled());
    }


    @And("Click Plus button")
    public void click_plus_button() {
        ReusableMethods.hardWait(2);
        merchantPickupPointPage.plusButton.click();
    }

    @Then("Assert the directed page title is equal to Create Pickup Point")
    public void assert_the_directed_page_title_is_equal_to_create_pickup_point() {
        String expectedTitle = "Create Pickup Point";
        String actualTitle = merchantPickupPointPage.plusTitle.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Fills parameters of Nme, Contact, Address and Status")
    public void fills_parameters_of_Name_Contact_Address_and_Status() {
        tableRows1 = merchantPickupPointPage.tableRows.size();
        merchantPickupPointPage.nameBoxPlus.sendKeys(faker.name().fullName());
        merchantPickupPointPage.contactBoxPlus.sendKeys(faker.phoneNumber().subscriberNumber(13).replace(".", "").replace("-", ""));
        merchantPickupPointPage.addressBoxPlus.sendKeys(faker.address().fullAddress());
    }

    @And("Clicks on save button")
    public void clicks_on_save_button() {
        merchantPickupPointPage.saveButtonPlus.sendKeys(Keys.ENTER);
    }

    @Then("Assert increasing the row size of table")
    public void assert_increasing_the_row_size_of_table() {
        int tableRows2 = merchantPickupPointPage.tableRows.size();
        Assert.assertNotEquals(tableRows2, tableRows1);
    }

    @And("Click on the Actions button")
    public void click_on_the_Actions_button() {
        merchantPickupPointPage.actionButton.sendKeys(Keys.ENTER);
    }

    @When("Assert visibility and activity of Edit link")
    public void assert_visibility_and_activity_of_edit_link() {
        Assert.assertTrue(merchantPickupPointPage.editButton.isDisplayed());
        Assert.assertTrue(merchantPickupPointPage.editButton.isEnabled());
    }

    @And("Click on Edit link")
    public void click_on_edit_link() {
        ReusableMethods.hardWait(2);
        merchantPickupPointPage.editButton.sendKeys(Keys.ENTER);
    }

    @When("Changes the value of parameters")
    public void changes_the_value_of_parameters() {
        nameB = merchantPickupPointPage.nameBoxPlus.getText();
        contactB = merchantPickupPointPage.contactBoxPlus.getText();
        addressB = merchantPickupPointPage.addressBoxPlus.getText();
        merchantPickupPointPage.nameBoxPlus.sendKeys(faker.name().fullName());
        merchantPickupPointPage.contactBoxPlus.sendKeys(faker.phoneNumber().cellPhone());
        merchantPickupPointPage.addressBoxPlus.sendKeys(faker.address().fullAddress());
        nameA = merchantPickupPointPage.nameBoxPlus.getText();
        contactA = merchantPickupPointPage.contactBoxPlus.getText();
        addressA = merchantPickupPointPage.addressBoxPlus.getText();
    }

    @Then("Click on Save Changes button")
    public void click_on_save_Changes_button() {
        merchantPickupPointPage.saveButtonPlus.sendKeys(Keys.ENTER);
    }

    @When("Assert changed values are equal to changed row values")
    public void assert_changed_values_are_equal_to_changed_row_values() {
        Assert.assertNotEquals(nameA, nameB);
        Assert.assertNotEquals(contactA, contactB);
        Assert.assertNotEquals(addressA, addressB);
    }

    @Then("Assert visibility and activity of Delete link")
    public void assert_visibility_and_activity_of_delete_link() {
        Assert.assertTrue(merchantPickupPointPage.deleteButton.isDisplayed());
        Assert.assertTrue(merchantPickupPointPage.deleteButton.isEnabled());
    }

    @And("Click on Delete link")
    public void click_on_delete_link() {
        merchantPickupPointPage.deleteButton.sendKeys(Keys.ENTER);
    }

    @When("Assert displayed popup contains Delete")
    public void assert_displayed_popup_contains_delete() {
        Assert.assertTrue(merchantPickupPointPage.popUp.isDisplayed());
        Assert.assertTrue(merchantPickupPointPage.popUp.isEnabled());
    }

    @When("Click on Yes button")
    public void click_on_yes_button() {
        merchantPickupPointPage.yesButton.sendKeys(Keys.ENTER);
    }

    @Then("Assert displayed message contains Pickup Point successfully deleted")
    public void assert_displayed_message_contains_pickup_point_successfully_deleted() {
        int tableRow3 = merchantPickupPointPage.tableRows.size();
        Assert.assertNotEquals(tableRows1, tableRow3);
    }


}
