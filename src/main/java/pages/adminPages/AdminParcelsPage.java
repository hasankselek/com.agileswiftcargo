package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AdminParcelsPage extends BasePage {

    @FindBy(xpath = "//*[@id='table']//thead//th")
    public List<WebElement> parcelsTableHeadersList;

    @FindBy(xpath = "//*[@id='table']//tbody//tr")
    public List<WebElement> parcelsTableListByLines;

    @FindBy(xpath = "//*[@id='table']//tbody//tr//td")
    public List<WebElement> parcelsTableDataOneByOne;

    @FindBy(xpath = "//*[@class='form-group col-12 col-sm-6 col-md-4 col-lg-4 col-xl-2']")
    public List<WebElement> parcelFilterList;

    @FindBy(xpath = "//*[@class='ranges']//li")
    public List<WebElement> dateFilterOptions;

    @FindBy(xpath = "//ul[@class='select2-results__options']//li")
    public List<WebElement> statusFilterOptions;

    @FindBy(xpath = "//*[@class='select2-search__field']")
    public List<WebElement> merchantFilterSearchBox;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-space btn-primary']")
    public WebElement parcelFilterButton;

    @FindBy(xpath = "//span[@id='select2-parcelMerchantid-container']")
    public WebElement merchantName;

    @FindBy(xpath = "//span[@id='select2-parcelDeliveryManID-container']")
    public WebElement deliveryManName;

    @FindBy(xpath = "//span[@id='select2-parcelPickupmanId-container']")
    public WebElement pickUpManName;

    @FindBy(xpath = "//input[@id='invoice_id']")
    public WebElement invoiceId;

    @FindBy(xpath = "(//*[@id='Psearch'])[1]")
    public WebElement parcelsSearchBox;

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement parcelsSearchButton;

    @FindBy(xpath = "//*[@id='table']//tbody//tr[1]//td[2]")
    public WebElement firstCustomer3Dot;

    //---3DOT ACTION MENU

    @FindBy(xpath = "//*[@class='breadcrumb-item']")
    public List<WebElement> navigatorSubUrl;

    @FindBy(xpath = "//*[@class='table table-sm']//td[2]")
    public List<WebElement> parcelsViewMenuRecipentInfo;

    @FindBy(xpath = "//li[@class=' active ']")
    public List<WebElement> parcelsLogsMenuLogBar;

    @FindBy(xpath = "//input[@id='customer_name']")
    public WebElement parcelEditCustomerNameBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement parcelEditSubmitButton;

    @FindBy(xpath = "//button[text()='Save Change']")
    public WebElement parcelEditSaveChangeButton;


}
