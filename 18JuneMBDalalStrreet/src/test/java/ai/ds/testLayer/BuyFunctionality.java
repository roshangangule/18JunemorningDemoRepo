package ai.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.ExchangePage;
import ai.ds.testBase.TestBase;

public class BuyFunctionality extends TestBase {
	
	
	@Test
	public void verifyBuyFunctionality() throws InterruptedException
	{
		DashboardPage dash = new DashboardPage();
		ExchangePage exchange = new ExchangePage();
		//-----------------------------------------
		dash.enterCompanyName("Axis");
		dash.SelectCompanyName();
		Thread.sleep(3000);
		//-----------------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(3000);
		System.out.println(exchange.getStatus());
		
		Assert.assertEquals(exchange.getStatus(), "Order Created successfully");
	}

}
