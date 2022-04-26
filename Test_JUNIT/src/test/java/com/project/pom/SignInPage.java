package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{
	
	By userLocator = By.name("userName");
	By passLocator = By.name("password");
	By signInBtnLocator = By.name("submit");
	
	By homePageLocator = By.xpath("//img[@src='images/banner2.gif']");
	
	

	public SignInPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void signIn (){
		if (isDisplayed(userLocator)) {
			type("qualityadmin", userLocator);
			type("pass1", passLocator);
			type("pass1", signInBtnLocator);
		} 
	}
	
	public boolean inHomePageDisplayed() {
		return isDisplayed(homePageLocator);
	}

	public boolean isHomePageDisplayed() {
		return false;
	}

}
	


	
