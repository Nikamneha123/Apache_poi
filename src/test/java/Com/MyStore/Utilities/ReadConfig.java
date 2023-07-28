package Com.MyStore.Utilities;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ReadConfig {
	
	Properties pro;
	
	
	public ReadConfig() {
		File src=new File("./Configuration\\Config.properties");
		
		try {
			
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			
			pro.load(fis);
			
		}
		catch(Exception e) {
			System.out.println("Exception is"+ e.getMessage());
			
		}
		
	}
	
	public String getApplicationUrl() {
		
		String url=pro.getProperty("baseURL");
		
		return url;
				
	}
public String getUsername() {
		
		String user=pro.getProperty("username");
		
		return user;
				
	}
public String getpassword() {
	
	String pass=pro.getProperty("password");
	
	return pass;
			
}

public String getChrome() {
	
	String drive=pro.getProperty("chromepath");
	
	return drive;
			
}
	
public String getFirefox() {
	
	String firedrive=pro.getProperty("firefox");
	
	return firedrive;
	
}
}
