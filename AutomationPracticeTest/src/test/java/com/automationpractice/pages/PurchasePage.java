package com.automationpractice.pages;
import org.testng.annotations.Test;
import com.automationpractice.base.TestBase;
import org.openqa.selenium.By;


public class PurchasePage extends TestBase{
	
	String product = "Faded Short Sleeve T-shirts";
	By searchLocator = By.id("search_query_top");
	By submitSearchLocator = By.name("submit_search");
	By selectLocator = By.className("available-now");
	By addCartBtnLocator = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]");
	By toCheckOutBtnLocator = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	By checkOut1BtnLocator = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	By checkOut2BtnLocator = By.name("processAddress");
	By checkerLocator = By.className("checker");
	By checkOut3BtnLocator = By.name("processCarrier");
	By payByCheckLocator = By.className("cheque");
	By confirmPaymentLocator = By.xpath("//*[@id=\"cart_navigation\"]/button");
	By confirmLocator = By.xpath("//*[@id=\"center_column\"]/p[1]");
	By a3Locator = By.className("page-heading");
	
  @Test
  public void shopping() throws InterruptedException {
	  
	  
	  /*LoginPage login = new LoginPage();
	  login.login();*/
	  driver.findElement(searchLocator).sendKeys(product);
	  driver.findElement(submitSearchLocator).click();
	  driver.findElement(selectLocator).click();
	  driver.findElement(selectLocator).click();
	  Thread.sleep(8000);
	  driver.findElement(addCartBtnLocator).click();
	  Thread.sleep(5000);
	  driver.findElement(toCheckOutBtnLocator).click();
	  driver.findElement(checkOut1BtnLocator).click();
	  driver.findElement(checkOut2BtnLocator).click();
	  driver.findElement(checkerLocator).click();
	  driver.findElement(checkOut3BtnLocator).click();
	  driver.findElement(payByCheckLocator).click();
	  driver.findElement(confirmPaymentLocator).click();  
	  
		if(driver.findElement(a3Locator).isDisplayed()) {
			  System.out.println("3. Successful Payment.");
			  
		  }else {
			  System.out.println("Failed Payment");
  }
  }
}
  
  
