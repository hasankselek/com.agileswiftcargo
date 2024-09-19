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
    @FindBy(xpath = "btn btn-success btn-sm ")
    public WebElement impotrButton;
    @FindBy(xpath = "(//*[@class='btn btn-sm ml-2 bnone'])[2]")
    public WebElement dropdownButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement viewButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement parcelLogsButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement cloneButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[4]")
    public WebElement editButton;
    @FindBy(xpath = "(//*[@class='fa fa-trash'])[1]")
    public WebElement deletButton;
    @FindBy(xpath = "//*[@class='btn btn-success btn-sm float-right']")
    public WebElement downloadSampleButton;
    @FindBy(id = "customFile")
    public WebElement cooseButton;
    @FindBy(xpath = "//*[text()=' Import']")
    public WebElement importButton;
    @FindBy(xpath = "(//*[@class='form-control cash-collection'])[1]")
    public WebElement cashButton;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement categorytButton;
    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
    public WebElement typeButton;
    @FindBy(xpath = "//*[@class='select2-results__option select2-results__option--selectable select2-results__option--selected']")
    public WebElement samedayButton;
    @FindBy(xpath = "//*[text()='Customer Name']")
    public WebElement custumerNameButton;
    @FindBy(xpath = "//*[@class='select2-results__options']")
    public WebElement kgText;
    @FindBy(xpath = "(//*[@class='form-control'])[14]")
    public WebElement customerPhoneButton;
    @FindBy(xpath = "(//*[@class='custom-control-label'])[2]")
    public WebElement parcellbankButton;
    @FindBy(xpath = "(//*[@class='form-control'])[15]")
    public WebElement addressButton;
    @FindBy(xpath = "//*[@class='btn btn-space btn-primary']")
    public WebElement saveButton;
}
