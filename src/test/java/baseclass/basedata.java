package baseclass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class basedata {
	
	static ExtentTest test;
	static ExtentReports report;
		public static WebDriver driver;
		
		@BeforeClass
		public static void startTest()
		{
//		report = new ExtentReports("C://Users//Qualitrix//Downloads//tdddd//QualitrixProject//Configuration//Reportpath"+"ExtentReportResults.html");
//		test = report.startTest("ExtentDemo");
		}
		
		@BeforeMethod
		public void launchBrowser()
		{
			
			//ExtentReports reports = new ExtentReports("C://Users//Qualitrix//Desktop//today nov//QualitrixProject//ReportsPath//ext.html", true);
			report = new ExtentReports("C://Users//Qualitrix//Downloads//tdddd//QualitrixProject//Configuration//Reportpath"+"ExtentReportResults.html");
			test = report.startTest("ExtentDemo");
			
			driver=new ChromeDriver();
			test.log(LogStatus.INFO,"Browser Launched succesfully");
			driver.manage().window().maximize();
			test.log(LogStatus.INFO,"Browser Maximized");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			
			driver.get("https://tutorialsninja.com/demo/");
			test.log(LogStatus.INFO,"Naviagted to URL");
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
			
		}
		
		@AfterClass
		public static void endTest()
		{
		report.endTest(test);
		report.flush();
		}
	}