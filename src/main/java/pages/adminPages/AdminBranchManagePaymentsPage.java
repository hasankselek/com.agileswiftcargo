package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminBranchManagePaymentsPage extends BasePage {
    @FindBy(xpath = "(//*[text()='Branch Manage'])[2]")
    public WebElement branchManageSideBarMenu;
}
