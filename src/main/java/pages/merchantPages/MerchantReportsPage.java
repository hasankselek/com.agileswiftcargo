package pages.merchantPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class MerchantReportsPage extends BasePage {

    @FindBy(xpath = "(//*[@class='nav-link '])[10]")
    public WebElement totalSummary;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement loginBox;

    @FindBy(xpath = "//*[@placeholder='Password']")
    public WebElement passLoginBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signinButton;

    @FindBy(xpath = "//*[@data-target='#reports']")
    public WebElement reportsLink;

    @FindBy(xpath = "(//*[@class='breadcrumb-link'])[3]")
    public WebElement totlSmryTitle;

    @FindBy(xpath = "//*[@class='btn btn-space btn-primary group-btn ml-0']")
    public WebElement filterButton;

    @FindBy(xpath = "//*[@class='btn btn-space btn-primary group-btn ml-0']")
    public WebElement entrDateBox;

    @FindBy(xpath = "//*[@placeholder='Enter Date']")
    public WebElement entrBox;

    @FindBy(xpath = "//*[@data-range-key='Yesterday']")
    public WebElement yesterday;

    @FindBy(xpath = "//*[@data-range-key='Today']")
    public WebElement today;

    @FindBy(xpath = "//*[@data-range-key='Last 7 Days']")
    public WebElement last7Day;

    @FindBy(xpath = "//*[@data-range-key='Last 30 Days']")
    public WebElement last30Day;

    @FindBy(xpath = "//*[@data-range-key='Last Month']")
    public WebElement lastMonth;

    @FindBy(xpath = "//*[@data-range-key='This Month']")
    public WebElement thisMonth;

    @FindBy(xpath = "//*[@data-range-key='Custom Range']")
    public WebElement customRange;

    @FindBy(xpath = "//*[@class='applyBtn btn btn-sm btn-primary']")
    public WebElement applyButton;

    @FindBy(xpath = "//*[@class='available']")
    public List<WebElement> customRangeDate;

    @FindBy(xpath = "//*[@class='list-group m-2']")
    public List<WebElement> tableFivePart;

    @FindBy(xpath = "//*[@class='container-fluid  dashboard-content']")
    public WebElement tableCollFivePart;


}

