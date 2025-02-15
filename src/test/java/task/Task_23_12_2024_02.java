package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task_23_12_2024_02 {
	
	@Test
	
	public void test_02() throws InterruptedException {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		
		 WebDriver driver = new EdgeDriver(edgeOptions);
	     driver.get("https://awesomeqa.com/practice.html");
	     
	     Thread.sleep(3000);
	     WebElement firstName = driver.findElement(By.name("firstname"));
	     firstName.sendKeys("Soupra");
	     
	     Thread.sleep(3000);
	     WebElement lastname = driver.findElement(By.name("lastname"));
	     lastname.sendKeys("Maity");
	     
	     
	     Thread.sleep(3000);
	     WebElement male = driver.findElement(By.id("sex-0"));
	     male.click();
	     
	     Thread.sleep(3000);
	     WebElement expereience = driver.findElement(By.id("exp-6"));
	     expereience.click();
	     
	     
	     Thread.sleep(3000);
	     WebElement datePicker = driver.findElement(By.id("datepicker"));
	     datePicker.sendKeys("12032024");
	      
	     Thread.sleep(3000);
	     WebElement profession = driver.findElement(By.id("profession-0"));
	     profession.click();
	     
	     
	     
	     
	     
	     
	}

}
