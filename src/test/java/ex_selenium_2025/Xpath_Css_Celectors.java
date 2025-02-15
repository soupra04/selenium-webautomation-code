package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Xpath_Css_Celectors {
	
	
	@Test
	public void test_x_path() throws InterruptedException {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		
		 WebDriver driver = new EdgeDriver(edgeOptions);
	     driver.get("https://www.idrive360.com/enterprise/login");
          
	     
	     Thread.sleep(5000);
	     WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
	     email.sendKeys("augtest_040823@idrive.com");
	     
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456");
		
		WebElement submittbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		submittbutton.click();
		
		Thread.sleep(5000);
		//types of Xpath functions
		driver.findElement(By.xpath("//h5[text()=\"Your free trial has expired\"]"));
		//driver.findElement(By.xpath("//h5[contains(text(),'Free')]"));  //--Not wo0rking
		
		//driver.findElement(By.xpath("//h5[contains(@class,'id-card-title')]"));
		//driver.findElement(By.xpath("//h5[starts-with(text(),'Your')]"));
		//driver.findElement(By.xpath("//h5[ends-with(text(),'expired')]"));  //--not working
		
		
	}
	

}
