package ChanGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class justfind {
    WebDriver driver;
	public justfind(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d,this);
	}
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	public void chnjust()
	{
		firstname.sendKeys("chandru");
	}
	
}
