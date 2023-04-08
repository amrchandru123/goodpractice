package goodstep;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import goodfind.goodfin;
import io.cucumber.java.en.*;

public class goodbase {
	WebDriver driver;
	goodfin k = new goodfin(driver);
	@Given("user navigates to open browser {string}")
	public void user_navigates_to_open_browser(String string) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
		driver =new ChromeDriver(co);
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String unam) {
		
		k.uname(unam);

	}

	@When("valid passwod {string}")
	public void valid_passwod(String pasword) {
	    k.pass(pasword);
	}
	@Then("user should get home page with login")
	public void user_should_get_home_page_with_login() {
	    System.out.println("user got homepage");
	}


}
