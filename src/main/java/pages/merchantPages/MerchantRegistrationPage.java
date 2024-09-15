package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MerchantRegistrationPage extends BasePage {

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(id = "business_name")
    public WebElement businessNameBox;

    @FindBy(id = "full_name")
    public WebElement fullNameBox;

    @FindBy(id = "mobile")
    public WebElement mobileBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "address")
    public WebElement addressBox;

    @FindBy(id = "merchant_registration_checkbox")
    public WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//*[text()='Agile Swift Cargo']")
    public WebElement privacyPolicyLink;

    @FindBy(id = "select2-hub_id-container")
    public WebElement selectHubDropdown;

    @FindBy(xpath ="//*[text()='New York City']")
    public WebElement newYorkHub;

    @FindBy(xpath = "//*[text()='Register My Account']")
    public WebElement registerMyAccButton;

    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement warningMessage;






}
