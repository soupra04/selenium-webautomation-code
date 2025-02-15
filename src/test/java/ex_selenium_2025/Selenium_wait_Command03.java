package ex_selenium_2025;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_wait_Command03 {
	
	@Test
	public void test_explicit_wai() {
			
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
	    driver.get("https://app.vwo.com/#/login");
	    System.out.println(driver.getTitle());
	
	    
	    driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
	        WebElement passwordInpt =  driver.findElement(By.id("login-password"));
	        passwordInpt.sendKeys("Soupr@123");
		
	        
	        WebElement buttonSubmit =  driver.findElement(By.id("js-login-btn"));
	        buttonSubmit.click();
	       
	        
	        //WebElement textError = driver.findElement(By.className("notification-box-description"));
	        
	        
	        //condition
	        
	        FluentWait<WebDriver> wait = new FluentWait<>(driver)
	        		                    .withTimeout(Duration.ofSeconds(10))
	        		                    .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	        
	        
	        WebElement textError = wait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	              return driver.findElement(By.className("notification-box-description"));
	            }
	          });
	        
	        
	      //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
	       //wait.until(ExpectedConditions.textToBePresentInElement(textError, "Your email, password, IP address or location did not match"));
	      //  wait.until(ExpectedConditions.invisibilityOf(textError));
	        Assert.assertEquals(textError.getText(), "Your email, password, IP address or location did not match");
	}
}
