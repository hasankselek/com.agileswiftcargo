package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminDashboard extends BasePage {
    public utilities.ConfigLoader ConfigLoader;
    @FindBy(xpath = ("//*[@class='nav-link nav-user-img']"))
    public WebElement AdminProfilButton;



}
