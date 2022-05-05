package com.automationpractice.test;
import org.testng.annotations.Test;
import com.automationpractice.base.TestBase;
import com.automationpractice.pages.CreateAnAccount;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.pages.PurchasePage;

import org.testng.annotations.AfterClass;

public class ApTest extends TestBase {

	@Test
	public void firstTest() throws InterruptedException {
		CreateAnAccount createanaccount = new CreateAnAccount();
		LoginPage login = new LoginPage();
		PurchasePage purchase = new PurchasePage();
		createanaccount.inicio();
		login.login();
		purchase.shopping();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		driver.get("http://www.bigviagem.com/wp-content/uploads/2013/11/the-end-livro-mexico-leferr-1200x675.jpg");
		Thread.sleep(2000);
		driver.quit();
	}

}
