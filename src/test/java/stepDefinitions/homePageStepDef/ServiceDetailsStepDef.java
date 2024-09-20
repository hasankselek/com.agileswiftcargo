package stepDefinitions.homePageStepDef;

import io.cucumber.java.en.*;
import stepDefinitions.BaseStep;
import utilities.ReusableMethods;

import static org.junit.Assert.*;

public class ServiceDetailsStepDef extends BaseStep {


    @Then("Verifies service details page opens")
    public void verifiesServiceDetailsPageOpens() {

        assertTrue(serviceDetailsPage.driver.getCurrentUrl().contains("service"));

    }

    @And("Verifies arrows redirect to {string} page")
    public void verifiesArrowsRedirectToPage(String servicePage) {

        ReusableMethods.hardWait(2);
        serviceDetailsPage.headerTextEqualTo(servicePage);

    }

    @And("Verifies an arrow visible under the last services and is clickable")
    public void verifiesAnArrowVisibleUnderTheLastServicesAndIsClickable() {

        serviceDetailsPage.navigationArrowsVisibility();

    }

    @Then("Clicks arrow under the last service {string}")
    public void clicksArrowUnderTheLastService(String serviceHeader) {

        if (serviceHeader.equals("E-Commerce delivery")) {

            serviceDetailsPage.clickNavigationArrow(4);

        } else if (serviceHeader.equals("Pick & Drop")) {

            serviceDetailsPage.clickNavigationArrow(3);

        } else if (serviceHeader.equals("Packageing")) {

            serviceDetailsPage.clickNavigationArrow(2);

        } else if (serviceHeader.equals("Warehousing")) {

            serviceDetailsPage.clickNavigationArrow(1);

        } else {
            System.out.println("Sorry,there is no such a service");
        }

    }

}
