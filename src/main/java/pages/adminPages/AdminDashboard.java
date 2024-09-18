package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.junit.Assert.assertTrue;

public class AdminDashboard extends BasePage {


    @FindBy(xpath = ("//*[@id='navbarDropdownMenuLink2']"))
    public WebElement AdminDashboardProfileBildButton;

    @FindBy(xpath = ("//*[@class='fas fa-user mr-2']"))
    public WebElement AdminProfileButton;
    @FindBy(xpath = ("(//a[contains(@class,'dropdown-item')][normalize-space()='Change password'])[2]"))
    public WebElement AdminChangePasswordButton;
    @FindBy(xpath = ("//*[@class='fas fa-power-off mr-2']"))
    public WebElement AdminLogoutButton;
    public void getvisibilityoftheAdminBildProfileicons() {

        assertTrue(AdminProfileButton.isDisplayed());
        assertTrue(AdminChangePasswordButton.isDisplayed());
        assertTrue(AdminLogoutButton.isDisplayed());

    }
    @FindBy(xpath = ("//*[@id='old_password']"))
    public WebElement  AdminChangePasswordOldButton;
    @FindBy(xpath = ("//*[@id='new_password']"))
    public WebElement AdminChangePasswordNewButton;
    @FindBy(xpath = ("//*[@id='confirm_password']"))
    public WebElement AdminChangePasswordConfirmButton;
    @FindBy(xpath = ("//*[@class='btn btn-space btn-primary']"))
    public WebElement AdminChangePasswordSaveChange;
    @FindBy(xpath = ("//*[@class='btn btn-space btn-secondary']"))
    public WebElement AdminChangePasswordCanselButton;

}
