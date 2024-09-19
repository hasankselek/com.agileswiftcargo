package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.adminPages.AdminBranchManagePaymentsPage;
import utilities.ReusableMethods;

public class AdminBrancheManagePaymentsStepDef {
    AdminBranchManagePaymentsPage adminBranchManagePaymentsPage=new AdminBranchManagePaymentsPage();
    @And("Click on Branch Manage")
    public void clickOnBranchManage() {
       adminBranchManagePaymentsPage.branchManageButton.click();

    }

    @And("Click on the Payments Icon")
    public void clickOnThePaymentsIcon() {
        adminBranchManagePaymentsPage.PaymentsMenu.click();
    }
    @And("Test the visibility of the Branch Payment list")
    public void testTheVisibilityOfTheBranchPaymentList() {
        Assert.assertTrue(adminBranchManagePaymentsPage.branchPaymentList.isDisplayed());
    }
    @And("Test the visibility of the + sign in the upper right corner of the list")
    public void testTheVisibilityOfTheSignInTheUpperRightCornerOfTheList() {
        Assert.assertTrue(adminBranchManagePaymentsPage.plusButton.isDisplayed());

    }
    @And("Click on the Plus button")
    public void clickOnTheSign() {
        adminBranchManagePaymentsPage.plusButton.click();
        ReusableMethods.hardWait(2);
    }

    @And("test the visibility of the Create Payment page")
    public void testTheVisibilityOfTheCreatePaymentPage() {
        String actualURL=adminBranchManagePaymentsPage.driver.getCurrentUrl();
        String expectedURL ="https://qa.agileswiftcargo.com/admin/request/hub/payment/create";
        Assert.assertEquals("The user is not on the expected create payment page", expectedURL, actualURL);

    }


    @And("Test the visibility of the Actions Icon")
    public void testTheVisibilityOfTheActionsIcon() {
        Assert.assertTrue(adminBranchManagePaymentsPage.actionsMenuButton.isDisplayed());
    }
    @And("Click on the ActionsMenu Button")
    public void clickOnTheActionsMenuButton() {
        adminBranchManagePaymentsPage.actionsMenuButton.click();
        ReusableMethods.hardWait(2);
    }

    @And("test the visibility of links in the menu")
    public void testTheVisibilityOfLinksInTheMenu() {
        for (WebElement actions:adminBranchManagePaymentsPage.actionsDropdowns) {
            String text = actions.getText();

            // 'Income' öğesinin içerdiğini kontrol et
            if (text.contains("Reject")) {
                Assert.assertTrue(adminBranchManagePaymentsPage.actionsDropdowns.get(0).isDisplayed());
            }
            // 'Expense' öğesinin içerdiğini kontrol et
            else if (text.contains("Process")) {
                Assert.assertTrue(adminBranchManagePaymentsPage.actionsDropdowns.get(1).isDisplayed());
            }
            // 'Balance' öğesinin içerdiğini kontrol et
            else if (text.contains("Edit")) {
                Assert.assertTrue(adminBranchManagePaymentsPage.actionsDropdowns.get(2).isDisplayed());
            }
        }
    }


}