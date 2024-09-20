package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MerchantReportsParcelStatusPage extends BasePage {

    @FindBy(xpath = "(//*[text()='Reports'])[2]")
    public WebElement reportsMenuMerch;

    @FindBy(xpath = "(//*[@href=\"https://qa.agileswiftcargo.com/merchant/reports/parcel-reports\"])[2]")
    public WebElement parcelStatusReportsMenuMerch;

    @FindBy(xpath = "//*[text()=' Filter']")
    public WebElement parcelStatusReportsFilterButton;

    @FindBy(xpath = "//*[@class='form-control date_range_picker']")
    public WebElement parcelStatusReportsDateBox;

    @FindBy(xpath = "//*[@data-range-key='Last 30 Days']")
    public WebElement parcelStatusReportsDateFilter30Days;

    @FindBy(xpath = "//*[@id='exportTable']")
    public WebElement parcelStatusReportsExportButton;

    @FindBy(xpath = "//*[@href='https://qa.agileswiftcargo.com/merchant/parcel-reports-print-page/1128,']")
    public WebElement parcelStatusReportsPrintButton;
}
