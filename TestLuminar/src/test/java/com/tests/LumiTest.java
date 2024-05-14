package com.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utilities.Utilities;


public class LumiTest {
	
	
	@Test
	public void Lumitest() throws AWTException, InterruptedException {
		

		WebDriver driver= new ChromeDriver();
		driver.get("https://luminar-crm-qa.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("dnsqaarun@gmail.com");
		driver.findElement(By.id("password")).sendKeys("superadmin");
		driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
		
driver.findElement(By.xpath("//body/div[@id='root']/div[2]/nav[1]/div[1]/div[1]/div[2]/ul[1]/a[2]/div[1]/*[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/main/div/div/div[1]/div[2]/div/div[8]/a/button")).click();

for(int i=0;i<=10;i++)
{
		driver.get("https://luminar-crm-qa.vercel.app/leads/create");  // QA
//		driver.get("https://crm.luminartechnolab.com/leads/create");  // Production
		String name="Test"+Utilities.getSaltString();
		String email=name+"@gmail.com";
		long theRandomNum = (long) (Math.random()*Math.pow(10,10));
		String Mobile = Long.toString(theRandomNum);
		
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("contactNumber")).sendKeys(Mobile);
		driver.findElement(By.name("email")).sendKeys(email);
		
		
		//STATUS
		{
	WebElement l =driver.findElement(By.xpath("	/html/body/div[1]/div[2]/div[2]/main/div/div[2]/form/div[3]/div[2]/div/div/input"));
			l.click();
			
			String value1="PROCEED TO ADMISSION";
			Utilities.dropdown(value1, l);	
		}
				
		//COUNCILOR
		{
	WebElement l =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/form[1]/div[3]/div[3]/div[1]/div[1]/input[1]"));
			l.click();
		
			String value1="QA councilor";
			Utilities.dropdown(value1,l);
		}
	   
		//COURSE
		{
	WebElement l =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));
			l.click();
		
			String value1="New Course May";
			Utilities.dropdown(value1,l);
		}
		//COURSE MODE
		{
	WebElement l =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/form[1]/div[4]/div[3]/div[1]/div[1]/input[1]"));
			l.click();
			
			String value1="OFFLINE";
			Utilities.dropdown(value1,l);
		}

	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[3]/button[1]")).click();
	
	Thread.sleep(1000);

	 
	}
	}
	
	
//	public void dropdown(String check_value,WebElement l) throws AWTException 
//	{
//		String field_value=" ";
//		Robot robo=new Robot();
//		int count=1;
//		do
//		{
//		
//		for(int i=1;i<=count;i++)
//		{
//		robo.keyPress (KeyEvent.VK_DOWN);
//		}	
//		robo.keyPress (KeyEvent.VK_ENTER);	
//		
//		field_value = l.getAttribute("value");
//		count=count+1;
//		if(count>60)
//		{
//			System.out.println(check_value+" "+ " not found");
//			break;
//		}
//	
//		}
//		while (!check_value.equals(field_value));
//	}
//
//
}
