package pages.merchantPages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MerchantDashboard extends BasePage {

	@FindBy(xpath = "//li[@class='nav-item dropdown nav-user d-lg-block']//a[@id='navbarDropdownMenuLink2']")
	private WebElement profileIcon;

    @FindBy(xpath = "(//div[@class='dropdown-menu dropdown-menu-right nav-user-dropdown show'])/a[@class='dropdown-item']")
	private List<WebElement> profileIconLinks;
  
  @FindBy(xpath = "(//*[@class='fa fa-dolly'])[2]")
  public WebElement parcelsButton;
  
  @FindBy(xpath = "//*[@class='breadcrumb-link active']")
  public WebElement listyazisi;
  
  @FindBy(xpath = "(//*[@class='card-body'])[1]")
  public WebElement textboxses;
  
  @FindBy(xpath = "//*[@name='parcel_date']")
  public WebElement dateButton;
  
  @FindBy(xpath = "//*[@class='active']")
  public WebElement todayButton;
  
  @FindBy(xpath="//*[@id='parcel_customer']")
  public  WebElement custumerButton;

	public void getClickProfileIcon() {
        ReusableMethods.hardWait(2);
        profileIcon.click();
    }
    

  public void getVerifyProfileIconLinks(String Profile,String PaymentInformation,String ChangePassword,String Logout){

        assertEquals(profileIconLinks.get(0).getText(),Profile);
        assertEquals(profileIconLinks.get(1).getText(),PaymentInformation);
        assertEquals(profileIconLinks.get(2).getText(),ChangePassword);
        assertEquals(profileIconLinks.get(3).getText(),Logout);
    }




}
