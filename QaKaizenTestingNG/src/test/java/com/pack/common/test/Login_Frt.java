package com.pack.common.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_Frt {
	
  WebDriver driver;
  By userLocator = By.id("username");
  By passwordLocator = By.id("password");
  By accederBtnLocator = By.id("loginbtn");

  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://frt.cvg.utn.edu.ar/login/index.php");
  }
  
  @Test
  public void login_Frt() throws InterruptedException {
	  
	  WebElement user = driver.findElement(userLocator);
	  user.clear();
	  user.sendKeys("36712718");
	
	  WebElement password = driver.findElement(passwordLocator);
	  password.clear();
	  password.sendKeys("EEse.2022");
	  
	  WebElement acceder = driver.findElement(accederBtnLocator);
	  acceder.click();
	  Thread.sleep(2000);
	  
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Test Login_FRT PASSED");
	  driver.quit();
  }
  
  


}



