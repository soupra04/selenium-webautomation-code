package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassWriteInCaps {

	
	@Test
	
	public void test_upper_keys() throws InterruptedException {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
	      driver.get("https://awesomeqa.com/practice.html");
	      System.out.println(driver.getTitle());
	      
	      WebElement firstname = driver.findElement(By.name("firstname"));
	      //How to Write in caps
	      Actions actions = new Actions(driver);
	      actions.keyDown(Keys.SHIFT).sendKeys(firstname,"The Testing academy").keyUp(Keys.SHIFT).build().perform();
	      
	Thread.sleep(3000);
	
	}
}
