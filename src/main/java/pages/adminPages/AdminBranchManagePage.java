package pages.adminPages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminBranchManagePage extends BasePage {


    @FindBy(xpath = "(//*[text()='Branch Manage'])[2]")
    public WebElement branchManageSideBarMenu;

    @FindBy(xpath = "(//*[text()='Branch'])[3]")
    public WebElement branchMenu;

    @FindBy(xpath = "//*[@class='btn btn-space btn-primary']")
    public WebElement filterButton;

    @FindBy(xpath = "//*[@class='btn btn-space btn-secondary']")
    public WebElement clearButton;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement filterBox;

    @FindBy(xpath = "//td[2]")
    public WebElement branchNameOnTable;









}
