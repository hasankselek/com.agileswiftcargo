package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MerchantParcelsPage extends BasePage {

    @FindBy(xpath = "//*[@class='d-flex   parcelsearchFlex parcel-import-export-btn']")
    public WebElement parcelsTable;
    @FindBy(xpath = "//*[@class='btn btn-success btn-sm '][1]")
    public WebElement excelButton;
    @FindBy(xpath = "//*[@class='btn btn-success btn-sm '][2]")
    public WebElement csvButton;
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm mr-2']")
    public WebElement addButton;
    @FindBy(xpath = "(//*[@class='form-control cash-collection'])[2]")
    public WebElement sellingButton;
    @FindBy(xpath = "(//*[@class='form-group col-12 col-md-6'])[13]")
    public WebElement noteButton;
    @FindBy(xpath = "(//*[@class='form-group col-12 col-md-6'])[6]")
    public WebElement invoysButton;

    @FindBy(xpath = "(//*[@class='btn btn-sm ml-2 bnone'])[2]")
    public WebElement dropdownButton;
    @FindBy(xpath = "//*[text()=' View']")
    public WebElement viewtext;
    @FindBy(xpath = "//*[text()=' Parcel Logs']")
    public WebElement parcelLogsButton;
    @FindBy(xpath = "//*[text()=' Clone']")
    public WebElement cloneButton;
    @FindBy(xpath = "//*[text()=' Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//*[text()=' Delete']")
    public WebElement deletButton;
    @FindBy(xpath = "//*[text()='Download Sample']")
    public WebElement downloadSampleButton;
    @FindBy(id = "customFile")
    public WebElement cooseButton;
    @FindBy(xpath = "(//*[@data-toggle='tooltip'])[6]")
    public WebElement importButton;
    @FindBy(xpath = "(//*[@class='form-control cash-collection'])[1]")
    public WebElement cashButton;
    @FindBy(xpath = "(//*[text()=' Select Category'])[2]")
    public WebElement categorytButton;
    @FindBy(xpath = "(//*[text()='KG'])[2]")
    public WebElement selectKG;
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
    public WebElement typeButton;
    @FindBy(xpath = "//*[@class='select2-results__option select2-results__option--selectable select2-results__option--selected']")
    public WebElement samedayButton;
    @FindBy(xpath = "//*[@id='customer_name']")
    public WebElement custumerNameButton;
    @FindBy(xpath = "//*[@class='select2-results__options']")
    public WebElement kgText;
    @FindBy(xpath = "//*[@placeholder='Customer Phone']")
    public WebElement customerPhoneButton;
    @FindBy(xpath = "(//*[text()=' Select Delivery Type'])[2]")
    public WebElement selectDeliveryTypeButton;
    @FindBy(xpath = "//*[@id=select2-delivery_type_id-result-2hpc-1]")
    public WebElement selectSumDay;
    @FindBy(xpath = "(//*[@class='custom-control-label'])[2]")
    public WebElement parcellbankButton;
    @FindBy(xpath = "//*[@id='customer_address']")
    public WebElement addressButton;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButton;

}
