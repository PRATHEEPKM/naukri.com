package com.naukri.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.naukriProject.resources.CommanAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends CommanAction {
	CommanAction com=new CommanAction();
@Before
	public void browserLanch() {
	com.Lunch();	
		
	}
@After
	public void browserQuit() {
		//com.Quit();
	}
}
