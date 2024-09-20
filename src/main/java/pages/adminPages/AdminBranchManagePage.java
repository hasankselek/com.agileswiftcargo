package pages.adminPages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

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

    @FindBy(xpath = "//*[@data-toggle='tooltip']")
    public WebElement plusSign;

    @FindBy(xpath = "//*[@tabindex='-1']")
    public List<WebElement> actionsDropdowns;

    @FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
    public WebElement yesButtonOnDelete;

    public WebElement getDropdownItem(String itemText){

        WebElement itemXpath =driver.findElement(By.xpath("//*[text()='"+itemText+"']"));
        return itemXpath;
    }













}
