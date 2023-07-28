package Com.MyStore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		
		//ldriver=rdriver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		
		txtusername.sendKeys(uname);
	}
	
    public void setPassword(String PWD) {
		
    	txtpassword.sendKeys(PWD);
	}
 public void Click() {
		
	 btnLogin.click();
	}
	
    
	
	
}
