package stepDefinitions.adminPageStepDef;

import io.cucumber.java.en.Then;
import pages.adminPages.AdminOffersPage;
import utilities.ReusableMethods;

public class AdminOffersStepDef {
    AdminOffersPage adminOffersPage = new AdminOffersPage();

    @Then("Click on the plus + icon located in the top right corner of the page.")
    public void click_on_the_plus_icon_located_in_the_top_right_corner_of_the_page() {
        adminOffersPage.addOfferButton.click();
    }

    @Then("Click the Actions menu next to the offer you want to edit.")
    public void click_the_actions_menu_next_to_the_offer_you_want_to_edit() {
        adminOffersPage.offerActionButton.click();
    }

    @Then("Select {string} option.")
    public void select_option(String string) {
        adminOffersPage.offerActionEditButton.click();

    }
}
