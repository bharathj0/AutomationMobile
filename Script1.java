package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Script1 extends Generic 
{
	
		@Parameters({"email","Pass"})
		 @Test
			public void Sign(String email,String Pass) throws InterruptedException
			{  
				driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
				driver.findElement(By.xpath("//a[.='Sign up']")).click();
				driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Bharath");//First Name
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("J");//Last Name
				driver.findElement(By.xpath("//input[@type='Email']")).sendKeys(email);//Email
				driver.findElement(By.xpath("//input[@type='Password']")).sendKeys(Pass);//password
				driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07-08-1998");//DOB
				driver.findElement(By.xpath("//label[.='Male']/../input[1]")).click();//Male
				driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).click();//Female
				driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9987234526");//MOB
				driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello bharath");//BIO
				driver.findElement(By.xpath("//button[@type='submit']")).click();//Register
				driver.switchTo().alert().accept();
				driver.findElement(By.xpath("//button[.='Sign In']")).click();//Sign in
				driver.switchTo().alert().accept();
				driver.findElement(By.id("username")).sendKeys("bharath@gamil.com");
				driver.findElement(By.id("password")).sendKeys("@!123");
				driver.findElement(By.xpath("//a[.='Log In']")).click();
			}
	}


