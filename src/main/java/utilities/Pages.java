package utilities;

import pages.BasePage;
import pages.adminPages.AdminDashboard;
import pages.adminPages.AdminProfilPage;
import pages.adminPages.AdminMerchantManageMerchantPage;
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

    private AdminProfilPage adminProfilPage;

	private AdminDashboard adminDashboard;

	private AdminMerchantManageMerchantPage adminMerchantManageMerchantPage;

	public Pages() {

		this.homePage = new HomePage();
		this.trackingPage = new TrackingPage();
		this.merchantDashboard = new MerchantDashboard();
		this.merchantProfilePage = new MerchantProfilePage();
		this.merchantUpdateProfilPage = new MerchantUpdateProfilPage();
		this.adminProfilPage =new AdminProfilPage();
		this.adminDashboard = new AdminDashboard();
		this.adminMerchantManageMerchantPage= new AdminMerchantManageMerchantPage();
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

	public AdminProfilPage getAdminProfilPage() {

		return adminProfilPage;
	}

	public AdminDashboard getAdminDashboard() {

		return adminDashboard;
	}

	public AdminMerchantManageMerchantPage getAdminMerchantManageMerchantPage() {

		return adminMerchantManageMerchantPage;
	}
}
