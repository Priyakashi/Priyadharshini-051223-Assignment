package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

import Variables.configProperties;
import baseclass.basedata;

public class LoginPageActions extends basedata {
	
	//static ExtentTest test;
	//static ExtentReports report;
	configProperties prop=new configProperties();
	LoginPageObjects login_path=PageFactory.initElements(driver, LoginPageObjects.class);
	

	public void ClkMyAccount(){
		login_path.getmyAccountLoginButton().click();
	//	test.log(LogStatus.INFO,"Clicked on My Account");
	}
	public void ClickOnLoginbtn() {
		login_path.getClickOnLogin().click();
		//test.log(LogStatus.INFO,"Clicked on Login");	
	}
	
	public void ClickSearchBar() {
		login_path.getClickOnSearchBar().click();
	//	test.log(LogStatus.INFO,"Clicked on Search Bar");
	}
	public void ClickOnSearchButton() {
		login_path.getClickSearchbtn().click();	
	//	test.log(LogStatus.INFO,"Clicked on Search Button");
	}
	
	public void SearchwithImactext() {
		login_path.getSearchImactext().sendKeys("Mac");
		
	}
	public void ClickonAddtocart() {
		login_path.getClickOnCart().click();
		//test.log(LogStatus.INFO,"Clicked on Add to cart");
		
	}
	public void ClickonTotalCart() {
		login_path.getClickOnCart().click();
		//test.log(LogStatus.INFO,"Clicked on Cart");
	}
	public void Assertviewcart() {
		login_path.getViewCart().click();
	//	test.log(LogStatus.INFO,"View cart is present");
	}
	public void ClickonCheckout() {
		login_path.getCheckout().click();
	//	test.log(LogStatus.INFO,"Checkout is present");
	}
	public void ClickongetAddtoCart() {
		login_path.getAddtocart().click();
	}

	public void CheckIMACinCart() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='iMac']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("(//a[text()='MacBook'])")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='MacBook Air']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='MacBook Pro']")).isDisplayed());
		LoginPageObjects logindetails=new LoginPageObjects();
		Thread.sleep(2000);
		ClickongetAddtoCart();
		Thread.sleep(2000);
		ClickonTotalCart();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Sub-Total']")).isDisplayed());
		Assertviewcart();
		Thread.sleep(3000);
		logindetails.getCheckout();

	}
	
	public void ClickOnLogin(String user,String pass) {
		login_path.getClkUname().sendKeys(user);
		login_path.getClkPwd().sendKeys(pass);
		login_path.getClickLogin().click();	
	}
		
		
	}
	


