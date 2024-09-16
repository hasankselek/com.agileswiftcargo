package pages.merchantPages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ConfigLoader;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class MerchantUpdateProfilPage extends BasePage {

    @FindBy(xpath = "(//input[@id='name'])[1]")
    private WebElement merchantName;

    @FindBy(xpath = "(//input[@id='address'])[1]")
    private WebElement merchantAdress;

    @FindBy(xpath = "(//input[@id='image_id'])[1]")
    private WebElement merchantImage;

    @FindBy(xpath = "(//img[@alt='user'])[1]")
    private WebElement merchantUserImage;

    @FindBy(css = "button[class='btn btn-space btn-primary']")
    private WebElement saveChangeButton;

    @FindBy(xpath = "//div[@class='toast toast-error']")
    private WebElement suscessMessage;

    public void getVerifyDisplayedMerchantInfo(){
        assertTrue(merchantName.isDisplayed());
        assertTrue(merchantAdress.isDisplayed());
        assertTrue(merchantUserImage.isDisplayed());

    }

    public void setMerchantInfo(String name,String adress,String picture){

        merchantName.clear();
        merchantName.sendKeys(name);

        merchantAdress.clear();
        merchantAdress.sendKeys(adress);
        ReusableMethods.hardWait(2);

        ReusableMethods.uploadFile(configLoader.getConfigValue(picture),merchantImage);
        ReusableMethods.hardWait(3);

    }

    public void getClickSaveChangeButton(){

        saveChangeButton.click();
    }

    public void getSuccessMessages(){

        try {
            assertTrue("Hata mesajı bulunamadı.", suscessMessage.isDisplayed());
        } catch (NoSuchElementException e) {
            fail();
        }

    }
}
