package com.automationpractice.pages;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automationpractice.base.TestBase;


public class LoginPage extends TestBase{
	
	By signInLocator = By.className("login");
	static By emailLoginLocator = By.id("email");
	static By passLoginLocator = By.id("passwd");
	static By signInBtnLocator = By.id("SubmitLogin");
	static By a2Locator = By.className("info-account");
	
	
  @Test
  public void login() {
	
	driver.findElement(signInLocator).click();  
	driver.findElement(emailLoginLocator).sendKeys("kaizen@automation10.com");
	driver.findElement(passLoginLocator).sendKeys("Kaizen1");
	driver.findElement(signInBtnLocator).click();
	
	if(driver.findElement(a2Locator).isDisplayed()) {
		  System.out.println("2. Successful Login.");
		  
	  }else {
		  System.out.println("Failed Login");
  }
  }
}
