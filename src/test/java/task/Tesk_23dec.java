package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tesk_23dec {
	
	@Test
	public void test_task_23rd() throws InterruptedException {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		
		 WebDriver driver = new EdgeDriver(edgeOptions);
	     driver.get("https://katalon-demo-cura.herokuapp.com/");
	     
	     Thread.sleep(3000);
	     WebElement makeapptButton = driver.findElement(By.id("btn-make-appointment"));
	     makeapptButton.click();
	     
	     Thread.sleep(3000);
	     WebElement userName = driver.findElement(By.name("username"));
	     userName.sendKeys("John Doe,");
	     
	     
	     Thread.sleep(3000);
	     WebElement passWord = driver.findElement(By.name("password"));
	     passWord.sendKeys("ThisIsNotAPassword");
	      
	     Thread.sleep(3000);
	     WebElement submitButton = driver.findElement(By.id("btn-login"));
	     submitButton.click();
	     
	     Assert.assertEquals(driver.getCurrentUrl(), " https://katalon-demo-cura.herokuapp.com/#appointment");
	     
	     Thread.sleep(3000);
	     driver.quit();
	     
	     
	}

}
