package onceBase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import onceFind.oncefindele;

public class sign {
	WebDriver driver;
	oncefindele onc = new oncefindele(driver);

	@Given("user navigates to the browser {string}")
	public void user_navigates_to_the_browser(String string) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
		driver =new ChromeDriver(co);
		driver.get("https://hi.test.io/contact-us/"); 
	}

	@When("user enter the valid name {string}")
	public void user_enter_the_valid_name(String name) {
		onc.entername(name);
	}

	@Then("namefield should take")
	public void namefield_should_take() {
	    System.out.println("namefied is taken");
	}
	

}
