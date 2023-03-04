package ChBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ChFind.FindGu;
import io.cucumber.java.en.*;

public class JustBaseClass {
	WebDriver driver;
	FindGu gu = new FindGu(driver);
	@Given("user open the browser")
	public void user_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\driverCHROME\\chromedriver.exe");
		 driver =new ChromeDriver();
		 
		
	}

	@When("user enter the url {string}")
	public void user_enter_the_url(String string) {
	    driver.get("https://demoqa.com/text-box");
	}

	@When("valid name {string} and password {string}")
	public void valid_name_and_password(String firstnamee, String passwordd) {
	    gu.EnterName(firstnamee);
	    gu.EnterPass(passwordd);
	}

	@Then("user should get home page")
	public void user_should_get_home_page() {
		System.out.println("user got homepage");
	    
	}

	@Then("browser should close")
	public void browser_should_close() {
	    driver.quit();
	}


}
