package startupProject;

import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class QuotationPage extends LoginAsManager {
	public static String projectid ;
	@Test
	public void addQuotation() throws Throwable
	{
		//Action act = new Actions(webdriver);
		//Click on quotation icon
		driver.findElement(By.xpath("//span[@class='zpm-menu-icon fas fa-file-alt']")).click();
		
		
		
		//click on add quotation
//		driver.findElement(By.xpath("//button[@id='testModal']")).click();
//		Thread.sleep(5000);
//		//Selection of contact
//		Select sec =new Select (driver.findElement(By.xpath("//select[@id='zpm-edit-quotation__client']")));
//		sec.selectByVisibleText("Verolt Engineering Private Limited");
//		
//		
//		 //Select the pricelist
//		
//		Select sec1 = new Select (driver.findElement(By.xpath("//select[@id='zpm-edit-quotation__pricelist']")));
//		sec1.selectByVisibleText("Pricelist B");
//
//		//selection of department
//		Select sec2 = new Select (driver.findElement(By.xpath("//select[@id='zpm-edit-quotation__department']")));
//		sec2.selectByVisibleText("SERVICES UNDER THE COMPANIES ACT 2013");
//		Thread.sleep(5000);
//		
//		//Select the ID
//				 
//				 String projectid = driver.findElement(By.id("zpm-edit_quotation_project_id")).getAttribute("value");
//				
//		
//				Thread.sleep(5000);
//		
//		//click on order date
//				driver.findElement(By.xpath("//input[@id='zpm-edit_quotation_order_date']")).click();
//				Robot rob = new Robot();
//				
//				rob.keyPress(KeyEvent.VK_2);
//				rob.keyPress(KeyEvent.VK_5);
//				
//				rob.keyPress(KeyEvent.VK_0);
//				rob.keyPress(KeyEvent.VK_6);
//				
//				rob.keyPress(KeyEvent.VK_2);
//				rob.keyPress(KeyEvent.VK_0);
//				rob.keyPress(KeyEvent.VK_2);
//				rob.keyPress(KeyEvent.VK_0);
//				
//				//rob.keyPress(06);
//				//rob.keyPress(2020);
//		//driver.findElement(By.xpath("//input[@id='zpm-edit_quotation_order_date']")).click();
//		//List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//		
//		
//		//selection quotation payment terms
//		Select sec3 = new Select(driver.findElement(By.xpath("//select[@id='zpm-edit_quotation_payment_terms']")));
//		sec3.selectByVisibleText("15 Days");
//		
//		//selection of manager
//		
//		Select sec4 = new Select(driver.findElement(By.xpath("//select[@id='zpm-edit-quotation__manager']")));
//		sec4.selectByVisibleText("Abhay Gadkari");
//		
//		//selection of client user
//		Select sec5 = new Select(driver.findElement(By.xpath("//select[@id='zpm-edit-quotation__client_user']")));
//		sec5.selectByVisibleText("Nilesh");
//		Thread.sleep(5000);
//		
//		//Scroll the page down
//		
//		//JavascriptExecutor js = (JavascriptExecutor) driver;
//		//js.executeScript("window.scrollBy(0,2000)");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement nextPage = driver.findElement(By.xpath("//select[@id='zpm-edit_quotation_services']"));	
//		js.executeScript("arguments[0].scrollIntoView();", nextPage);
//		
//		//selection of services
//		Thread.sleep(5000);
//		Select sec6 =new Select(driver.findElement(By.xpath("//select[@id='zpm-edit_quotation_services']")));
//		sec6.selectByVisibleText("Rights issue of shares");
//		
//		Thread.sleep(4000);
//
//		//selection of fee type
//		Select sec7 = new Select(driver.findElement(By.xpath("//select[@id='service-feetype']")));
//		sec7.selectByVisibleText("Fixed Price");
//
//		Thread.sleep(4000);
//
//		//click on add more buttons
//		//driver.findElement(By.xpath("//button[@id='add-more-lines']")).click();
//
//		
//		Thread.sleep(4000);
//		
//
//		//again selection of services
//		
//		//Select sec8 =new Select(driver.findElement(By.xpath("//div[@id='myModal']//div[2]//div[1]//select[1]")));
//		//sec8.selectByVisibleText("Issue of shares on rights basis");
//
//		
//		Thread.sleep(4000);
//
//		//price type
//		//Select sec9 = new Select(driver.findElement(By.xpath("form-control")));
//		//sec9.selectByVisibleText("Fixed Price");
//
//		
//		Thread.sleep(4000);
//
//		//click on submit button
//		
//		driver.findElement(By.xpath("//button[@id='submit-quotation']")).click();
//		
//		Thread.sleep(4000);
//
//		
//		
//		
//		
//		
//	}
//
		
//		Filter quoation through client name
		Thread.sleep(4000);
        WebElement Client = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[1]/select[1]"));
		
		Select objselect = new Select(Client);
		
		objselect.selectByVisibleText("IT TechDeal");
		
		
		
		// click on Filter quotation button

		
		

	
	 
	    
	    	WebElement department = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[2]/select[1]"));
	        Select objdepartment =new  Select(department);
	        objdepartment.selectByVisibleText("SERVICES UNDER THE COMPANIES ACT 2013");
	        
	        Thread.sleep(4000);
	        WebElement services = driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[3]/select[1]"));
	        Select objservices = new Select(services);
	        objservices.selectByVisibleText("Buyback of shares");
	        
	        
	        DateFormat df = new SimpleDateFormat("dd/MM/yy");
	        Date dateobj = new Date();
	        System.out.println(df.format(dateobj));
	    
	   
		    WebElement buttonclick = driver.findElement(By.xpath("//button[@id='btn-filter-quotations']"));
		    buttonclick.click();
	

   
    

   




	}
}

