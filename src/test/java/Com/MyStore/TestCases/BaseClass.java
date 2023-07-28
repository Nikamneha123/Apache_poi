package Com.MyStore.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Com.MyStore.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig RC=new ReadConfig();
	
	public String baseURL= RC.getApplicationUrl();  //"https://demo.guru99.com/v4/";
	
	public String username= RC.getUsername()  ;    //"mngr517107";
	
	public String password= RC.getpassword();      //"mngr517107";
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	
	@BeforeClass
	
	public void setup(String br) {
		
	
		 logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("C:\\Users\\admin\\eclipse-workspace\\MyStore_Framwork\\Configuration\\log4j.properties");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",RC.getChrome());
			
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			
            System.setProperty("Webdriver.gecko.driver",RC.getFirefox());
			
			driver=new FirefoxDriver();
			
		}
		driver.get(baseURL);
	}
	@AfterClass
	
	public void Teardown() {
		
		driver.quit();
	}

}
