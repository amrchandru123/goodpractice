package ChFind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindGu {
	WebDriver driver;
	public FindGu(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d,this);
	}
	@FindBy(id="userName")
	WebElement firstname;
	@FindBy(id="userEmail")
	WebElement firstemail;
	
	public void EnterName(String name)
	{
		firstname.sendKeys(name);
	}
	public void EnterPass(String pass)
	{
		firstemail.sendKeys(pass);
	}

}
