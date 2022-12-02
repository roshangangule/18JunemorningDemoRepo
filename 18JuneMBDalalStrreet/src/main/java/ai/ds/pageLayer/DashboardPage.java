package ai.ds.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//--------- Obj repo ---------------------
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_txtbox;
	
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement select_companyoption;
	
	//-------- action methods-----------------
	public void enterCompanyName(String company_name)
	{
		search_txtbox.sendKeys(company_name);
	}
	
	public void SelectCompanyName()
	{
		select_companyoption.click();
	}
	
}
