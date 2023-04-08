package checkbofindelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkbofind {
	
	 WebDriver driver;
	public checkbofind(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="//*[@class=\"rct-title\"]")
	WebElement checkbo;
	
	public void checkbox()
	{
		checkbo.click();
	}
}
