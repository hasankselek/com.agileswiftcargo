package pages.homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomePage extends BasePage {


    @FindBy(xpath = "//*[text()='Our Services']")
    public WebElement ourServicesHeader;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;



}
