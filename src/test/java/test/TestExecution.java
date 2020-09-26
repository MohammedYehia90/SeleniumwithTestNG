package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.homePage;
import pages.myAccountPage;
import pages.registrationPage;
import pages.signInPage;

public class TestExecution {
	
	WebDriver fireFox;
	Faker fakeUserData = new Faker();
	
	String email = fakeUserData.internet().emailAddress();
	String password = fakeUserData.number().digits(6);

	@BeforeClass
	public void setupEnviroment() {
		
		WebDriverManager.firefoxdriver().setup();	
		fireFox = new FirefoxDriver();
		
		fireFox.navigate().to("http://automationpractice.com/index.php");
		fireFox.manage().window().maximize();
	}
	
	//Click on SignIn 
	@Test(priority =1)
	public void clickOnSiginBtn() {
		homePage home = new homePage(fireFox);
		home.clickOnSignInBtn();
	}
	
	// Click on Create Account Button
	@Test(priority =2)
	public void createNewAccountBtn() {
		signInPage newAcc = new signInPage(fireFox);
		newAcc.insertEmailAddress(email);
		newAcc.clickOnCreateAccount();
	}
	
	@Test(priority = 4)
	//Insert User Data for Registration
	public void fillNewUserData() {
		//Insert User Data for Registration
		fireFox.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		registrationPage regPage = new registrationPage(fireFox);
		regPage.inserttitle();
		regPage.insertFirstName(fakeUserData.name().firstName());
		regPage.insertLastName(fakeUserData.name().lastName());
		regPage.insertPassword(password);
		regPage.selectBithDay();
		regPage.selectBithMonth();
		regPage.selectBithYear();
		regPage.insertAddress(fakeUserData.address().fullAddress());
		regPage.insertCompany(fakeUserData.company().toString());
		regPage.insertCity(fakeUserData.address().cityName());
		regPage.selectState();
		regPage.insertPostalCode(fakeUserData.address().zipCode().substring(0, 5));
		regPage.selectCountry();
		regPage.insertMobNum(fakeUserData.phoneNumber().cellPhone());
		regPage.insertAddressAlias(fakeUserData.address().streetAddress());
		regPage.clickOnRegisterBtn();
	}
	
	// After Successful registration, click on SignOut 
	@Test(priority = 5)
	public void clickOnSignOutBtn() {
		myAccountPage myAccPage = new myAccountPage(fireFox);
		myAccPage.clickOnSignOut();
	}

	
	// Login with recently created account
	@Test(priority = 6, dependsOnMethods = { "fillNewUserData" })
	public void userLogin() {
		signInPage Acc = new signInPage(fireFox);
		Acc.insertExistingEmailAddress(email);
		Acc.insertPassword(password);
		Acc.clickOnSigninBtn();
	}

	
	@AfterClass
	public void tearDown() {
		
		fireFox.quit();
	}

}




