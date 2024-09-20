package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class MerchantAccInvoicePage extends BasePage {

    @FindBy(xpath = "(//*[text()=' Accounts'])[2]")
    public WebElement accountsMenuMerch;

    @FindBy(xpath = "(//*[@href=\"https://qa.agileswiftcargo.com/merchant/invoice\"])[2]")
    public WebElement invoiceMenuMerch;

    @FindBy(xpath = "//*[@class='table-responsive']")
    public WebElement invoiceListTableMerch;


}
