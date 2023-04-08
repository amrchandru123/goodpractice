package goodluck2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class goodluckfind {
	WebDriver driver;
	public goodluckfind(WebDriver d)
	{
		driver = d; 
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="first_name")
	WebElement firstname;
	@FindBy(id="last_name")
	WebElement lastname;
	@FindBy(id="company")
	WebElement company;
	@FindBy(id="email")
	WebElement email1;
    @FindBy(id="Message")
    WebElement message;
    
    @FindBy(xpath="//*[@id=\"lp-pom-button-10\"]/span")
    WebElement button;
    
    public void firstnam(String name)
    {
    	firstname.sendKeys(name);
    }
    public void lastnam(String lname)
    {
    	lastname.sendKeys(lname);
    }
    public void companyy(String compan)
    {
    	company.sendKeys(compan);
    }
    public void email1(String emai)
    {
    	email1.sendKeys(emai);
    }
    public void msg(String mssg)
    {
    	message.sendKeys(mssg);
    }
    public void button()
    {
    	button.click();
    }
}
