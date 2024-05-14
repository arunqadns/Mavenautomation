package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	
	By LOGIN_PAGE_IMAGE=By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/img[1]");
	By LOGIN_HEADING=By.xpath("//h1[normalize-space()='Login']");
	By LOGIN_EMAIL_FEILD=By.xpath("//h1[normalize-space()='Login']");
	By LOGIN_PASSWORD_FEILD=By.xpath("//h1[normalize-space()='Login']");
	By PASSWORD_EYEBUTTON=By.xpath("//button[@aria-label='toggle password visibility']//*[name()='svg']");
	By FORGET_PASSWORD=By.xpath("//a[normalize-space()='Forgot password?']");
	By LOGIN_BUTTON=By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
	String Forget_PW_PageUrl="https://luminar-crm-qa.vercel.app/forgot-password";
	
	@Test(priority=0)
	public void Verify_Login_Page_Elements()
	{
		
		driver= new ChromeDriver();
		driver.get("https://luminar-crm-qa.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		boolean Ok=false;
		if ( driver.findElement(LOGIN_PAGE_IMAGE).isDisplayed()&&driver.findElement(LOGIN_HEADING).isDisplayed()&&
				driver.findElement(LOGIN_EMAIL_FEILD).isDisplayed()&&driver.findElement(LOGIN_PASSWORD_FEILD).isDisplayed()&&
				driver.findElement(PASSWORD_EYEBUTTON).isDisplayed()&&driver.findElement(FORGET_PASSWORD).isDisplayed()&&
				driver.findElement(LOGIN_BUTTON).isDisplayed())
		{Ok=true;}
		Assert.assertEquals(Ok,true);	
		driver.close();		
		
	}
	
	@Test(priority=1)
	public void Verify_ForgetPassword_Page_Loading() throws InterruptedException
	{
		
		driver= new ChromeDriver();
		driver.get("https://luminar-crm-qa.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(FORGET_PASSWORD).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(),Forget_PW_PageUrl);
		driver.close();		
		
	}
	
	
	

}
