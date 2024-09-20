package pages.adminPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminOffersPage extends BasePage {

    @FindBy(xpath = "//*[@aria-label='Add']")
    public WebElement addOfferButton;

    @FindBy(xpath = "(//tbody/tr[1]//td[5]//button)[1]")
    public WebElement offerActionButton;

    @FindBy(xpath = "//tbody/tr[1]//td[5]//a")
    public WebElement offerActionEditButton;




}
