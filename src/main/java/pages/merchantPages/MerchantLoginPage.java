package pages.merchantPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.homePages.HomePage;
import utilities.ExcelDataReader;
import utilities.ReusableMethods;

public class MerchantLoginPage extends BasePage {

    ExcelDataReader reader = new ExcelDataReader(configLoader.getConfigValue("testData"),"merchantLogin");
    HomePage homePage = new HomePage();

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;











    public void loginAsMerchant(int rowAccessInfo) {

        emailBox.sendKeys(reader.getCellData(rowAccessInfo,1));
        passwordBox.sendKeys(reader.getCellData(rowAccessInfo,2));
        signInButton.click();

    }

    public void directlyLoginAsMerchant(int rowAccessInfo){
        homePage.loginButton.click();
        loginAsMerchant(rowAccessInfo);
        ReusableMethods.hardWait(1);
    }


}
