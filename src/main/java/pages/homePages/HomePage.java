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


	@FindBy(xpath = "//*[text()='Contact']")
	public WebElement contactText;

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

		assertTrue(driver.findElement(By.xpath("(//*[text()='" + text + "'])[1]")).isDisplayed());
	}

	public void clickNavigationArrow(int servisNo) {

		navigationArrows.get(servisNo - 1).click();
	}

	public void serviceHeadersVisibilty(String text) {

		assertTrue(driver.findElement(By.xpath("(//*[text()='" + text + "'])[1]")).isDisplayed());

	}

	public void navigationArrowsVisibility() {

		for (int i = 0; i < navigationArrows.size(); i++) {
			assertTrue(navigationArrows.get(i).isDisplayed());
		}

	}


}
