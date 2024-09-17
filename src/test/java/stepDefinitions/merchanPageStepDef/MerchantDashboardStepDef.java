package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import stepDefinitions.BaseStep;

public class MerchantDashboardStepDef extends BaseStep {

	@Then("Click profile icon")
	public void click_profile_icon() {
		PAGES.getMerchantDashboard().getClickProfileIcon();

	}

	@Then("Verifies {string} {string} {string} {string} links are displayed")
	public void verifies_links_are_displayed(String Profile, String PaymentInformation, String ChangePassword,
			String Logout) {

		PAGES.getMerchantDashboard().getVerifyProfileIconLinks(Profile, PaymentInformation, ChangePassword, Logout);
	}

}
