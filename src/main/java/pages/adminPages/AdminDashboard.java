package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AdminDashboard extends BasePage {


    @FindBy(xpath = ("//*[@id='navbarDropdownMenuLink2']"))
    public WebElement adminDashboardProfileBildButton;

    @FindBy(xpath = ("//*[@class='fas fa-user mr-2']"))
    public WebElement adminProfileButton;
    @FindBy(xpath = "//a[@class='dropdown-item' and contains(text(), 'Change password')]")
    public WebElement adminChangePasswordButton;
    @FindBy(xpath = ("//*[@class='fas fa-power-off mr-2']"))
    public WebElement adminLogoutButton;
    @FindBy(xpath = ("//*[@id='old_password']"))
    public WebElement adminChangePasswordOldButton;
    @FindBy(xpath = ("//*[@id='new_password']"))
    public WebElement adminChangePasswordNewButton;
    @FindBy(xpath = ("//*[@id='confirm_password']"))
    public WebElement adminChangePasswordConfirmButton;
    @FindBy(xpath = ("//*[@class='btn btn-space btn-primary']"))
    public WebElement adminChangePasswordSaveChange;
    @FindBy(xpath = ("//*[@class='btn btn-space btn-secondary']"))
    public WebElement adminChangePasswordCanselButton;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total Parcel')]")
    public WebElement totalParcel;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total User')]")
    public WebElement totalUser;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total Merchant')]")
    public WebElement totalMerchant;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total Delivery Man')]")
    public WebElement totalDeliveryMan;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total Branch')]")
    public WebElement totalBranch;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total Accounts')]")
    public WebElement totalAccounts;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total Partial Delivered')]")
    public WebElement totalPartialDelivered;
    @FindBy(xpath = "//*[@class='text-muted' and contains(text(), 'Total parcels deliverd')]")
    public WebElement totalParcelsDeliverd;
    @FindBy(xpath = "(//*[@class='col-md-4'])[1]")
    public List<WebElement> deliveryManStatements;
    @FindBy(xpath = "(//*[@class='col-md-4'])[2]")
    public WebElement merchantStatements;
    @FindBy(xpath = "(//*[@class='col-md-4'])[3]")
    public WebElement branchStatements;
    @FindBy(xpath = ("//*[@id='apexincomeexpense']"))
    public WebElement graphApexIncomeExpense;
    @FindBy(xpath = ("//*[@id='apexpiecourierrevenue']"))
    public WebElement graphApexpieCourierRevenue;
    @FindBy(xpath = ("//*[@id='datetimepicker12']"))
    public WebElement dateTimePicker;
    @FindBy(xpath = "(//td[@class='day active today'])")
    public WebElement dateofdays;
    @FindBy(xpath = "(//th[@title='Select Month'])")
    public WebElement dateofmonths;
    @FindBy(xpath = "(//*[text()='Save'])[2]")
    public WebElement ticketSaveButton;
    @FindBy(xpath = "(//*[@class='sr-only'])[2]")
    public WebElement ticketEditButton;
    @FindBy(xpath = "//*[text()='Save Change']")
    public WebElement ticketSaveChangeButton;
    @FindBy(xpath = "//*[text()='Name']")
    public WebElement nameText;
    @FindBy(xpath = "//a[contains(text(),'Payroll')]")
    public WebElement payrollText;
    @FindBy(xpath = "//a[contains(@class,'nav-link')][normalize-space()='Salary Generate']")
    public WebElement salaryGenerateText;


    public void getvisibilityoftheAdminBildProfileicons() {

        assertTrue(adminProfileButton.isDisplayed());
        assertTrue(adminChangePasswordButton.isDisplayed());
        assertTrue(adminLogoutButton.isDisplayed());

    }


}
