package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShot extends Generic
{
	 @Test
		public void Sign() throws InterruptedException, IOException
		{  
			driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
			driver.findElement(By.xpath("//a[.='Sign up']")).click();
			driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Bharath");//First Name
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("J");//Last Name
			driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("Bharath");//Email
			driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("bharath1234");//password
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("07-08-1998");//DOB
			driver.findElement(By.xpath("//label[.='Male']/../input[1]")).click();//Male
			driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).click();//Female
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9987234526");//MOB
			driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello bharath");//BIO
			driver.findElement(By.xpath("//button[@type='submit']")).click();//Register
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			TakesScreenshot ss=(TakesScreenshot) driver;
			File src1=ss.getScreenshotAs(OutputType.FILE);
			File dst1= new File("C:\\Users\\bharath\\Pictures\\MobileWord.jpg");
			FileUtils.copyFile(src1, dst1);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[.='Sign In']")).click();//Sign in
			driver.switchTo().alert().accept();
			driver.findElement(By.id("username")).sendKeys("bharath@gamil.com");
			driver.findElement(By.id("password")).sendKeys("@!123");
			driver.findElement(By.xpath("//a[.='Log In']")).click();
		}
}
