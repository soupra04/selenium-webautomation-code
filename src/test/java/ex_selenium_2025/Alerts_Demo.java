package ex_selenium_2025;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts_Demo {
	
	@Test
	public void test_alert_demo() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    System.out.println(driver.getTitle());
	    
	    WebElement elelment = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	    
	    WebElement elelmentConfirm =driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	    
	    WebElement elelment_popup= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	    
	    
	    elelment_popup.click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
	    wait.until(ExpectedConditions.alertIsPresent());
	    
	    
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("Soupra");
	    alert.accept();
	   
	    
	    String result = driver.findElement(By.id("result")).getText();
	    //Assert.assertEquals(result, "You successfully clicked an alert");
	    Assert.assertEquals(result, "You entered: Soupra");
	    		
	    


	    		
	    
	    
	    
	   
		
	}

	
	
}
