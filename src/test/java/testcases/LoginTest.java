package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomclasses.loginpage;

public class LoginTest extends Baseclass{
	
	@Test(priority=0)
		public void TCC01_LoginTest() {
			loginpage LP = new loginpage(driver);
			LP.EnterUsername("practice");
			LP.EnterPassword("SuperSecretPassword!");
			LP.ClickLogin();
			System.out.println("test1");
		}
		@Test(priority=1)
		public void TCC02_LoginTest() {
			loginpage LP = new loginpage(driver);
			LP.EnterUsername("practice");
		LP.EnterPassword("SuperSecretPassword");
			LP.ClickLogin();
			System.out.println("test2");
			WebElement e = driver.findElement(By.xpath("//div[@id='flash'])"));
		String title=e.getText();
			Assert.assertEquals(title, "Your password is invalid");
		}
		@Test(priority=2)
		public void TCC03_LoginTest() {
		
			System.out.println("test3");
		}
	}

