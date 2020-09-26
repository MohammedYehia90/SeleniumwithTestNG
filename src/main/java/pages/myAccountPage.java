package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myAccountPage {

	WebDriver driver;

	public myAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSignOut() {
		WebElement signoutBtn = driver.findElement(By.cssSelector("a.logout"));
		signoutBtn.click();
	}
}
