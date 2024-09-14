package pages.HomePages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ExcelDataReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {



    public HomePage() {

        super();
    }


    @FindBy(xpath = "//span[normalize-space()='Why Agile Swift Cargo']")
    private WebElement whyAgileSwiftCargoText;

    @FindBy(xpath = "//h5[@class='my-3 font-weight-bold']")
    private List<WebElement> whyAgileSwiftCargoHeadings;

    public void getWhyAgileSwiftCargoHeadings(){

        String expectedHeader = "Why Agile Swift Cargo";
        assertEquals(expectedHeader,whyAgileSwiftCargoText.getText());

        List<String> expectedHeadings = Arrays.asList("Timely Delivery", "Limitless Pickup", "Cash on delivery (COD)", "Get Payment Any Time", "Secure Handling", "Live Tracking Update");

        for (int i = 0; i < expectedHeadings.size(); i++) {
            assertEquals(whyAgileSwiftCargoHeadings.get(i).getText(), expectedHeadings.get(i));
        }



    }

    public WebElement getWhyAgileSwiftCargoText(){

        return whyAgileSwiftCargoText;
    }



}
