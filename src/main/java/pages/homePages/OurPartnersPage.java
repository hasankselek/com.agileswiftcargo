package pages.homePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class OurPartnersPage extends BasePage {

    @FindBy (xpath = "//*[@class=\"partner-logo\"]")
    public List<WebElement> partnersLogosList;

    @FindBy (xpath = "(//*[@class='partner-logo'])[1]")
    public WebElement partnersLogo1;

    @FindBy (xpath = "//*[@role='button']")
    public List<WebElement> ourPartnersSlideButtons;

    @FindBy (xpath = "(//*[@class='section-title'])[5]")
    public WebElement ourPartnersTitle;
}
