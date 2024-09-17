package utilities;

import pages.BasePage;
import pages.homePages.HomePage;
import pages.homePages.TrackingPage;
import pages.merchantPages.MerchantDashboard;
import pages.merchantPages.MerchantProfilePage;
import pages.merchantPages.MerchantUpdateProfilPage;

public class Pages extends BasePage {

	private HomePage homePage;

	private TrackingPage trackingPage;

	private MerchantDashboard merchantDashboard;

	private MerchantProfilePage merchantProfilePage;

	private MerchantUpdateProfilPage merchantUpdateProfilPage;

	public Pages() {

		this.homePage = new HomePage();
		this.trackingPage = new TrackingPage();
		this.merchantDashboard = new MerchantDashboard();
		this.merchantProfilePage = new MerchantProfilePage();
		this.merchantUpdateProfilPage = new MerchantUpdateProfilPage();
	}

	public HomePage getHomePage() {

		return homePage;
	}

	public TrackingPage getTrackingPage() {

		return trackingPage;
	}

	public MerchantDashboard getMerchantDashboard() {

		return merchantDashboard;
	}

	public MerchantProfilePage getMerchantProfilePage() {

		return merchantProfilePage;
	}

	public MerchantUpdateProfilPage getMerchantUpdateProfilPage() {

		return merchantUpdateProfilPage;
	}

}
