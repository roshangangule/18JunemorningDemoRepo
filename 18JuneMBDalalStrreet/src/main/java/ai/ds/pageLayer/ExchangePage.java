package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------- Obj repo ---------------------
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_txtbox;
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[contains(text(),'Order Created successfully')]")
	private WebElement status_msg;
	
	//-------- action methods-----------------
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	public void enterQuantity(String quantity)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(quantity);
	}
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}

	public String getStatus()
	{
		String msg=status_msg.getText();
		return msg;
	}
}
