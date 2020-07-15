package startupProject;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import lib.ExcelDataConfig;

public class LoginAsManager extends BaseClass
{
	public static SoftAssert softAssertion;
	public static void softAssert()
	{
		  softAssertion= new SoftAssert();
	}
	
@Test(dataProvider = "wordpressData")
public static void managerLogin(String username, String password) throws Exception
{
	driver.findElement(By.xpath("//input[@id='zpm-login-username']")).sendKeys(username);
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@id='zpm-login-password']")).sendKeys(password);
	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@id='zpm-login-organization']")).sendKeys("KENNOVATION");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//button[@name='zpm-login']")).click();
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@id='zpm-add-new-btn']//img")).click();
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//img[@id='zpm-sidebar-avatar-image']")).click();
    //driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
}

@DataProvider(name="wordpressData")
public Object[][] passData()
{
	ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\CG-DTE\\Desktop\\startupProject\\test data\\loginData.xlsx");
	int row=config.getRowCount(0);
	Object[][] data=new Object[row][2];
	
	for(int i=0; i<row; i++)
	{
		data[i][0]=config.getData(0, i, 0);
		data[i][1]=config.getData(0, i, 1);
	}
	
	return data;
}

 






}
