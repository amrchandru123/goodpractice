package onceFind;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oncefindele {
      WebDriver driver;
	public  oncefindele(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	@FindBy(id="first_name")
	WebElement firstname;
	
	public void entername(String namee)
	{
		firstname.sendKeys(namee);
	}
}
