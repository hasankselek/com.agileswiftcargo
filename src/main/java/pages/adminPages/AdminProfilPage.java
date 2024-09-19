package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ConfigLoader;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

public class AdminProfilPage extends BasePage {
    ExcelDataReader reader = new ExcelDataReader(configLoader.getConfigValue("testData"), "adminLogin");

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath = "//*[text()='Sign up here']")
    public WebElement signUpHere;
    @FindBy(xpath = ("//img[@class='logo-img']"))
    public WebElement logo;

    @FindBy(xpath = ("//*[@class='nav-item login-button']"))
    public WebElement loginButton;
    @FindBy(xpath = "//*[text()='Forgot Password']")
    public WebElement forgotPasswordButton;
    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement warningMessageText;
    @FindBy(xpath = "//*[@class='form-control form-control-lg ']")
    public WebElement forgotEmailTextBox;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement sendPassResetLinkButton;
    @FindBy(xpath = "//*[@class='alert alert-success']")
    public WebElement succesAlerttext;

    public void loginAsAdmin(int rowAccessInfo) {

        email.sendKeys(reader.getCellData(rowAccessInfo, 1));
        password.sendKeys(reader.getCellData(rowAccessInfo, 2));
        signInButton.click();

    }

    public void directlyLoginAsAdmin(int rowAccessInfo) {
        loginButton.click();
        loginAsAdmin(rowAccessInfo);
        ReusableMethods.hardWait(1);
    }

}
