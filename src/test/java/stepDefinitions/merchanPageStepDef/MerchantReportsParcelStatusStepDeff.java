package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import stepDefinitions.BaseStep;
import utilities.ReusableMethods;

public class MerchantReportsParcelStatusStepDeff extends BaseStep {


    @Then("Clicks Reports menu on left side")
    public void clicks_reports_menu_on_left_side() {
        ReusableMethods.hardWait(1);
        merchantReportsParcelStatusPage.reportsMenuMerch.click();
    }

    @Then("Verify parcel status reports menu is displayed")
    public void verifyParcelStatusReportsMenuIsClickable() {
        ReusableMethods.hardWait(1);
        Assert.assertTrue(merchantReportsParcelStatusPage.parcelStatusReportsMenuMerch.isDisplayed());
    }

    @Then("Clicks parcel status reports menu")
    public void clicksParcelStatusReportsMenu() {
        ReusableMethods.hardWait(1);
        merchantReportsParcelStatusPage.parcelStatusReportsMenuMerch.click();
    }


    @Then("Verify page contains filter button")
    public void verifyPageContainsFilterButton() {
        ReusableMethods.hardWait(1);
        Assert.assertTrue(merchantReportsParcelStatusPage.parcelStatusReportsFilterButton.isEnabled());
    }

    @Then("Clicks date filter box")
    public void clicksDateFilterBox() {
        ReusableMethods.hardWait(1);
        merchantReportsParcelStatusPage.parcelStatusReportsDateBox.click();
    }


    @Then("Clicks Last thirty days option")
    public void clicksLastThirtyDaysOption() {
        ReusableMethods.hardWait(1);
        merchantReportsParcelStatusPage.parcelStatusReportsDateFilter30Days.click();
    }

    @Then("Clicks filter button")
    public void clicksFilterButton() {
        ReusableMethods.hardWait(1);
        merchantReportsParcelStatusPage.parcelStatusReportsFilterButton.click();
    }

    @Then("Verify export export and print options are enabled")
    public void verifyExportExportAndPrintOptionsAreEnabled() {
        ReusableMethods.hardWait(1);
        Assert.assertTrue(merchantReportsParcelStatusPage.parcelStatusReportsExportButton.isDisplayed());
        Assert.assertTrue(merchantReportsParcelStatusPage.parcelStatusReportsPrintButton.isEnabled());
    }
}
