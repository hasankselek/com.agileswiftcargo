package pages.merchantPages;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class MerchantProfilePage extends BasePage {

    @FindBy(xpath = "(((//div)[185])/span)[2]")
    private WebElement merchantName;

    @FindBy(xpath = "((((//div)[186]))/div/span)[2]")
    private WebElement merchantEmail;

    @FindBy(xpath = "((((//div)[188]))/div/span)[2]")
    private WebElement merchantPhone;

    @FindBy(xpath = "((((//div)[190]))/div/span)[2]")
    private WebElement merchantBusinessName;

    @FindBy(xpath = "((((//div)[192]))/div/span)[2]")
    private WebElement merchantAdress;


    public void getDisplayedMerchantInformation(String name, String email, String phone, String businessName, String adress){

        assertEquals(merchantName.getText(),name);
        assertEquals(merchantEmail.getText(),email);
        assertEquals(merchantPhone.getText(),phone);
        assertEquals(merchantBusinessName.getText(),businessName);
        assertEquals(merchantAdress.getText(),adress);

    }


}
