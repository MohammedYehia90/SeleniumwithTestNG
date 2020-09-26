package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {

	WebDriver driver;
	
	public signInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Insert New Email Address
	public void insertEmailAddress(String email) {
		WebElement emailTxtField = driver.findElement(By.id("email_create"));
		emailTxtField.sendKeys(email);

	}
	
	//Click on Create Account button
	public void clickOnCreateAccount() {
		WebElement createAccountBtn = driver.findElement(By.id("SubmitCreate"));
		createAccountBtn.click();

	}
	
	public void insertExistingEmailAddress(String email) {
		WebElement emailTxtField = driver.findElement(By.id("email"));
		emailTxtField.sendKeys(email);

	}
	
	public void insertPassword(String Password) {
		WebElement passwordTxtField = driver.findElement(By.id("passwd"));
		passwordTxtField.sendKeys(Password);

	}
	
	//Click on SigIn button
	public void clickOnSigninBtn() {
		WebElement SigninBtn = driver.findElement(By.id("SubmitLogin"));
		SigninBtn.click();

	}
}
