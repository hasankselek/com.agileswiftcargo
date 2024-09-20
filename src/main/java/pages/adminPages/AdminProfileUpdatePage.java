package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminProfileUpdatePage extends BasePage {

    @FindBy(xpath = "//*[@class='btn btn-sm btn-primary mb-2']")
    public WebElement adminProfileEditButton;

    @FindBy(xpath = "//*[@class='col-xl-12'][1]")
    public WebElement adminProfileFirstTable;

    @FindBy(xpath = "//*[@class='col-xl-12'][2]")
    public WebElement adminProfileSecondTable;

    @FindBy(xpath = "//*[@placeholder='Enter name']")
    public WebElement adminProfileUpdateNameTextbox;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement adminUpdateProfileSaveButton;

}
