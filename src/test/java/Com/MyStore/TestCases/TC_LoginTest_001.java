package Com.MyStore.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.MyStore.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	
	public void logintest() {
		LoginPage LP=new LoginPage(driver);
		//driver.get(baseURL);
		logger.info("URL is opened");
		
		LP.setUserName(username);
		logger.info("username enter");
		
		LP.setPassword(password);
		logger.info("pasword enter");
		LP.Click();
		
		String title = driver.getTitle();
		 
		 if(title.equals("GTPL Bank Manager HomePage")) {
			 Assert.assertTrue(false);
			 logger.info("test case passed");
		 }else {
			 Assert.assertTrue(false);
			 logger.info("test case failed");
		 }
        /* String title = driver.getTitle();
		
		if(title.equals("Welcome To Manager's Page of Guru99 Bank")) {
			Assert.assertTrue(false);
			logger.info("log in test case pass");
		}
		else {
			Assert.assertTrue(false);
			logger.info("log in test case fail");
		}*/
		
		
	}
	
	

}
