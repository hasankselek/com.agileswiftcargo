package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantReportsPage;
import stepDefinitions.BaseStep;

import org.junit.Assert;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.Pages;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.apache.poi.xdgf.usermodel.XDGFRelation.PAGES;


public class MerchantReportsStepDef extends BaseStep {
    MerchantReportsPage merchantReportsPage = new MerchantReportsPage();
    Actions actions = new Actions(Driver.getDriver());
    Random random=new Random();
    int int1;
    List<WebElement> daysFilterList;

    @When("Login as a merchant")
    public void login_as_a_merchant() {
        merchantReportsPage.loginBox.sendKeys(configLoader.getConfigValue("EmailMerpnh"));
        merchantReportsPage.passLoginBox.sendKeys(configLoader.getConfigValue("Passpnh"));
        merchantReportsPage.signinButton.sendKeys(Keys.ENTER);
        merchantReportsPage.reportsLink.sendKeys(Keys.ENTER);
    }

    @When("Assert visiblility and clickablility of'Total Summery'link.")
    public void assert_visiblility_and_clickablility_of_total_summery_link() {
        JSUtilities.highlightElementWithJS(Driver.getDriver(),merchantReportsPage.totalSummary);
        JSUtilities.scrollToElement(Driver.getDriver(),merchantReportsPage.totalSummary);
        JSUtilities.clickWithJS(Driver.getDriver(),merchantReportsPage.totalSummary);
        Assert.assertTrue(merchantReportsPage.totalSummary.isDisplayed());
        Assert.assertTrue(merchantReportsPage.totalSummary.isEnabled());

    }


    @Then("Click on Total Summery link.")
    public void click_on_total_summery_link() {
        merchantReportsPage.totalSummary.sendKeys(Keys.ENTER);
    }

    @When("Assert visibility of title of directed page is equal to Total Summery.")
    public void assert_visibility_of_title_of_directed_page_is_equal_to_total_summery() {
        String expectedTitle = "Total Summery";
        String actualTitle = merchantReportsPage.totlSmryTitle.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Assert visibility and activity of filter button.")
    public void assert_visibility_and_activity_of_filter_button() {
        Assert.assertTrue(merchantReportsPage.filterButton.isDisplayed());
        Assert.assertTrue(merchantReportsPage.filterButton.isEnabled());
    }

    @When("Assert visibility and activity of Enter Date box.")
    public void assert_visibility_and_activity_of_enter_date_box() {
        Assert.assertTrue(merchantReportsPage.entrDateBox.isDisplayed());
        Assert.assertTrue(merchantReportsPage.entrDateBox.isEnabled());
    }

    @Then("Click on the Enter Date box.")
    public void click_on_the_enter_date_box() {
        ReusableMethods.waitForElementToBeClickable(merchantReportsPage.entrBox,3);
        merchantReportsPage.entrBox.sendKeys(Keys.ENTER);
    }

    @When("Click on one item on the Enter Date box dropdown.")
    public void click_on_one_item_on_the_enter_date_box_dropdown() {
        List<WebElement> daysFilterList=new ArrayList<>();
        daysFilterList.add(merchantReportsPage.yesterday);
        daysFilterList.add(merchantReportsPage.today);
        daysFilterList.add(merchantReportsPage.last7Day);
        daysFilterList.add(merchantReportsPage.last30Day);
        daysFilterList.add(merchantReportsPage.thisMonth);
        daysFilterList.add(merchantReportsPage.lastMonth);
        daysFilterList.add(merchantReportsPage.customRange);
int1=random.nextInt(daysFilterList.size()-1);
        JSUtilities.highlightElementWithJS(Driver.getDriver(),daysFilterList.get(int1));
        JSUtilities.scrollToElement(Driver.getDriver(),daysFilterList.get(int1));
        JSUtilities.clickWithJS(Driver.getDriver(),daysFilterList.get(int1));

if(int1==6){

    int int2=random.nextInt(merchantReportsPage.customRangeDate.size()-2);
    JSUtilities.highlightElementWithJS(Driver.getDriver(),merchantReportsPage.customRangeDate.get(int2));
    JSUtilities.scrollToElement(Driver.getDriver(),merchantReportsPage.customRangeDate.get(int2));
    JSUtilities.clickWithJS(Driver.getDriver(),merchantReportsPage.customRangeDate.get(int2));

    int int3=random.nextInt((merchantReportsPage.customRangeDate.size()-1)+int2);
    JSUtilities.highlightElementWithJS(Driver.getDriver(),merchantReportsPage.customRangeDate.get(int3));
    JSUtilities.scrollToElement(Driver.getDriver(),merchantReportsPage.customRangeDate.get(int3));
    JSUtilities.clickWithJS(Driver.getDriver(),merchantReportsPage.customRangeDate.get(int3));

    merchantReportsPage.customRangeDate.get(int3).sendKeys(Keys.ENTER);
    ReusableMethods.waitAndClick(merchantReportsPage.applyButton,3);

}
    }

    @Then("Assert the date is displayed Enter Date box.")
    public void assert_the_date_is_displayed_enter_date_box() {
      Assert.assertFalse(merchantReportsPage.entrDateBox.getText().isEmpty());
    }

    @Then("Click on the filter button.")
    public void click_on_the_filter_button() {
        ReusableMethods.waitForElementToBeClickable(merchantReportsPage.filterButton,3);
merchantReportsPage.filterButton.sendKeys(Keys.ENTER);
    }

    @Then("Assert displayed a table .")
    public void assert_displayed_a_table() {

        Assert.assertTrue(merchantReportsPage.tableCollFivePart.isDisplayed());

    }

}
