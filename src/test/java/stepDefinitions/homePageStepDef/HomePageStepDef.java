package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.homePages.HomePage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class HomePageStepDef extends BaseStep {

    HomePage homePage = new HomePage();
    Random random = new Random();
    int indexOfBlogsCollection;
    int indexOfRandomBlogText;
    WebElement selectedBlogText;
    int expectedSizeOfBlogText;


    List<WebElement> textBlogBeforClick;


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
    public void verifiesECommerceDeliveryPickDropPackageingWarehousingHeadersVisibility(String header1, String header2,
                                                                                        String header3, String header4) {

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

    @Then("On the homepage, it goes all the way down to the footer section")
    public void on_the_homepage_it_goes_all_the_way_down_to_the_footer_section() {
        ReusableMethods.scrollToElement(homePage.SubscribeUsText);
        ReusableMethods.hardWait(5);
    }

    @Then("Tests the visibility {string} text")
    public void tests_the_visibility_and_functionality_of_the_textbox_in_the_menu(String istenenkelime) {

        homePage.footerEnterMailButon.isDisplayed();

    }

    @Then("Enters {string} in the textbox")
    public void enters_in_the_textbox(String email) {
        homePage.enterMailButtonu.sendKeys(email);
        homePage.footerEnterMailButon.click();
        ReusableMethods.hardWait(5);

    }

    @Then("Confirms that registration has been done in a successful")
    public void confirms_that_registration_has_been_done_in_a_successful() {

        Assert.assertTrue(homePage.werifyText.isDisplayed());

    }

    @Then("In the upper section of the home page, the inscription {string} is verified.")
    public void In_the_upper_section_of_the_home_page_the_inscription_is_verified(String arananKelime) {
        ReusableMethods.findElementByText(arananKelime);

    }

    @Then("Click on {string}")
    public void click_on(String tiklanacakKelime) {
        ReusableMethods.clickWithText(tiklanacakKelime);
        ReusableMethods.hardWait(3);
    }

    @Then("The page that opens is verified as {string}")
    public void the_page_that_opens_is_verified_as(String aranacakUrl) {

        assertEquals(homePage.configLoader.getConfigValue(aranacakUrl), homePage.driver.getCurrentUrl());
    }

    @Then("It is verified that {string} is visible in the Body section of the Home Page")
    public void It_is_verified_that_is_visible_in_the_body_section_of_the_home_page(String aranacakText) {
        ReusableMethods.scrollToText(Driver.getDriver(), aranacakText);
        ReusableMethods.hardWait(3);

    }

    @When("Assert visibility of Home link.")
    public void assert_visibility_of_home_link() {
        Assert.assertTrue(ReusableMethods.isElementVisible(PAGES.getHomePage().homeText));
    }

    @When("Assert visiblility and clickablility of'Blogs'link.")
    public void assert_visiblility_and_clickablility_of_blogs_link() {
        Assert.assertTrue(ReusableMethods.isElementVisible(PAGES.getHomePage().blogsText));
        Assert.assertTrue(PAGES.getHomePage().blogsText.isEnabled());
    }

    @Then("Clicks on Blogs button in homepage.")
    public void click_on_the_blogs_button() {
        PAGES.getHomePage().blogsText.click();
    }

    @Then("Assert directed page title equals to Blogs.")
    public void assert_directed_page_title_equals_to_blogs() {
        String expectedTitle = "Blogs";
        String actualTitle = PAGES.getHomePage().BlogsTitle.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("Entry block text of selected blog.")
    public void entry_block_text_of_selected_blog() {
        List<WebElement> tBBC=PAGES.getHomePage().textBeforeClick;
        indexOfRandomBlogText=random.nextInt(tBBC.size()-1);
        if (indexOfRandomBlogText > 2) {
            JSUtilities.scrollToElement(Driver.getDriver(),tBBC.get(indexOfRandomBlogText));
        }
        selectedBlogText = tBBC.get(indexOfRandomBlogText);
    }
    @Then("Assert opened blog block text equals to enterd block text.")
    public void assert_opened_blog_block_text_equals_to_enterd_block_text() {
        String expectedString=selectedBlogText.getText();
        String actualString = PAGES.getHomePage().smallTextAfterClick.getText();
        Assert.assertEquals(expectedString, actualString);
    }

    @Then("Entry text count of selected Blog.")
    public void entry_text_count_of_selected_blog() {
        List<WebElement> textBlogs=PAGES.getHomePage().textBeforeClick;
      indexOfRandomBlogText=random.nextInt(textBlogs.size());
     selectedBlogText=PAGES.getHomePage().textBeforeClick.get(indexOfRandomBlogText);
      if(indexOfRandomBlogText>2){ReusableMethods.scrollToElement(textBlogs.get(indexOfRandomBlogText));}
        expectedSizeOfBlogText =selectedBlogText.getText().length();
    }
    @When("Click on entried text Blog.")
    public void click_on_entried_text_blog() {
       selectedBlogText.click();
    }

    @When("Click on the selected Blog.")
    public void click_on_the_selected_blog() {
        indexOfBlogsCollection=random.nextInt(PAGES.getHomePage().blogsCollection.size()-1);
       PAGES.getHomePage().blogsCollection.get(indexOfBlogsCollection).click();
    }

    @Then("Assert count of clicked Blog text is bigger than entryed text count.")
    public void assert_count_of_clicked_blog_is_bigger_than_entryed_text_count() {
        int actualSize = PAGES.getHomePage().largeTextAfterClick.getText().length();
        Assert.assertTrue(expectedSizeOfBlogText < actualSize);
    }

    @Then("Assert visibility and activity of list of blogs in the Latest Blogs area.")
    public void assert_visibility_and_activity_of_list_of_blogs_in_the_latest_blogs_area() {
        List<WebElement> latestBlogs = PAGES.getHomePage().latestBlogItem;
        int int2 = random.nextInt(5);
        WebElement selectedLatestBlog = latestBlogs.get(int2);
        if (int2 > 2) {
            JSUtilities.scrollToElement(Driver.getDriver(), selectedLatestBlog);
            JSUtilities.highlightElementWithJS(Driver.getDriver(),selectedLatestBlog);
        }
        Assert.assertTrue(selectedLatestBlog.isDisplayed());
        Assert.assertTrue(selectedLatestBlog.isEnabled());
        System.out.println("int2:" + int2);
    }
}
