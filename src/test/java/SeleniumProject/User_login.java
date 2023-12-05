package SeleniumProject;

import java.io.IOException;

import org.testng.annotations.Test;



import Variables.configProperties;
import baseclass.basedata;


public class User_login extends basedata{
	
	
	
     @Test
	public void verifyUserIsAbletoAddIMacToCart() throws InterruptedException, IOException 
	{
    	
    	 LoginPageActions login=new LoginPageActions();

    	 login.ClkMyAccount();
    	 Thread.sleep(1000);
    	 login.ClickOnLoginbtn();
    	 Thread.sleep(1000);
    	String usrname= configProperties.readCondif("User_name"); 
    	String password= configProperties.readCondif("Pwd"); 
    	login.ClickOnLogin(usrname,password);
    	 Thread.sleep(1000);
    	 login.ClickSearchBar();
    	 Thread.sleep(1000);
    	 login.SearchwithImactext();
    	 Thread.sleep(1000);
    	 login.ClickOnSearchButton();
    	 Thread.sleep(2000);
    	 login.CheckIMACinCart();
    	
		
    	 
	}


	}
