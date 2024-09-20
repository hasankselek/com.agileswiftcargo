package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

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
    public void getvisibilityoftheAdminBildProfileicons() {

        assertTrue(adminProfileButton.isDisplayed());
        assertTrue(adminChangePasswordButton.isDisplayed());
        assertTrue(adminLogoutButton.isDisplayed());

    }
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



}
