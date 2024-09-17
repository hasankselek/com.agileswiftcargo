package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ConfigLoader;
import utilities.ExcelDataReader;

public class AdminProfilPage extends BasePage {
    public utilities.ConfigLoader ConfigLoader;
    ExcelDataReader reader = new ExcelDataReader(configLoader.getConfigValue("testData"),"adminLogin");

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
    public void loginAsAdmin(int rowAccessInfo) {

        email.sendKeys(reader.getCellData(rowAccessInfo,1));
        password.sendKeys(reader.getCellData(rowAccessInfo,2));
        signInButton.click();

    }

}
