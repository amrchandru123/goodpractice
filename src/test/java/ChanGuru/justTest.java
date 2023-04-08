package ChanGuru;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class justTest {
     WebDriver driver;
     @Test
	public void justTe()
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\driverCHROME\\chromedriver.exe");
		driver =new ChromeDriver(co);
		driver.get("https://hi.test.io/contact-us/");
	}
}
