package Com.MyStore.Utilities;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


	
/*	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public void Onstart(ITestContext testContext) {
		
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		String repName="Test-Report-" +Timestamp+".html";
		//htmlReporter = new ExtentHtmlReporter (System.getProperty("user.dir")+"/Reports/"+repName);//specify location
		htmlReporter = new ExtentHtmlReporter (System.getProperty("user.dir")+"/Reports/"+repName);//specify location
		//htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/Extent-config.xml");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/Extent-config.xml");
		
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","localhost");                        
		extent.setSystemInfo("Envirnment","QA");
		extent.setSystemInfo("user", "neha");
		
		htmlReporter.config().setDocumentTitle("Banking domain");
		htmlReporter.config().setReportName("Functional Test Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
	}
	public void onTestSuccess(ITestResult tr) {
		
		logger=extent.createTest(tr.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		
		
	}
public void onTestFailure(ITestResult tr) {
	logger=extent.createTest(tr.getName());
	logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	
	String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
	File f= new File(screenshotPath);
	
	if(f.exists()) {
		try {
			logger.fail("screenshot is below:"+logger.addScreenCaptureFromPath(screenshotPath));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public void onTestSkipped(ITestResult tr) {
	logger = extent.createTest(tr.getName());
	logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	
}
public void onFinish (ITestContext testContext) {
	extent.flush();
}*/

public class Reporting extends TestListenerAdapter{
	public ExtentHtmlReporter htmlReporter1;
	public ExtentReports extent1;
	public ExtentTest logger1;
	
	public void onStart1(ITestContext testcontext) {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); //time stamp
		String repName = "Test-Report-"+timeStamp+".html";
		 htmlReporter1 = new ExtentHtmlReporter (System.getProperty("user.dir")+"//Reports//"+repName);//specify location
		//htmlReporter1 = new ExtentHtmlReporter ("C:\\Users\\admin\\eclipse-workspace\\MyStore_Framwork\\Reports"+repName);
		 htmlReporter1.loadXMLConfig(System.getProperty("user.dir")+"/Extent-config.xml");
		 
		 extent1 = new ExtentReports();
		 
		 extent1.attachReporter(htmlReporter1);
		 extent1.setSystemInfo("Host name", "localhost");
		 extent1.setSystemInfo("Environment", "QA");
		 extent1.setSystemInfo("user","Neha");
		 
		 htmlReporter1.config().setDocumentTitle("Report ");
		 htmlReporter1.config().setReportName("Report1");
		 htmlReporter1.config().setTestViewChartLocation(ChartLocation.TOP);
		 htmlReporter1.config().setTheme(Theme.DARK);
	}
	public void onTestSuccess1(ITestResult tr) {
		logger1=extent1.createTest(tr.getName());
		logger1.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		
		 
	}
	public void onTestFailure1(ITestResult tr) {
		logger1 = extent1.createTest(tr.getName());
		logger1.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
		String ScreenshotPath=System.getProperty("user.dir")+"\\Screenshot1\\"+tr.getName()+".jpg";
		
		File f= new File(ScreenshotPath);
		
		if(f.exists()) {
			try {
				logger1.fail("screenshot is below:"+logger1.addScreenCaptureFromPath(ScreenshotPath));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void onTestSkipped1(ITestResult tr) {
		logger1 = extent1.createTest(tr.getName());
		logger1.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		
	}
	public void onFinish1 (ITestContext testcontex) {
		extent1.flush();
	}
	
}

