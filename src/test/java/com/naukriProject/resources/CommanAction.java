package com.naukriProject.resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommanAction {
public static WebDriver driver;
public static WebElement login;
public static Robot keys;
	public void Lunch() {
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("start-maximized");
		driver =new ChromeDriver(options);
		
		
		driver.get("https://www.naukri.com");	
	}
	public void sendkeys(WebElement ele, String value) {
		ele.sendKeys(value);
	
	}
	public void Quit() {
		driver.quit();
	}
	public void Click(String xpath) {
	 login=driver.findElement(By.xpath(xpath));
        login.click();
	}
	public void pageLogin(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void waits(WebElement waits) {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(waits));

	}
public void keyPress(Robot key) throws AWTException {
		 keys= new Robot();
                   
	}

	
}
	
	

