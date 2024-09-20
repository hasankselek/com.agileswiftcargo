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
    public List<WebElement> profileIconLinks;
  
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

	@FindBy(xpath = "(//*[text()='Ticket'])[3]")
	public WebElement navBarTicketText;

	@FindBy(xpath = "(//*[text()='Ticket'])[3]")
	public WebElement ticketText;

	@FindBy(xpath = "//*[@class='active']")
	public WebElement userInfoName;

	@FindBy(xpath = "//*[@aria-label='Ticket Add']")
	public WebElement ticketAddButton;

	@FindBy(xpath = "//*[text()='Ticket Add']")
	public WebElement ticketAddText;

	@FindBy(xpath = "//*[@name='service']")
	public WebElement selectServiceButton;

	@FindBy(xpath = "//*[text()='Pick Up']")
	public WebElement selectPickUp;

	@FindBy(xpath = "//*[@name='priority']")
	public WebElement selectPriorityButton;

	@FindBy(xpath = "//*[text()='Low']")
	public WebElement selectPriorityLow;

	@FindBy(xpath = "//*[@name='department_id']")
	public WebElement departmanButton;

	@FindBy(xpath = "//*[text()='Finance']")
	public WebElement financeText;

	@FindBy(xpath = "//*[@name='subject']")
	public WebElement subjectBox;

	@FindBy(xpath = "//*[@role='textbox']")
	public WebElement descriptionBox;

	@FindBy(xpath = "//*[text()='Save']")
	public WebElement saveButton;

	@FindBy(xpath = "//*[text()='Save Change']")
	public WebElement saveChangeButton;

	@FindBy(xpath = "(//*[@class='sr-only'])[1]")
	public WebElement actionDropdownButton;

	@FindBy(xpath = "(//*[text()=' Edit'])[1]")
	public WebElement editButton;

	@FindBy(xpath = "//*[text()='Parcel']")
	public WebElement viewPageParcelText;

	@FindBy(xpath = "(//*[text()=' View'])[1]")
	public WebElement ticketDropdownViewButton;

	@FindBy(xpath = "(//*[text()=' Delete'])[1]")
	public WebElement ticketDropdownDeleteButton;

	@FindBy(xpath = "//*[text()='Yes']")
	public WebElement deleteYesButton;





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
