package com.automationpractice.base;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class TestBase {
	public static WebDriver driver;
  
  @BeforeClass
  public void beforeClass(){
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
  }
 

  @AfterClass
  public void afterClass() throws InterruptedException {
  }

}
