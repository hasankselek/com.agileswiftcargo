package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ExcelDataReader;

public class AdminAccountPage extends BasePage {

    ExcelDataReader reader = new ExcelDataReader(configLoader.getConfigValue("testData"), "adminLogin");


    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath = "//a[@data-toggle='collapse'][normalize-space()='Accounts']")
    public WebElement accountsmenu;
    @FindBy(xpath = "(//*[text()='Account Heads'])[2]")
    public WebElement headsButton;

    @FindBy(xpath = "(//*[text()='Fund Transfer'])[2]")
    public WebElement fundButton;
    @FindBy(xpath = "(//*[text()='Fund Transfer'])[5]")
    public WebElement fundListText;


}
