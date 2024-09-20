package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.adminPages.AdminSalaryGeneratePage;
import stepDefinitions.BaseStep;

public class AdminSalaryStep extends BaseStep {
    AdminSalaryGeneratePage adminSalaryGeneratePage=new AdminSalaryGeneratePage();


    @And("Verify Salary Generate button directed to Salary Generate")
    public void verify_salary_generate_button_directed_to_salary_Generate(){
        Assert.assertTrue(adminSalaryGeneratePage.salaryTitle.isDisplayed());
        Assert.assertTrue(adminSalaryGeneratePage.salaryTitle.isEnabled());
    }
    @When("Verify visibility and activity of Salary Generate List")
    public void verify_visibility_and_activity_of_salary_generate_list(){
        Assert.assertTrue(adminSalaryGeneratePage.salaryList.isDisplayed());

    }

}
