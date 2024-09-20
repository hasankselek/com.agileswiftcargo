package pages.homePages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

import static org.junit.Assert.*;

public class ServiceDetailsPage extends BasePage {

	@FindBy(xpath = "(//*[@class='font-size-1-5rem display-6 font-weight-bold text-start my-4  '])[1]")
	private WebElement serviceDetailHeader;

	@FindBy(xpath = "//*[@class='text-primary']")
	private List<WebElement> navigationArrows;

	public void headerTextEqualTo(String serviceName) {
		String actualHeader = serviceDetailHeader.getText();
		String expectedHeader = serviceName;

		assertEquals(expectedHeader, actualHeader);
	}

	public void navigationArrowsVisibility() {

		for (int i = 0; i < navigationArrows.size(); i++) {
			assertTrue(navigationArrows.get(i).isDisplayed());
		}

	}

	public void clickNavigationArrow(int servisNo) {

		navigationArrows.get(servisNo - 1).click();

	}

}
