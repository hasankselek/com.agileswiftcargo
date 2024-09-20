package stepDefinitions.merchanPageStepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.merchantPages.MerchantForgotPasswordPage;
import stepDefinitions.BaseStep;

import static org.junit.Assert.*;

public class MerchantForgotPasswordStepDef extends BaseStep {



	@Then("Verifies  Email Address textbox and Send Password Reset Link visibilty")
	public void verifiesEmailAddressTextboxAndSendPasswordResetLinkVisibilty() {

		assertTrue(merchantForgotPasswordPage.emailTextBox.isDisplayed());
		assertTrue(merchantForgotPasswordPage.sendPassResetButton.isDisplayed());

	}

	@Then("Enters {string} in Email Address textbox")
	public void entersInEmailAddressTextbox(String congigdenMail) {

		merchantForgotPasswordPage.emailTextBox
			.sendKeys(merchantForgotPasswordPage.configLoader.getConfigValue(congigdenMail));

	}

	@Then("Verifies email has been sent to the entered email address")
	public void verifiesEmailHasBeenSentToTheEnteredEmailAddress() {

		assertTrue(merchantForgotPasswordPage.succesAlert.isDisplayed());

	}

}
