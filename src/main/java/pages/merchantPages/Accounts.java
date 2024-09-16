package pages.MerchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;


public class Accounts extends BasePage {

    @FindBy(xpath = "//*[@class='navbar-nav']//li")
    public List<WebElement> leftMenuBlock;

    // Menu page title after clicking a menu on the left
    @FindBy(xpath = "(//*[@class='h3'])[1]")
    public WebElement menuPageLabel;

    @FindBy(xpath = "//*[@class='table-responsive']")
    public WebElement paymentReceivedListTable;


    //PRL stands for Payment Recieved List
    @FindBy(xpath = "//thead//th")
    public List<WebElement> paymentRLTHeader;

    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> transactionsListAllData;

    @FindBy(xpath = "//a[contains(@href, 'stripe')]")
    public WebElement stripeButton;

    @FindBy(xpath = "//img[contains(@src, 'stripe.png')]")
    public WebElement stripeLogo;

    @FindBy(xpath = "(//*[@class='h3'])[2]")
    public WebElement stripeMenuLabel;

    @FindBy(xpath = "//select[@id='accountId']")
    public WebElement stripeToAccountBox;

    @FindBy(xpath = "//input[@id='stripe_amount']")
    public WebElement stripeAmountBox;

    @FindBy(xpath = "//button[text()='Pay Now']")
    public WebElement stripePayNowButton;


}
