package stepDefinitions.adminPageStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.adminPages.AdminDeliveryManPage;
import stepDefinitions.BaseStep;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class AdminDeliverymanStepDef extends BaseStep {
    AdminDeliveryManPage adminDeliveryManPage = new AdminDeliveryManPage();
    Faker faker = new Faker();
    Random random = new Random();

    String fakerPhone;
    String fakerName;
    String fakerEmail;
    String fakerEmail2;
    String fakerName2;




    @When("Login with admin")
    public void login_with_admin() {
        adminDeliveryManPage.loginBox.sendKeys(configLoader.getConfigValue("EmailAdpnh"));
        adminDeliveryManPage.passLoginBox.sendKeys(configLoader.getConfigValue("Passpnh"));
        adminDeliveryManPage.signinButton.sendKeys(Keys.ENTER);
        adminDeliveryManPage.deliverLink.sendKeys(Keys.ENTER);
    }

    @When("Verify visibility and activity of filter button")
    public void verify_visibility_and_activity_of_filter_button() {
        Assert.assertTrue(adminDeliveryManPage.filterDel.isDisplayed());
        Assert.assertTrue(adminDeliveryManPage.filterDel.isEnabled());
    }

    @When("Verify visibility and activity of Clear button")
    public void verify_visibility_and_activity_of_clear_button() {
        Assert.assertTrue(adminDeliveryManPage.clearDelButton.isDisplayed());
        Assert.assertTrue(adminDeliveryManPage.clearDelButton.isEnabled());
    }

    @When("Verify visibility and activity of Plus button")
    public void verify_visibility_and_activity_of_plus_button() {
        Assert.assertTrue(adminDeliveryManPage.plusButton.isDisplayed());
        Assert.assertTrue(adminDeliveryManPage.plusButton.isEnabled());
    }

    @When("Verify visibility and activity of action button")
    public void verify_visibility_and_activity_of_action_button() {
        Assert.assertTrue(adminDeliveryManPage.actionButton.isDisplayed());
        Assert.assertTrue(adminDeliveryManPage.actionButton.isEnabled());
    }

    @Then("Click on the action button")
    public void click_on_the_action_button() {
        adminDeliveryManPage.actionButton.sendKeys(Keys.ENTER);
    }

    @When("Verify visibility and activity of edit button")
    public void verify_visibility_and_activity_of_edit_button() {
        Assert.assertTrue(adminDeliveryManPage.editButton.isDisplayed());
        Assert.assertTrue(adminDeliveryManPage.editButton.isEnabled());
    }

    @When("Verify visibility and activity of delete button")
    public void verify_visibility_and_activity_of_delete_button() {
        List<WebElement> actionList = new ArrayList<>();
        actionList.add(adminDeliveryManPage.editButton);
        Assert.assertNotEquals(2, actionList.size());
        Assert.assertEquals("Edit", actionList.get(0).getText());
        Assert.assertNotEquals("Delete", actionList.get(1).getText());
    }

    @Then("Click on the plus button")
    public void click_on_the_plus_button() {
        adminDeliveryManPage.plusButton.sendKeys(Keys.ENTER);
    }

    @Then("Click on the save button")
    public void click_on_the_save_button() {
        adminDeliveryManPage.saveInPlusDel.sendKeys(Keys.ENTER);
    }
    @Then("Click on the edit button")
    public void click_on_the_edit_button() {
        adminDeliveryManPage.editButton.sendKeys(Keys.ENTER);
    }
    @Then ("Verify enters for filter the used information shows in result")
    public void verify_enters_for_filter_the_used_information_shows_in_result(){
        adminDeliveryManPage.delNameBox.sendKeys(faker.name().fullName());
        adminDeliveryManPage.delEmailBox.sendKeys(faker.internet().emailAddress());
        adminDeliveryManPage.delPhoneBox.sendKeys(faker.phoneNumber().cellPhone());
        adminDeliveryManPage.filterDel.sendKeys(Keys.ENTER);
        Assert.assertFalse(adminDeliveryManPage.filterResult.getText().contains("Showing to of 0 results"));
    }

    @Then("Enters for filter the unused information for parameters Name Email and phone and assert the search result contains 0")
    public void enters_for_filter_the_unused_information_for_parameters_name_email_and_phone_and_assert_the_search_result_contains_0() {
        fakerName = faker.name().firstName();
        fakerEmail = faker.internet().emailAddress();
        fakerPhone = faker.phoneNumber().cellPhone();
        adminDeliveryManPage.actionButton.sendKeys(Keys.ENTER);
        adminDeliveryManPage.editButton.sendKeys(Keys.ENTER);
//product useed data
        adminDeliveryManPage.delNameEdit.sendKeys(fakerName);
        adminDeliveryManPage.delEmailEdit.sendKeys(fakerEmail);
        adminDeliveryManPage.delPhoneEdit.sendKeys(fakerPhone);
        adminDeliveryManPage.saveInPlusDel.sendKeys(Keys.ENTER);

        adminDeliveryManPage.delNameBox.sendKeys(fakerName);
        adminDeliveryManPage.delEmailBox.sendKeys(faker.internet().emailAddress());
        adminDeliveryManPage.delPhoneBox.sendKeys(faker.phoneNumber().cellPhone());
        adminDeliveryManPage.filterDel.sendKeys(Keys.ENTER);
        Assert.assertTrue(adminDeliveryManPage.filterResult.getText().contains("Showing to of 0 results"));

        adminDeliveryManPage.delNameBox.sendKeys(faker.name().fullName());
        adminDeliveryManPage.delEmailBox.sendKeys(fakerEmail);
        adminDeliveryManPage.delPhoneBox.sendKeys(faker.phoneNumber().cellPhone());
        adminDeliveryManPage.filterDel.sendKeys(Keys.ENTER);
        Assert.assertTrue(adminDeliveryManPage.filterResult.getText().contains("Showing to of 0 results"));

        adminDeliveryManPage.delNameBox.sendKeys(faker.name().fullName());
        adminDeliveryManPage.delEmailBox.sendKeys(faker.internet().emailAddress());
        adminDeliveryManPage.delPhoneBox.sendKeys(fakerPhone);
        adminDeliveryManPage.filterDel.sendKeys(Keys.ENTER);
        Assert.assertTrue(adminDeliveryManPage.filterResult.getText().contains("Showing to of 0 results"));
    }

    @And("For plus new deliveryMan enters the unused information for Email and phone")
    public void for_plus_new_deliveryMan_enters_the_unused_information_for_Email_and_phone() {
        fakerEmail2 = faker.internet().emailAddress();
        fakerName2 = faker.name().fullName();
        adminDeliveryManPage.delNameEdit.sendKeys(fakerName2);
        adminDeliveryManPage.delEmailEdit.sendKeys(fakerEmail2);
        adminDeliveryManPage.delPhoneEdit.sendKeys(faker.phoneNumber().cellPhone());
        adminDeliveryManPage.returnChange.sendKeys(faker.number().digit());
        adminDeliveryManPage.openBalance.sendKeys(faker.number().digit());
        adminDeliveryManPage.salary.sendKeys(faker.number().digit());
        adminDeliveryManPage.hub.sendKeys(faker.address().city());
        adminDeliveryManPage.addressForm.sendKeys(faker.address().fullAddress());
        adminDeliveryManPage.deliveryChange.sendKeys(faker.number().digit());
        adminDeliveryManPage.pickupCharge.sendKeys(faker.number().digit());
        adminDeliveryManPage.passwordForm.sendKeys(faker.internet().password());
        adminDeliveryManPage.saveInPlusDel.sendKeys(Keys.ENTER);
    }

    @Then("Assert the name and Email address in first row is equal to the last filled values")
    public void assert_the_name_and_email_address_in_first_row_is_equal_to_the_last_filled_values() {
        Assert.assertEquals(fakerName2, adminDeliveryManPage.delNameBox.getText());
        Assert.assertEquals(fakerEmail2, adminDeliveryManPage.delEmailBox.getText());
    }

    @And("Verify Edit button directed to Edit Delivery Man")
    public void verify_edit_button_directed_to_edit_delivery_man() {
        String expectedString = "Edit Delivery Man";
        String actualString = adminDeliveryManPage.editTitle.getText();
        Assert.assertEquals(expectedString, actualString);
    }

    @Then("Assert displayed a text contains The Email has already been taken")
    public void assert_displayed_a_text_contains_the_email_has_already_been_taken() {
        Assert.assertTrue(adminDeliveryManPage.alertText.isDisplayed());
    }

    @And("Verifying plus button directed to Create Delivery Man")
    public void verifying_edit_button_directed_to_create_delivery_man() {
        String expectedString = "Create Delivery Man";
        String actualString = adminDeliveryManPage.editTitle.getText();
        Assert.assertEquals(expectedString, actualString);

    }

}
