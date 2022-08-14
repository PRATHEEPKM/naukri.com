package com.naukriProject.objectreprository;

import org.openqa.selenium.Keys;

import com.naukriProject.resources.CommanAction;

public class TestClass extends CommanAction {
public static void main(String[] args) {
CommanAction com=new CommanAction();
NaukriPage pag=new NaukriPage();
  
com.Lunch();
pag.getLogin().click();
com.sendkeys(pag.getLogin(),"pratheep.17@live.com" );




}
	
	}


