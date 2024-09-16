package pages.homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrackingPage extends BasePage {

    @FindBy(xpath = "//span[@class='text-primary']")
    private WebElement parcelTrackingNo;

    @FindBy(xpath = "//div[@class='cd-timeline__content js-cd-content']")
    private WebElement cargoInformation;

    @FindBy(xpath = "(//div[@class='col-lg-6 m-auto'])[1]")
    private WebElement parcelNotFoundPic;

    public String getParcelTrackingNo(){

        return parcelTrackingNo.getText();
    }

    public void verifiesTrackingPage(){
        ReusableMethods.hardWait(2);
        String expectedTrackingPage = "Parcel Tracking";
        assertTrue(Driver.getDriver().getTitle().contains(expectedTrackingPage));
    }

    public boolean getVisibleCargoInfo(){

        return parcelTrackingNo.isDisplayed();
    }

    public void getParcelNotFoundPic(){

        assertTrue(parcelNotFoundPic.isDisplayed());
    }
}
