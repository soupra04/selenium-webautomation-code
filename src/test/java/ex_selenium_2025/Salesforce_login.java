package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Salesforce_login {

	@Test
	public void test_login() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		 edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
	      driver.get("https://computacenterplc--internalcc.sandbox.my.salesforce.com/");
	      
	      WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	      email.sendKeys("soupra.maity2@computacenter.com.internalcc");
	      
	     
	      WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	      password.sendKeys("Soupr@1234");
		
	      WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	      submit.click();
	      
	    //input[@type='submit']
		
		
	}
}
