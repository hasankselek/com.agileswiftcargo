package pages.merchantPages;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.junit.Assert.*;

public class MerchantProfilePage extends BasePage {

	@FindBy(xpath = "(//div[contains(@class,'d-flex')])[10]")
	private WebElement merchantName;

	@FindBy(xpath = "(//div[contains(@class,'d-flex')])[11]")
	private WebElement merchantEmail;

	@FindBy(xpath = "(//div[contains(@class,'d-flex')])[12]")
	private WebElement merchantPhone;

	@FindBy(xpath = "(//div[contains(@class,'d-flex')])[13]")
	private WebElement merchantBusinessName;

	@FindBy(xpath = "(//div[contains(@class,'d-flex')])[14]")
	private WebElement merchantAdress;

	public void getDisplayedMerchantInformation(String name, String email, String phone, String businessName, String adress) {

		assertTrue(merchantName.getText().contains(name));
		assertTrue(merchantEmail.getText().contains(email));
		assertTrue(merchantPhone.getText().contains(phone));
		assertTrue(merchantBusinessName.getText().contains(businessName));
		assertTrue(merchantAdress.getText().contains(adress));


	}

}
