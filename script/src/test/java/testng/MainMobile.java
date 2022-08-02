package testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainMobile extends Generic
{
	
		      String FirstName="Bharath";
		      String LastName="J";
		      String MobileNo="9876098790";
	          String Email="bharath@gmail.com";
	          String Password="bharath@1";
			 @Test(priority = 1)
				public void Sign() throws InterruptedException
				{  
					driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
					driver.findElement(By.xpath("//a[.='Sign up']")).click();
					driver.findElement(By.xpath("//input[@id='myName']")).sendKeys(FirstName);//First Name
					driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(LastName);//Last Name
					driver.findElement(By.xpath("//input[@type='Email']")).sendKeys(Email);//Email
					driver.findElement(By.xpath("//input[@type='Password']")).sendKeys(Password);//password
					driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09-08-1998");//DOB
					driver.findElement(By.xpath("//label[.='Male']/../input[1]")).click();//Male
					driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).click();//Female
					driver.findElement(By.xpath("//input[@type='number']")).sendKeys(MobileNo);//MOB
					driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello Bharath");//BIO
					driver.findElement(By.xpath("//button[@type='submit']")).click();//Register
					driver.switchTo().alert().accept();
					driver.findElement(By.xpath("//button[.='Sign In']")).click();//Sign in
					driver.switchTo().alert().accept();
					driver.findElement(By.id("username")).sendKeys("bharath007@gmail.com");
					driver.findElement(By.id("password")).sendKeys("Bharath@!123");
					driver.findElement(By.xpath("//a[.='Log In']")).click();
				}
			 @Test( priority = 2,dataProvider="getdata")
				public void login(String email, String pwd)
				{
					driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
					driver.findElement(By.id("username")).sendKeys(email);
					driver.findElement(By.id("password")).sendKeys(pwd);
					driver.findElement(By.xpath("//a[.='Log In']")).click();
					
				}
				
				@DataProvider
			    public Object[][] getdata()
				 {
			            Object[][] data=new Object[5][2];
			            data[0][0]="Bharath@gamil.com";
				        data[0][1]="Peace";
				        data[1][0]="akshay@gamil.com";
				        data[1][1]="Scientist";
			            data[2][0]="manoj@gamil.com";
				        data[2][1]="expert";
				        data[3][0]="devakar@gamil.com";
				        data[3][1]="hello";
			            data[4][0]="ranjan@gamil.com";
				        data[4][1]="hi";
				        return data;	
				}
				@Test(priority = 3)
				public void Order()
				{
					driver.findElement(By.linkText("Order")).click();
				    Set<String>win=driver.getWindowHandles();
					Iterator<String>it=win.iterator(); 
					String parentId=it.next();
					String childId=it.next();
					driver.switchTo().window(childId);
					driver.findElement(By.id("inputFirstName")).sendKeys("Bharath");//First Name
					driver.findElement(By.xpath("//label[.='Last Name']/following-sibling::input[1]")).sendKeys("j");//Last Name
					driver.findElement(By.id("inputEmail")).sendKeys("akshay@gmail.com");//Email
					driver.findElement(By.id("inputPassword")).sendKeys("akshay123");//password
					driver.findElement(By.id("flexRadioDefault1")).click();//Male
					driver.findElement(By.id("flexRadioDefault2")).click();//Female
					driver.findElement(By.xpath("//input[@placeholder='00000000000']")).sendKeys("9987234526");//MOB
					driver.findElement(By.xpath("//input[@id=' address1']")).sendKeys("H2 block, Manyatha tech park");
					driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Naagavara");
					driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("Bangalore");
				    WebElement web=driver.findElement(By.xpath("//select[@id='inputState']"));
					Select dropdown=new Select(web);
					dropdown.selectByVisibleText("Karnataka");
					driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("560045560045");
					driver.findElement(By.xpath("//label[.='Samsung']")).click();
					driver.findElement(By.xpath("//label[.='Apple']")).click();
					//driver.findElement(By.xpath("//label[.='Samsung']")).click();
					//driver.findElement(By.xpath("//label[.='Lenovo']")).click();
					WebElement web1=driver.findElement(By.xpath("//select[@class='multi_select']"));
					Select dropdown1=new Select(web1);
					driver.findElement(By.xpath("//option[@id='apple'][2]")).click();
					driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
					WebElement web2=driver.findElement(By.xpath("//select[@id='bought']"));
					Select dropdown2=new Select(web2);
					dropdown2.selectByVisibleText("Yes");
					driver.findElement(By.xpath("//input[@id='time']")).sendKeys("2");
					//dropdown2.selectByVisibleText("No");
					driver.findElement(By.xpath("(//input[@id='gridCheck1'])[1]")).click();
					driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).click();
					driver.findElement(By.xpath("//button[contains(.,'Ord')]")).click();//Register  
					driver.findElement(By.xpath("//a[contains(.,'Clo')]")).click();
				
				}
				 @Test(priority = 4)
			     public void contactus()
			     {
			   	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			        driver.findElement(By.linkText("Contact Us")).click();
			        Set<String> web=driver.getWindowHandles();
			        Iterator<String> it=web.iterator();
			        String parent_id=it.next();
			        String child_id=it.next();
			        driver.switchTo().window(child_id);
			        driver.manage().window().maximize();
			        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("manoj");
			        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manoj@gmail.com");
			        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543211");
			        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello guys i am manoj");
			        driver.findElement(By.xpath("//input[@value='Send']")).click();
			        driver.close();
			     }
	}


