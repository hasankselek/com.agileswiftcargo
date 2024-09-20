package pages.adminPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.util.List;

public class AdminMerchantManageMerchantPage extends BasePage {

    String searchName;

    @FindBy(xpath = "(//input[@id='Psearch'])[1]")
    private WebElement searchBox;

    @FindBy(xpath = "(//a[@aria-label='Add'])[1]")
    private WebElement plusButton;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    private WebElement actionsButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='View'])[1]")
    private WebElement viewButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'][normalize-space()='Edit'])[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//button[@type='submit'][normalize-space()='Delete'])[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@id='business_name']")
    private WebElement businessName;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement merchantName;

    @FindBy(xpath = "//input[@id='mobile']")
    private WebElement merchantPhone;

    @FindBy(xpath = "//select[@id='hub']")
    private WebElement editHub;

    @FindBy(xpath = "//textarea[@id='address']")
    private WebElement editAdress;

    @FindBy(xpath = "//small[normalize-space()='The business name field is required.']")
    private WebElement businessNameError;

    @FindBy(xpath = "//small[normalize-space()='The Name field is required.']")
    private WebElement nameError;

    @FindBy(xpath = "//small[normalize-space()='The mobile field is required.']")
    private WebElement phoneError;

    @FindBy(xpath = "//small[normalize-space()='The mobile must be between 11 and 14 digits.']")
    private WebElement phoneError2;

    @FindBy(xpath = "//small[normalize-space()='The hub field is required.']")
    private WebElement hubError;

    @FindBy(xpath ="//small[normalize-space()='The Address field is required.']")
    private WebElement adressError;

    @FindBy(xpath = "//tbody/tr/td[2]/div[1]/div[2]")
    private List<WebElement> merchantListName;

    @FindBy(xpath = "//tbody//tr")
    private List<WebElement> extendMerchantList;

    @FindBy(xpath = "(//h2[normalize-space()='Create Merchant'])[1]")
    private WebElement createMerchantText;

    @FindBy(xpath = "//select[@name='status']")
    private WebElement merchantStatus;

    @FindBy(xpath = "//button[normalize-space()='Save Change']")
    private WebElement editSaveChangeButton;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement editSaveButton;

    public void getVerifiesSearchBoxDisplay(){

        Assert.assertTrue(searchBox.isDisplayed());
    }

    public void getVerifiesSearchBoxEnable(){

        Assert.assertTrue(searchBox.isEnabled());
    }

    public void getFillSearchBox(String searchText){

        searchName = searchText;
        searchBox.sendKeys(searchText);
    }

    public void getCheckMerchantListName(){

        ReusableMethods.hardWait(2);
        Assert.assertEquals(searchName,merchantListName.get(1).getText());

    }

    public void getCheckMerchantList(){

        Assert.assertFalse(extendMerchantList.isEmpty());
    }

    public void getCheckPlusButton(){

        Assert.assertTrue(plusButton.isDisplayed());
        Assert.assertTrue(plusButton.isEnabled());
    }

    public void getClickPlusButton(){
        plusButton.click();

    }

    public void getCheckCreateMerchantUrl(){
        ReusableMethods.hardWait(2);
        Assert.assertEquals(configLoader.getConfigValue("createMerchantUrl"),driver.getCurrentUrl());

    }

    public void getClickActions(){

        actionsButton.click();
    }

    public void getVerifyActionsVisible(){

        viewButton.isDisplayed();
        editButton.isDisplayed();
        deleteButton.isDisplayed();
    }

    public void getClickEditButton(){

        editButton.click();
    }

    public void getFillRequestedEditInformation(String businessNameText, String merchantNameText, String merchantPhoneText, String merchantHubText, String status, String merchantAdressText){

        businessName.clear();
        merchantName.clear();
        merchantPhone.clear();
        editAdress.clear();

        businessName.sendKeys(businessNameText);
        merchantName.sendKeys(merchantNameText);
        merchantPhone.sendKeys(merchantPhoneText);
        editAdress.sendKeys(merchantAdressText);
        ReusableMethods.selectByVisibleText(editHub,merchantHubText);
        ReusableMethods.selectByVisibleText(merchantStatus,status);

    }

    public void getClickSaveChangeButton(){

        ReusableMethods.scrollToElement(editSaveChangeButton);
        ReusableMethods.hardWait(1);
        editSaveChangeButton.click();
        ReusableMethods.hardWait(3);
    }

    public void getClickSaveButton(){

        ReusableMethods.scrollToElement(editSaveButton);
        ReusableMethods.hardWait(1);
        editSaveButton.click();
        ReusableMethods.hardWait(1);
    }

    public void getEmptyInfoErrorMessages(){

        ReusableMethods.hardWait(2);
        Assert.assertTrue(businessNameError.isDisplayed());
        Assert.assertTrue(nameError.isDisplayed());
        Assert.assertTrue(adressError.isDisplayed());
        Assert.assertTrue(phoneError.isDisplayed());
        }

    public void getWrongPhoneNumberMessage(){

        Assert.assertTrue(phoneError2.isDisplayed());
    }

    public void getClickDelete(){

        deleteButton.click();
        ReusableMethods.hardWait(2);

    }
    }












