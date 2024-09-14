package pages.homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[text()='Our Services']")
    public WebElement ourServicesHeader;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//span[normalize-space()='Why Agile Swift Cargo']")
    private WebElement whyAgileSwiftCargoText;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold']")
    private List<WebElement> whyAgileSwiftCargoHeadings;

    public void getWhyAgileSwiftCargoHeadings(){

        String expectedHeader = "Why Agile Swift Cargo";
        assertEquals(expectedHeader,whyAgileSwiftCargoText.getText());
        ReusableMethods.hardWait(3);

        List<String> expectedHeadings = Arrays.asList("Timely Delivery", "Limitless Pickup", "Cash on delivery (COD)", "Get Payment Any Time", "Secure Handling", "Live Tracking Update");

        for (int i = 0; i < expectedHeadings.size(); i++) {
            assertEquals(whyAgileSwiftCargoHeadings.get(i).getText(), expectedHeadings.get(i));
        }

    }

    public WebElement getWhyAgileSwiftCargoText(){

        return whyAgileSwiftCargoText;
    }




}
