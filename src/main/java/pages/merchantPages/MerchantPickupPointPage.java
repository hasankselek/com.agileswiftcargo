package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class MerchantPickupPointPage extends BasePage {

@FindBy(xpath = "//*[@data-target='#settings']")
    public WebElement setting;
@FindBy(xpath = "(//*[@class='nav-link active'])[2]")
    public WebElement pickup;
@FindBy(xpath = "//*[text()='Pickup Point List']")
    public WebElement pickuptitle;
@FindBy(xpath = "(//*[@class='breadcrumb-item'])[2]")
    public WebElement pickuptitleAds;
@FindBy(xpath = "(//*[@class='col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12'])[2]")
    public WebElement pickupTable;
@FindBy(xpath = "(//*[@class='fa fa-plus'])[3]")
    public WebElement plusButton;
@FindBy(xpath = "//*[@class='pageheader-title']")
    public WebElement plusTitle;
@FindBy(xpath = "//*[@placeholder='Enter name']")
    public WebElement nameBoxPlus;
@FindBy(xpath = "//*[@type='phone']")
    public WebElement contactBoxPlus;
@FindBy(xpath = "//*[@id='address']")
    public WebElement addressBoxPlus;
@FindBy(xpath = "//*[@class='form-control ']")
    public WebElement statusBoxPlus;
@FindBy(xpath = "(//*[@type='submit'])[3]")
    public WebElement saveButtonPlus;
@FindBy(xpath = "//tr")
    public List<WebElement> tableRows;
@FindBy(xpath = "(//*[@class='btn btn-primary dropdown-toggle dropdown-toggle-split'])[1]")
    public WebElement actionButton;
@FindBy(xpath = "(//*[@class='fas fa-edit'])[1]")
    public WebElement editButton;
@FindBy(xpath = "((//*[@id='delete'])[1]")
    public WebElement deleteButton;
@FindBy(xpath = "//*[@class='swal2-popup swal2-modal swal2-show']")
    public WebElement popUp;
    @FindBy(xpath = "//*[@class='swal2-confirm swal2-styled'")
    public WebElement yesButton;


}
