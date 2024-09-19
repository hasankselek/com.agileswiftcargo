package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.adminPages.AdminDashboard;
import pages.adminPages.AdminProfilPage;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AdminDashBoardVisibilityStepDef extends BaseStep {
    AdminDashboard adminDashboard=new AdminDashboard();
    AdminProfilPage adminProfilPage= new AdminProfilPage();
    @Then("Click the Login button as administrator and enter the system")
    public void click_the_login_button_as_administrator_and_enter_the_system() {
       adminProfilPage.loginAsAdmin(9);
    }
    @Then("Test the visibility of the Total Parcel information banner in the dashboard")
    public void test_the_visibility_of_the_total_parcel_information_banner_in_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalParcel.isDisplayed());
    }
    @Then("Test the visibility of the Total User information banner on the dashboard")
    public void test_the_visibility_of_the_total_user_information_banner_on_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalUser.isDisplayed());
    }
    @And("Test the visibility of the Total Merchant information banner on the dashboard")
    public void testTheVisibilityOfTheTotalMerchantInformationBannerOnTheDashboard() {
        Assert.assertTrue(adminDashboard.totalMerchant.isDisplayed());
    }
    @Then("Test the visibility of the Total Delivery Man information banner on the dashboard")
    public void test_the_visibility_of_the_total_delivery_man_information_banner_on_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalDeliveryMan.isDisplayed());
    }
    @Then("Test the visibility of the Total Branch information banner on the dashboard")
    public void test_the_visibility_of_the_total_branch_information_banner_on_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalBranch.isDisplayed());
    }
    @Then("Test the visibility of the Total Accounts information banner on the dashboard")
    public void test_the_visibility_of_the_total_accounts_information_banner_on_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalAccounts.isDisplayed());
    }
    @Then("Test the visibility of the Total Partial Deliverd information banner on the dashboard")
    public void test_the_visibility_of_the_total_partial_deliverd_information_banner_on_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalPartialDelivered.isDisplayed());
    }
    @Then("Test the visibility of the Total parcels deliverd information banner on the dashboard")
    public void test_the_visibility_of_the_total_parcels_deliverd_information_banner_on_the_dashboard() {
        Assert.assertTrue(adminDashboard.totalParcelsDeliverd.isDisplayed());
    }
    @Then("Test the visibility of the Delivery Man Statements information box in the dashboard")
    public void test_the_visibility_of_the_delivery_man_statements_information_box_in_the_dashboard(){
        for (WebElement statement : adminDashboard.deliveryManStatements) {
            String text = statement.getText();

            // 'Income' öğesinin içerdiğini kontrol et
            if (text.contains("Income")) {
                Assert.assertTrue(adminDashboard.deliveryManStatements.get(0).isDisplayed());
            }
            // 'Expense' öğesinin içerdiğini kontrol et
            else if (text.contains("Expense")) {
                Assert.assertTrue(adminDashboard.deliveryManStatements.get(1).isDisplayed());
            }
            // 'Balance' öğesinin içerdiğini kontrol et
            else if (text.contains("Balance")) {
                Assert.assertTrue(adminDashboard.deliveryManStatements.get(2).isDisplayed());
            }
        }
    }
    @Then("Test the visibility of the Merchant Statements information box in the dashboard")
    public void test_the_visibility_of_the_merchant_statements_information_box_in_the_dashboard() {
        Assert.assertTrue(adminDashboard.merchantStatements.isDisplayed());
    }
    @Then("Test the visibility of the Branch Statements information box in the dashboard")
    public void test_the_visibility_of_the_branch_statements_information_box_in_the_dashboard() {
        Assert.assertTrue(adminDashboard.branchStatements.isDisplayed());
    }
    @Then("page scrolls down once")
    public void page_Scrolls_Down_Once() {
        page_Scrolls_Down(Driver.getDriver(),"500");
    }
    @And("Test the visibility of the graph in the Income-Expense field")
    public void testTheVisibilityOfTheGraphInTheIncomeExpenseField() {
        Assert.assertTrue("Graph is not displayed!",adminDashboard.graphApexIncomeExpense.isDisplayed());
        Assert.assertTrue("Graph is not displayed!",adminDashboard.graphApexpieCourierRevenue.isDisplayed());
    }
    @And("Test the visibility of the date time")
    public void testTheVisibilityOfTheDateTime() {
        page_Scrolls_Down(Driver.getDriver(),"1000");
        Assert.assertTrue(adminDashboard.dateTimePicker.isDisplayed());
    }
    public void page_Scrolls_Down(WebDriver driver,String pixel) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixel + ");");
        ReusableMethods.hardWait(2);
    }

    @And("the calendar is tested for timeliness")
    public void theCalendarIsTestedForTimeliness() {
        String dateStr = adminDashboard.dateofdays+" "+adminDashboard.dateofmonths;
        System.out.println(dateStr);
        // DateTimeFormatter ile tarihi belirli bir formata göre ayarlıyoruz
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate today = LocalDate.now();
        String expectedDate = today.format(formatter);
        Assert.assertEquals("the calendar is not actual",dateStr,expectedDate);
    }

}
