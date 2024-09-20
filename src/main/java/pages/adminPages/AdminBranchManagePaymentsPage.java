package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AdminBranchManagePaymentsPage extends BasePage {
    @FindBy(xpath = "(//*[text()='Branch Manage'])[2]")
    public WebElement branchManageButton;
    @FindBy(xpath = "(//*[text()='Payments'])[3]")
    public WebElement PaymentsMenu;
    @FindBy(xpath = "//*[text()='Branch Payment List']")
    public WebElement branchPaymentList;
    @FindBy(xpath = "//*[@class='fa fa-plus']")
    public WebElement plusButton;
    @FindBy(xpath = "(//button[@type='button'])[7]")
    public WebElement actionsMenuButton;
    @FindBy(xpath = "//*[@tabindex='-1']")
    public List<WebElement> actionsDropdowns;
}
