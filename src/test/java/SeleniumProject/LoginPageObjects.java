package SeleniumProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	
@FindBy(xpath = "//span[text()='My Account']")
public WebElement myAccountLoginButton;

@FindBy(linkText ="Login")
public WebElement clickOnLogin;

@FindBy(xpath = "//input[@value='Login']")
public WebElement clickLogin;

@FindBy(xpath = "//input[@class='form-control input-lg']")
public WebElement clickOnSearchBar;

@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
public WebElement clickSearchbtn;

@FindBy(xpath = "//input[@class='form-control input-lg']")
public WebElement searchImactext;

@FindBy(xpath = "//a[text()='iMac'])[2]")
public WebElement assertimac;

@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
public WebElement Addtocart;

@FindBy(xpath = "//div[@id='cart']")
public WebElement clkonCart;

@FindBy(xpath = "//strong[text()='View Cart']")
public WebElement assertviewcart;

@FindBy(xpath = "//strong[text()='Checkout']")
public WebElement assertcheckout;

@FindBy(xpath="//input[@id='input-email']")
public WebElement emailinput;

@FindBy(xpath="//input[@id='input-password']")
public WebElement pwdinput;
 
public WebElement getCheckout() {
	return assertcheckout;
}
public WebElement getViewCart() {
	return assertviewcart;
}
public WebElement getClickOnCart() {
	return clkonCart;
}

public WebElement getAssertImac() {
	return assertimac;
}
public WebElement getSearchImactext() {
	return searchImactext;
}
public WebElement getClickSearchbtn() {
	return clickSearchbtn;
}
public WebElement getClickOnSearchBar() {
	return clickOnSearchBar;
}
public WebElement getClickLogin() {
	return clickLogin;
}
public WebElement getClickOnLogin() {
	return clickOnLogin;
}

public WebElement getmyAccountLoginButton() {
	return myAccountLoginButton;
}
public WebElement getClkUname() {
	
	return emailinput;
}
public WebElement getClkPwd() {
	return pwdinput;
}
public WebElement getAddtocart() {
	
		return Addtocart;
	
}



}
