package stepcheckbo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import checkbofindelement.checkbofind;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepscheck {
WebDriver driver;
	
	@Given("user navigate the browser")
	public void user_navigate_the_browser() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
		driver =new ChromeDriver(co); 
		driver.get("https://demoqa.com/checkbox");
	}
  
	@When("user click on the yes checkbox")
	public void user_click_on_the_yes_checkbox() {
		checkbofind cc = new checkbofind(driver);
		cc.checkbox();
	}

	@Then("resuslt should be yes")
	public void resuslt_should_be_yes() {
	    System.out.println("result is yes");
	}
}
