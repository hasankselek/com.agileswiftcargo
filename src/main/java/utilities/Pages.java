package utilities;

import pages.BasePage;
import pages.homePages.HomePage;
import pages.homePages.TrackingPage;

public class Pages extends BasePage {

	private HomePage homePage;
	private TrackingPage trackingPage;

	public Pages() {

		this.homePage = new HomePage();
		this.trackingPage = new TrackingPage();
	}

	public HomePage getHomePage() {

		return homePage;
	}

	public TrackingPage getTrackingPage() {

		return trackingPage;
	}

}
