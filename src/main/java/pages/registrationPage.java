package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registrationPage {

	WebDriver driver;

	public registrationPage(WebDriver driver) {
		this.driver = driver;
	}


	//Insert New Email Address
	public void inserttitle() {
		WebElement title = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label"));
		title.click();
	}

	//Insert First Name
	public void insertFirstName(String firstname) {
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys(firstname);
	}

	//Insert Last Name
	public void insertLastName(String lastname) {
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		lname.sendKeys(lastname);
	}

	//Insert password
	public void insertPassword(String password) {
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys(password);
	}
	//Insert BirthDay
	public void selectBithDay() {
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByValue("4");
	}

	//Insert BirthMonth
	public void selectBithMonth() {
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByValue("4");
	}

	//Insert BirthYear
	public void selectBithYear() {
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1980");
	}

	//Insert Company
	public void insertCompany(String company) {
		WebElement comp = driver.findElement(By.id("company"));
		comp.sendKeys(company);
	}

	//Insert Address
	public void insertAddress(String add) {
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys(add);
	}

	//Insert City
	public void insertCity(String cityname) {
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys(cityname);
	}

	//Insert State
	public void selectState() {
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Hawaii");
	}

	//Insert Postal Code
	public void insertPostalCode(String postCode) {
		WebElement pCode = driver.findElement(By.id("postcode"));
		pCode.sendKeys(postCode);
	}

	//Insert Country
	public void selectCountry() {
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
	}

	//Insert Mobile Number
	public void insertMobNum(String mobileNum) {
		WebElement mobNum = driver.findElement(By.id("phone_mobile"));
		mobNum.sendKeys(mobileNum);
	}

	//Insert Address Alias
	public void insertAddressAlias(String addressAlias) {
		WebElement addAlias = driver.findElement(By.id("alias"));
		addAlias.sendKeys(addressAlias);
	}

	// Click on Register
	public void clickOnRegisterBtn() {
		WebElement Reg = driver.findElement(By.id("submitAccount"));
		Reg.click();
	}


	//			Thread.sleep(4000);
	//			
	//			// Click on SignOut
	//			WebElement signOut = fireFox.findElement(By.className("logout"));
	//			signOut.click();
	//			
	//			Thread.sleep(2000);
	//			
	//			// Login with recently created account
	//			
	//			// Insert Email
	//			WebElement emailAddress = fireFox.findElement(By.id("email"));
	//			emailAddress.sendKeys(Email);
	//			
	//			// Insert Password
	//			WebElement pswd = fireFox.findElement(By.id("passwd"));
	//			pswd.sendKeys("123456");
	//			
	//			//Click on SignIn
	//			WebElement logIn = fireFox.findElement(By.id("SubmitLogin"));
	//			logIn.click();
	//			
	//			Thread.sleep(4000);
	//		


}
