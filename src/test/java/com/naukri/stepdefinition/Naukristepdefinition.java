package com.naukri.stepdefinition;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukriProject.objectreprository.NaukriPage;
import com.naukriProject.resources.CommanAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Naukristepdefinition extends CommanAction {
	static String emailid="pratheep.17@live.com";
	static String Password="kingmaker7094";
	static String job="Automobile";
	CommanAction com=new CommanAction();
	NaukriPage pag=new NaukriPage();
		
			@Given("User launch the Browser")
			public void user_launch_the_Browser() {
			   System.out.println("browser Launch");
			}
			@Given("user login in to Naukri")
			public void user_login_in_to_Naukri() throws Exception {
				Thread.sleep(3000);
			     pag.getLogin().click();	
			}	
			
			@Given("user enter the emailid")
			public void user_enter_the_emailid() throws Exception {
				Thread.sleep(3000);
				com.sendkeys(pag.getEmailId(), emailid);    		
			}
			@Given("user enter the Password")
			public void user_enter_the_Password()    {
				
			     com.sendkeys(pag.getEmailpass(), Password);		
			}
			@Given("the user login into")
			public void the_user_login_into() {
			    pag.getLoginButton().click();
			}
			@When("user Search the job")
			public void user_Search_the_job() throws AWTException, InterruptedException {
				Thread.sleep(5000);	
			  com.sendkeys(pag.getJobsearch(),job );
			  com.keyPress(keys);
			  keys.keyPress(KeyEvent.VK_TAB);
			  keys.keyRelease(KeyEvent.VK_TAB);
			  
			}

			@When("user selecting the job")
			public void user_selecting_the_job() throws Throwable {
			   com.sendkeys(pag.getLocation(), "CHENNAI");
			   com.keyPress(keys);
			   keys.keyPress(KeyEvent.VK_ENTER);
				  keys.keyRelease(KeyEvent.VK_ENTER);
			}

			@Then("user get the details")
			public void user_get_the_details() {
			    
			}

}
	


