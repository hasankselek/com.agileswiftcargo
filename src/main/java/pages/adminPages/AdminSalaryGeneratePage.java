package pages.adminPages;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AdminSalaryGeneratePage extends BasePage {
    @FindBy(xpath = "//*[text()='Salary Generate']")
    public WebElement salary;
    @FindBy(xpath = "//*[@aria-controls='salarygenerate']")
    public WebElement payRoll;
    @FindBy(xpath = "//*[text()='Salary Generate']")
    public WebElement salaryTitle;
@FindBy(xpath = "(//*[@class='table-responsive'])[1]")
    public WebElement salaryList;


}
