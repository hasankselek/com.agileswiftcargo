package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminDeliveryManPage extends BasePage {

    @FindBy(xpath = "//*[@id='email']")
    public WebElement loginBox;

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement passLoginBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signinButton;

    @FindBy(xpath = "(//*[@class='fa fa-people-carry'])[2]")
    public WebElement deliverLink;

    @FindBy(xpath = "//*[@class='btn btn-space btn-primary']")
    public WebElement filterDel;

    @FindBy(xpath = "//*[@placeholder='User Name']")
    public WebElement delNameBox;

    @FindBy(xpath = "//*[@placeholder='User Email']")
    public WebElement delEmailBox;

    @FindBy(xpath = "//*[@placeholder='Phone']")
    public WebElement delPhoneBox;

    @FindBy(xpath = "//*[@class='btn btn-space btn-secondary']")
    public WebElement clearDelButton;

    @FindBy(xpath = "//*[@class='fa fa-plus']")
    public WebElement plusButton;

    @FindBy(xpath = "//*[@placeholder='Enter Name']")
    public WebElement delNameEdit;

    @FindBy(xpath = "//*[@placeholder='Enter Email']")
    public WebElement delEmailEdit;

    @FindBy(xpath = "//*[@placeholder='Enter Phone']")
    public WebElement delPhoneEdit;

    @FindBy(xpath = "(//*[@class='btn btn-primary dropdown-toggle dropdown-toggle-split'])[1]")
    public WebElement actionButton;

    @FindBy(xpath = "(//*[@aria-hidden='true'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//*[@class='btn btn-space btn-secondary']")
    public WebElement cancelEditButton;

    @FindBy(xpath = "//*[@class='btn btn-space btn-secondary']")
    public WebElement filterResult;

    @FindBy(xpath = "//*[@placeholder='Enter Return charge']")
    public WebElement returnChange;

    @FindBy(xpath = "//*[@name='opening_balance']")
    public WebElement openBalance;

    @FindBy(xpath = "//*[@placeholder='Salary']")
    public WebElement salary;

    @FindBy(xpath = "//*[@id='input-select']")
    public WebElement hub;

    @FindBy(xpath = "//*[@placeholder='Enter Address']")
    public WebElement addressForm;

    @FindBy(xpath = "//*[@name='delivery_charge']")
    public WebElement deliveryChange;

    @FindBy(xpath = "//*[@placeholder='Enter Pickup Charge']")
    public WebElement pickupCharge;

    @FindBy(xpath = "//*[@placeholder='Enter Password']")
    public WebElement passwordForm;

    @FindBy(xpath = "//*[@class='btn btn-space btn-primary']")
    public WebElement saveInPlusDel;

    @FindBy(xpath = "//*[@class='text-danger mt-2']")
    public WebElement alertText;

    @FindBy(xpath = "//*[@class='pageheader-title']")
    public WebElement editTitle;



}
