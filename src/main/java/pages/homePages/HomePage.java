package pages.homePages;

import org.checkerframework.checker.fenum.qual.Fenum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;
import java.util.logging.XMLFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage extends BasePage {

	@FindBy(xpath = "//*[text()='Our Services']")
	public WebElement ourServicesHeader;

	@FindBy(xpath = "//*[text()='Register']")
	public WebElement registerButton;

	@FindBy(xpath = "//span[normalize-space()='Why Agile Swift Cargo']")
	private WebElement whyAgileSwiftCargoText;

	@FindBy(xpath = "//h5[@class='my-3 font-weight-bold']")
	private List<WebElement> whyAgileSwiftCargoHeadings;

	@FindBy(xpath = "//div[@class='text-center whycourier-box mb-0']")
	private List<WebElement> whyAgileSwiftCargoImages;

	@FindBy(xpath = "//input[@placeholder='Enter tracking id']")
	private WebElement trackingIdTextBox;

	@FindBy(xpath = "//*[@class='text-primary']")
	private List<WebElement> navigationArrows;

	@FindBy(xpath = "//*[text()='Subscribe Us']")
	public WebElement SubscribeUsText;

	@FindBy(xpath = "//*[@class='fa fa-paper-plane']")
	public WebElement footerEnterMailButon;

	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	public WebElement enterMailButtonu;

	@FindBy(xpath = "//div[@class='toast toast-error']")
	public WebElement werifyText;

	@FindBy(xpath = "//*[text()='Login']")
	public WebElement loginButton;

	@FindBy(xpath = "//*[text()='Home']")
	public WebElement homeText;

	@FindBy(xpath = "//*[text()='Pricing']")
	public WebElement pricingText;

	@FindBy(xpath = "//*[text()='Tracking']")
	public WebElement trackingText;

	@FindBy(xpath = "(//*[text()='Blogs'])[1]")
	public WebElement blogsText;

	@FindBy(xpath = "(//*[text()='About'])[1]")
	public WebElement aboutText;

	@FindBy(xpath = "//*[text()='FAQ']")
	public WebElement faqText;

<<<<<<< HEAD
    @FindBy(xpath = "//*[@class='nav-link   active  ']")
    private WebElement HomeLink;
    @FindBy(xpath = "(//*[@class='nav-link  '])[2]")
    private WebElement BlogsLink;
    @FindBy(xpath ="//*[@class='font-size-1-5rem display-6 font-weight-bold text-start my-4  ']")
    private WebElement blogsTitle;
    @FindBy(xpath = "//*[@class='col-lg-4']")
    private List<WebElement> blogsImageCollection;
    @FindBy(xpath = "//*[@class='text-decoration-none']")
    private List<WebElement> blogsTextCollection;
    @FindBy(xpath = "//*[@class='page-content']")
    private WebElement largeTextAfterClick;
    @FindBy(xpath = "//*[@class='font-size-1-5rem display-6 font-weight-bold text-start my-4  ']")
    private WebElement blockTextAfterClick;
    @FindBy(xpath = "//*[@class='card mt-3 mb-3 latest-blog-item']")
    private List<WebElement> latestBlogsArea;
=======

	@FindBy(xpath = "//*[text()='Contact']")
	public WebElement contactText;
>>>>>>> main

	public void getWhyAgileSwiftCargoHeadings() {

		String expectedHeader = "Why Agile Swift Cargo";
		assertEquals(expectedHeader, whyAgileSwiftCargoText.getText());
		ReusableMethods.hardWait(3);

		List<String> expectedHeadings = Arrays.asList("Timely Delivery", "Limitless Pickup", "Cash on delivery (COD)",
				"Get Payment Any Time", "Secure Handling", "Live Tracking Update");

		for (int i = 0; i < expectedHeadings.size(); i++) {
			assertEquals(whyAgileSwiftCargoHeadings.get(i).getText(), expectedHeadings.get(i));
		}

	}

	public void getWhyAgileSwiftCargoImages() {

		ReusableMethods.hardWait(3);
		for (int i = 0; i < whyAgileSwiftCargoImages.size(); i++) {
			assertTrue(whyAgileSwiftCargoImages.get(i).isDisplayed());
		}

	}

	public WebElement getWhyAgileSwiftCargoText() {

		return whyAgileSwiftCargoText;
	}

	public void getTrackingIdBoxIsDisplayed() {

		assertTrue(trackingIdTextBox.isDisplayed());
	}

	public void getTrackingIdBoxIsEnabled() {

		assertTrue(trackingIdTextBox.isEnabled());
	}

	public void enterTrackingID(String trackingID) {
		trackingIdTextBox.sendKeys(trackingID);

	}

	public void serviceHeadersVisibility(String text) {

<<<<<<< HEAD
    public void serviceHeadersVisibilty(String text){

        assertTrue(driver.findElement(By.xpath("(//*[text()='"+text+"'])[1]")).isDisplayed());


    }

    public void clickNavigationArrow(int servisNo){

        navigationArrows.get(servisNo-1).click();

    }

    public void navigationArrowsVisibility(){

        for (int i = 0; i < navigationArrows.size(); i++) {
            assertTrue(navigationArrows.get(i).isDisplayed());
        }
    }
=======
		assertTrue(driver.findElement(By.xpath("(//*[text()='" + text + "'])[1]")).isDisplayed());
	}
>>>>>>> main

	public void clickNavigationArrow(int servisNo) {

<<<<<<< HEAD
public WebElement getHomeLink(){
        return HomeLink;
}
public WebElement getBlogsLink(){
        return BlogsLink;
}
public WebElement getBlogsTitle(){return blogsTitle;}
public List<WebElement> getBlogsImageCollection(){return blogsImageCollection;}
public List<WebElement> getBlogsTextCollection(){return blogsTextCollection;}
public WebElement getBlockTextAfterClick(){return blockTextAfterClick;}
public WebElement getlargeTextAfterClick(){return largeTextAfterClick;}
public List<WebElement> getLatestBlogsArea(){return latestBlogsArea;}
=======
		navigationArrows.get(servisNo - 1).click();
	}
>>>>>>> main

	public void serviceHeadersVisibilty(String text) {

		assertTrue(driver.findElement(By.xpath("(//*[text()='" + text + "'])[1]")).isDisplayed());

	}

	public void navigationArrowsVisibility() {

		for (int i = 0; i < navigationArrows.size(); i++) {
			assertTrue(navigationArrows.get(i).isDisplayed());
		}

	}


}
