package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MerchantForgotPasswordPage extends BasePage {

    @FindBy(xpath = "//*[@class='form-control form-control-lg ']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement sendPassResetButton;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement succesAlert;




}
