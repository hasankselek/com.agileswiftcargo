package pages.adminPages.merchantManage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Merchants extends BasePage {

    @FindBy(xpath = "(//input[@id='Psearch'])[1]")
    private WebElement searchBox;

    @FindBy(xpath = "(//a[@aria-label='Add'])[1]")
    private WebElement plusButton;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    private WebElement actionsButton;

    @FindBy(xpath = "//*[text()='View]")
    private WebElement viewButton;

    @FindBy(xpath = "//*[text()='Edit']")
    private WebElement editButton;

    @FindBy(xpath = "//*[text()='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@id='business_name']")
    private WebElement businessName;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement merchantName;

    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement merchantPhone;

    @FindBy(xpath = "//select[@name='status']")
    private WebElement merchantStatus;

    @FindBy(xpath = "(//input[@id='image_id'])[1]")
    private WebElement editImage;

    @FindBy(xpath = "//select[@id='hub']")
    private WebElement editHub;

    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement editAdress;

    @FindBy(xpath = "(//small[normalize-space()='The business name field is required.'])[1]")
    private WebElement businessNameError;

    @FindBy(xpath = "//small[normalize-space()='The Name field is required.']")
    private WebElement nameError;

    @FindBy(xpath = "//small[normalize-space()='The mobile field is required.']")
    private WebElement phoneError;

    @FindBy(xpath = "//small[normalize-space()='The hub field is required.']")
    private WebElement hubError;

    @FindBy(xpath ="//small[normalize-space()='The Address field is required.']")
    private WebElement adressError;









}
