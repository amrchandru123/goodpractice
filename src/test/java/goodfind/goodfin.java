package goodfind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class goodfin {
	WebDriver driver;
	
	public goodfin(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d,this);
	}
	
	@FindBy(name="username")
	WebElement username1;
	@FindBy(name="password")
	WebElement passwod1;
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement submit;
	
	public void uname(String namee)
	{
		username1.sendKeys(namee);
	}
	public void pass(String passwoerdd)
	{
		passwod1.sendKeys(passwoerdd);
	}
	public void signin()
	{
		submit.click();
	}

}
