package com.naukriProject.objectreprository;



import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.naukriProject.resources.CommanAction;

public class NaukriPage extends CommanAction {

		
public NaukriPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "(//input[@type='text'])[2]")
private WebElement  location;

public WebElement getLocation() {
	return location;
}

public void setLocation(WebElement location) {
	this.location = location;
}
@FindBy (xpath = "//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input")
private WebElement jobsearch;
	
public WebElement getJobsearch() {
	return jobsearch;
}

public void setJobsearch(WebElement jobsearch) {
	this.jobsearch = jobsearch;
}
@FindBy (xpath ="//button[@type='submit']")
private WebElement loginButton;

 public WebElement getLoginButton() {
	return loginButton;
}



public void setLoginButton(WebElement loginButton) {
	this.loginButton = loginButton;
}
@FindBy(xpath ="//div[text()='Login']")
private WebElement login;
 
 @FindBy (xpath ="(//input[@type='text'])[5]")		
 private WebElement EmailId;

@FindBy(xpath ="//input[@type='password']")	   
private WebElement Emailpass;

public WebElement getLogin() {
	return login;
}

	

public void setLogin(WebElement login) {
	this.login = login;
}

public WebElement getEmailId() {
	return EmailId;
}

public void setEmailId(WebElement emailId) {
	EmailId = emailId;
}

public WebElement getEmailpass() {
	return Emailpass;
}

public void setEmailpass(WebElement emailpass) {
	Emailpass = emailpass;
}


}

	
