package com.automationpractice.pages;
import org.testng.annotations.Test;
import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;


public class CreateAnAccount extends TestBase {
	
	By signInLocator = By.className("login");
	By emailCreateLocator = By.id("email_create");
	By submitBtnLocator = By.id("SubmitCreate");
	By selectGenderLocator = By.xpath("//*[@id=\"uniform-id_gender1\"]");
	By nameLocator = By.id("customer_firstname");
	By lastNameLocator = By.id("customer_lastname");
	By emailLocator = By.id("email");
	By passLocator = By.id("passwd");
	By dayLocator = By.id("days");
	By monthsLocator = By.id("months");
	By yearsLocator = By.id("years");
	By addresLocator = By.id("address1");
	By cityLocator = By.id("city");
	By stateLocator = By.id("id_state");
	By zipLocator = By.id("postcode");
	By countryLocator = By.id("id_country");
	By otherLocator = By.id("other");
	By mobileLocator = By.id("phone_mobile");
	By submitAccountLocator = By.id("submitAccount");
	By signOutLocator = By.className("logout");
	By a1Locator = By.id("login_form");
	
	
	
  @Test
  public void inicio()throws InterruptedException {
	  
	  driver.findElement(signInLocator).click();
	  driver.findElement(emailCreateLocator).click();
	  driver.findElement(emailCreateLocator).sendKeys("kaizen@automation26.com");
	  driver.findElement(submitBtnLocator).click();
	  Thread.sleep(5000);
	  driver.findElement(selectGenderLocator).click();
	  driver.findElement(nameLocator).sendKeys("Arthur");
	  driver.findElement(lastNameLocator).sendKeys("Witt"); 
	  driver.findElement(emailLocator).clear();
	  driver.findElement(emailLocator).sendKeys("kaizen@automation26.com");
	  driver.findElement(passLocator).sendKeys("Kaizen1");
	  driver.findElement(dayLocator).sendKeys("31");
	  driver.findElement(monthsLocator).sendKeys("December");
	  driver.findElement(yearsLocator).sendKeys("1991");
	  driver.findElement(addresLocator).sendKeys("Piedras Vivas");
	  driver.findElement(cityLocator).sendKeys("Washington");
	  driver.findElement(stateLocator).sendKeys("Washington");
	  driver.findElement(zipLocator).sendKeys("55555");
	  driver.findElement(countryLocator).sendKeys("United States");
	  driver.findElement(otherLocator).sendKeys("This is my automatic test");
	  driver.findElement(mobileLocator).sendKeys("0115551991");
	  driver.findElement(submitAccountLocator).click();
	  driver.findElement(signOutLocator).click();
	  
	  if(driver.findElement(a1Locator).isDisplayed()) {
		  System.out.println("1. Successful account creation.");
		  
	  }else {
		  System.out.println("Account creation failed");
	  }
  }
}
