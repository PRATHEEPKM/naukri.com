package com.naukri.stepdefinition;

import com.naukriProject.objectreprository.NaukriPage;
import com.naukriProject.resources.CommanAction;


public class dummyClass extends CommanAction{
	
public static void main(String[] args) {
	CommanAction com=new CommanAction();
	NaukriPage pag=new NaukriPage();
	
	com.Lunch();
	pag.getLogin().click();
	com.waits(login);
	
	com.sendkeys(pag.getEmailId(),"pratheep.17@live.com");
	
	
	
	
	
}

		
	}


