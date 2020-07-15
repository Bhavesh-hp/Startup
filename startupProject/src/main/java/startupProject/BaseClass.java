package startupProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import readExcelData.ReadExcel;

public class BaseClass extends ReadExcel
{
	public static WebDriver driver;
  @BeforeTest
public static void StartUp() throws Exception
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\CG-DTE\\Desktop\\startupProject\\drivers\\chromedriver.exe");

 driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://cacs-service.kennovation-services.com/");
Thread.sleep(1000);


}
  
//  @AfterTest
////  public void close()
//  {
//	  driver.close();
//  }
//  

}
