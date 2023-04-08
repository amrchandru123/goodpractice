package goodluck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import goodluck2.goodluckfind;
import io.cucumber.java.en.*;

public class goodstep {
	WebDriver driver;
	goodluckfind l = new goodluckfind(driver);
	@Given("user navigates browser")
	public void user_navigates_browser() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
		driver =new ChromeDriver(co);
		driver.get("https://hi.test.io/contact-us/");
	    
	}

	/*@When("user enter the valid firstname {string}")
	public void user_enter_the_valid_firstname(String firsttname2) {
	    l.firstnam(firsttname2);
	}*/

	@When("valid lastname {string}")
	public void valid_lastname(String lasttname) {
	    l.lastnam(lasttname);
	}

	@When("valid company {string}")
	public void valid_company(String companname) {
	    l.companyy(companname);
	}

	@When("valid email {string}")
	public void valid_email(String email) {
	    l.email1(email);
	}

	@When("text {string}")
	public void text(String message) {
	    l.msg(message);
	}

	@Then("user shoul0d get requiered page")
	public void user_shoul0d_get_requiered_page() {
	    System.out.println("home page is displayed");
	}

}
