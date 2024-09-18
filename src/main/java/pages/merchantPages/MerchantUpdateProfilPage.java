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

	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement merchantEmail;

	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement merchantPhone;

	@FindBy(xpath = "//input[@id='business_name']")
	private WebElement merchantBusinessName;

	@FindBy(xpath = "(//input[@id='image_id'])[1]")
	private WebElement merchantImage;

	@FindBy(xpath = "(//img[@alt='user'])[1]")
	private WebElement merchantUserImage;

	@FindBy(css = "button[class='btn btn-space btn-primary']")
	private WebElement saveChangeButton;

	@FindBy(xpath = "//div[@class='toast toast-error']")
	private WebElement suscessMessage;

	@FindBy(xpath = "//small[normalize-space()='The Name field is required.']")
	private WebElement merchantNameError;

	@FindBy(xpath = "//small[normalize-space()='The Address field is required.']")
	private WebElement merchantAdressError;

	public void getVerifyDisplayedMerchantInfo() {
		assertTrue(merchantName.isDisplayed());
		assertTrue(merchantAdress.isDisplayed());
		assertTrue(merchantUserImage.isDisplayed());

	}

	public void setMerchantInfo(String name, String adress, String picture) {

		merchantName.clear();
		merchantName.sendKeys(name);

		merchantAdress.clear();
		merchantAdress.sendKeys(adress);
		ReusableMethods.hardWait(2);

		ReusableMethods.uploadFile(configLoader.getConfigValue(picture), merchantImage);
		ReusableMethods.hardWait(3);

	}

	public void setMerchantInfoNameAdress(String name, String adress) {
		merchantName.clear();
		merchantName.sendKeys(name);

		merchantAdress.clear();
		merchantAdress.sendKeys(adress);
	}

	public void getClickSaveChangeButton() {

		saveChangeButton.click();
	}

	public void getSuccessMessages() {

		ReusableMethods.hardWait(1);
		ReusableMethods.paymentNotificationCatcher();

	}

	public void getErrorMessages() {

		merchantAdressError.isDisplayed();
		ReusableMethods.hardWait(1);
		merchantAdressError.isDisplayed();

	}

	public void getVerifyProfileInformation() {
		assertTrue(merchantName.isDisplayed());
		assertTrue(merchantEmail.isDisplayed());
		assertTrue(merchantPhone.isDisplayed());
		assertTrue(merchantBusinessName.isDisplayed());
		assertTrue(merchantAdress.isDisplayed());

	}

}
