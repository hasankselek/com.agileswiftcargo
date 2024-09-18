package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.merchantPages.MerchantDashboard;
import stepDefinitions.BaseStep;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class MerchantDashboardStepDef extends BaseStep {
		MerchantDashboard merchantDashboard = new MerchantDashboard();
	@Then("Click profile icon")
	public void click_profile_icon() {
		PAGES.getMerchantDashboard().getClickProfileIcon();

	}

	@Then("Verifies {string} {string} {string} {string} links are displayed")
	public void verifies_links_are_displayed(String Profile, String PaymentInformation, String ChangePassword,
			String Logout) {

		PAGES.getMerchantDashboard().getVerifyProfileIconLinks(Profile, PaymentInformation, ChangePassword, Logout);
	}

	@Then("Click on Ticket from the sidebar menu")
	public void click_on_from_the_sidebar_menu() {
		merchantDashboard.navBarTicketText.click();

	}
	@Then("On the page that opens, the text Ticket is verified")
	public void on_the_page_that_opens_the_text_is_verified() {
		Assert.assertTrue(merchantDashboard.ticketText.isDisplayed());

	}
	@Then("Verifies registered tickets from the User Info section")
	public void verifies_registered_tickets_from_the_user_Info_section() {
		Assert.assertTrue(merchantDashboard.userInfoName.isDisplayed());
	}

	@Then("Click on the + button at the top right")
	public void click_on_the_button_at_the_top_right() {
		merchantDashboard.ticketAddButton.click();
	}
	@Then("The page is validated with the text Ticket Add")
	public void the_page_is_validated_with_the_text_ticket_add() {
		merchantDashboard.ticketAddText.isDisplayed();
	}
	@Then("Blank fields in the form are filled in")
	public void blank_fields_in_the_form_are_filled_in() {
		ReusableMethods.ticketAdd("Kargo gonderimi","Kargom teslim edilemedi");

	}
	@Then("Click on the Save button")
	public void click_on_the_button() {
		merchantDashboard.saveButton.click();

	}
	@Then("The text Success confirms successful registration")
	public void the_text_confirms_successful_registration() {
		ReusableMethods.paymentNotificationCatcher();
		ReusableMethods.hardWait(3);
	}

	@Then("Click on the dropdown button in the Action section")
	public void click_on_the_dropdown_button_in_the_action_section() {
		ReusableMethods.hardWait(2);
		JSUtilities.clickWithJS(Driver.getDriver(),merchantDashboard.actionDropdownButton);
	}
	@Then("Click on Edit")
	public void click_on_edit() {
		ReusableMethods.hardWait(1);
		merchantDashboard.editButton.click();
	}
	@Then("The necessary information is organized")
	public void the_necessary_information_is_organized() {
		merchantDashboard.descriptionBox.clear();
		ReusableMethods.hardWait(1);
		merchantDashboard.descriptionBox.sendKeys("Parcel not delivered");
		ReusableMethods.hardWait(3);
	}

	@Then("Click on the Save Change button")
	public void click_on_the_save_change_button() {
		merchantDashboard.saveChangeButton.click();
	}

	@Then("Click on View")
	public void click_on_view() {
		merchantDashboard.ticketDropdownViewButton.click();
	}

	@Then("The opened page is verified with the title text")
	public void the_opened_page_is_verified_with_the_title_text() {
		Assert.assertTrue(merchantDashboard.viewPageParcelText.isDisplayed());
	}

	@Then("Click on Delete")
	public void click_on_delete() {
		merchantDashboard.ticketDropdownDeleteButton.click();
	}
	@Then("Click the Yes button from the alert that opens")
	public void click_the_yes_button_from_the_alert_that_opens() {
		merchantDashboard.deleteYesButton.click();
	}


}
