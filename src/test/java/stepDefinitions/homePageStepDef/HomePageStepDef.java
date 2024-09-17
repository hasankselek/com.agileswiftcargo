package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.homePages.HomePage;
import stepDefinitions.BaseStep;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import javax.swing.*;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class HomePageStepDef extends BaseStep {

    HomePage homePage = new HomePage();
    Random rand = new Random();
    int num1;
    int num2;
    String selectedMtnBlog;
    int expectedInt;
    String expectedString;
    Actions actions=new Actions(homePage.driver);


    @Then("Enters the {string}")
    public void enters_the(String configdenUrl) {

        homePage.driver.get(homePage.configLoader.getConfigValue(configdenUrl));

    }

    @Then("Verifies access to homepage")
    public void verifies_access_to_homepage() {

        assertEquals(homePage.configLoader.getConfigValue("homepageUrl"), homePage.driver.getCurrentUrl());
    }

    @Then("Verifies homepage load successfully")
    public void verifies_homepage_load_successfully() {

        assertTrue(homePage.ourServicesHeader.isDisplayed());

    }

    @Then("Verifies register button is displayed")
    public void verifiesRegisterButtonIsDisplayed() {

        assertTrue(homePage.registerButton.isDisplayed());


    }

    @Then("Clicks register button and verifies register page opens")
    public void clicksRegisterButtonAndVerifiesRegisterPageOpens() {

        homePage.registerButton.click();
        ReusableMethods.waitForPageToLoad(1);
    }

    @When("The user goes to the Why Agile Swift Cargo title")
    public void user_goes_to_the_why_agile_swift_cargo_title() {

        JSUtilities.scrollToElement(DRIVER, PAGES.getHomePage().getWhyAgileSwiftCargoText());
    }

    @Then("The user verifies that the headers are displayed")
    public void user_verifies_that_the_headers_are_displayed() {

        PAGES.getHomePage().getWhyAgileSwiftCargoHeadings();
    }

    @Then("The user verifies that the images are displayed")
    public void userVerifiesThatTheImagesAreDisplayed() {

        PAGES.getHomePage().getWhyAgileSwiftCargoImages();

    }

    @Then("Verifies that the text box labelled Enter tracking id is displayed")
    public void verifiesThatTheTextBoxLabelledEnterTrackingIdIsDisplayed() {

        PAGES.getHomePage().getTrackingIdBoxIsDisplayed();

    }

    @Then("Verifies that data can be entered in the Text Box")
    public void verifiesThatDataCanBeEnteredInTheTextBox() {

        PAGES.getHomePage().getTrackingIdBoxIsEnabled();
    }

    @When("Enter tracking id {string} in the Enter tracking id box")
    public void enterTrackingIdInTheEnterTrackingIdBox(String trackingID) {

        PAGES.getHomePage().enterTrackingID(trackingID);
    }

    @And("Clicks {string} button")
    public void clicksButton(String text) {

        ReusableMethods.clickWithText(text);
    }


    @Then("Verifies Our Service header visibilty")
    public void verifiesOurServiceHeaderVisibilty() {

        assertTrue(homePage.ourServicesHeader.isDisplayed());

    }

    @Then("Verifies {string}, {string}, {string}, {string} headers visibility")
    public void verifiesECommerceDeliveryPickDropPackageingWarehousingHeadersVisibility(String header1, String header2, String header3, String header4) {

        if (homePage.driver.getCurrentUrl().equals("https://qa.agileswiftcargo.com/")) {

            ReusableMethods.scrollToElement(homePage.ourServicesHeader);

            homePage.serviceHeadersVisibilty(header1);
            homePage.serviceHeadersVisibilty(header2);
            homePage.serviceHeadersVisibilty(header3);
            homePage.serviceHeadersVisibilty(header4);
        } else {

            homePage.serviceHeadersVisibilty(header1);
            homePage.serviceHeadersVisibilty(header2);
            homePage.serviceHeadersVisibilty(header3);
            homePage.serviceHeadersVisibilty(header4);

        }


    }

    @And("Verifies an arrow visible under the services and is clickable")
    public void verifiesAnArrowVisibleUnderTheServicesAndIsClickable() {

        homePage.navigationArrowsVisibility();
        homePage.clickNavigationArrow(1);


    }

    @Then("Clicks arrow under the {string}")
    public void clicksArrowUnderThe(String serviceHeader) {

        if (homePage.driver.getCurrentUrl().equals("https://qa.agileswiftcargo.com/")) {
            ReusableMethods.scrollToElement(homePage.ourServicesHeader);
            ReusableMethods.hardWait(2);

            if (serviceHeader.equals("E-Commerce delivery")) {

                homePage.clickNavigationArrow(1);

            } else if (serviceHeader.equals("Pick & Drop")) {

                homePage.clickNavigationArrow(2);

            } else if (serviceHeader.equals("Packageing")) {

                homePage.clickNavigationArrow(3);


            } else if (serviceHeader.equals("Warehousing")) {

                homePage.clickNavigationArrow(4);

            } else {
                System.out.println("Sorry,there is no such a service");
            }
        } else {

            if (serviceHeader.equals("E-Commerce delivery")) {

                homePage.clickNavigationArrow(1);

            } else if (serviceHeader.equals("Pick & Drop")) {

                homePage.clickNavigationArrow(2);

            } else if (serviceHeader.equals("Packageing")) {

                homePage.clickNavigationArrow(3);


            } else if (serviceHeader.equals("Warehousing")) {

                homePage.clickNavigationArrow(4);

            } else {
                System.out.println("Sorry,there is no such a service");
            }


        }


    }

    @When("Assert visibility of Home link.")
    public void assert_visibility_of_home_link() {
        assertTrue(PAGES.getHomePage().getHomeLink().isDisplayed());
    }

    @When("Assert visiblility and clickablility of'Blogs'link.")
    public void assert_visiblility_and_clickablility_of_blogs_link() {
        assertTrue(PAGES.getHomePage().getBlogsLink().isDisplayed());
        assertTrue(PAGES.getHomePage().getBlogsLink().isEnabled());
    }

    @Then("Click on the Blogs button.")
    public void click_on_the_blogs_button() {
        PAGES.getHomePage().getBlogsLink().click();
    }

    @Then("Assert directed page title equals to Blogs.")
    public void assert_directed_page_title_equals_to_blogs() {
        expectedString = "Blogs";
        String actualString = PAGES.getHomePage().getBlogsTitle().getText();
        assertEquals(actualString, expectedString);
    }

    @Then("Entry block text of selected blog.")
    public void entry_block_text_of_selected_blog() {
        for (int i = 1; i < 8; i++) {
            num1 = rand.nextInt(i);
            if (num1 > 3) {
                ReusableMethods.scrollToElement(PAGES.getHomePage().getBlogsTextCollection().get(num1));
            }
        }
        ReusableMethods.waitForPageToLoad(5);
        selectedMtnBlog = PAGES.getHomePage().getBlogsTextCollection().get(num1).getText();
    }

    @When("Click on the selected blog.")
    public void click_on_the_selected_blog() {
        if (num1 > 3) {

            ReusableMethods.scrollToElement(PAGES.getHomePage().getBlogsTextCollection().get(num1));
        }
        JSUtilities.clickWithJS(homePage.driver,  PAGES.getHomePage().getBlogsTextCollection().get(num1));

    }

    @Then("Assert opened blog block text equals to entried block text.")
    public void assert_opened_blog_block_text_equals_to_entried_block_text() {
        expectedString = selectedMtnBlog;
        ReusableMethods.waitForPageToLoad(5);
        String actualMtnBlog = PAGES.getHomePage().getBlockTextAfterClick().getText();
        Assert.assertEquals(actualMtnBlog, expectedString);
    }

    @Then("Entry row count of selected Blog.")
    public void entry_row_count_of_selected_blog() {
        ReusableMethods.waitForPageToLoad(3);
        expectedInt = PAGES.getHomePage().getBlogsTextCollection().get(num1).getText().length();
    }

    @Then("Assert row size of clicked Blog is bigger than entryed row size.")
    public void assert_row_size_of_clicked_blog_is_bigger_than_entryed_row_size() {
        ReusableMethods.scrollToElement(PAGES.getHomePage().getlargeTextAfterClick());
        int actualCount = PAGES.getHomePage().getlargeTextAfterClick().getText().length();
        Assert.assertTrue(actualCount > expectedInt);
    }

    @Then("Assert visibility and activity of list of blogs in the Latest Blogs area.")
    public void assert_visibility_and_activity_of_list_of_blogs_in_the_latest_blogs_area() {
List<WebElement>  lBA=PAGES.getHomePage().getLatestBlogsArea();
        for (int i = 1; i < (lBA.size()-2); i++) {
            num2= rand.nextInt(i);
            if (num2 > 3) {
                ReusableMethods.scrollToElement(lBA.get(num2));
                //JSUtilities.scrollToElement(homePage.driver, PAGES.getHomePage().getLatestBlogsArea().get(num2));
            }
        }
        WebElement areaBlog=lBA.get(num2);
        actions.moveToElement(areaBlog);
        Assert.assertTrue(areaBlog.isDisplayed());
        Assert.assertTrue(areaBlog.isEnabled());
    }
}
