package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Negative_login_testCase01 {
	
	@Test
	public void test_negative01() throws InterruptedException {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		//edgeOptions.addArguments("inPrivate");
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);

	        // Open the VWO login page
	        driver.get("https://app.vwo.com/#/login");
	        
	        //Assert.assertEquals(driver.getTitle(),"Login - VWO");
	        System.out.println(driver.getTitle());
	        
	        driver.findElement(By.id("login-username")).sendKeys("admin@admin.com");
	       // driver.findElement(By.id("login-password")).sendKeys("Soupr@123");
     //I can write the above cod ein this way as well
	        WebElement passwordInpt =  driver.findElement(By.id("login-password"));
	        passwordInpt.sendKeys("Soupr@123");
		
	        
	        WebElement buttonSubmit =  driver.findElement(By.id("js-login-btn"));
	        buttonSubmit.click();
	        Thread.sleep(3000);
	        
	        WebElement textError = driver.findElement(By.className("notification-box-description"));
	        Assert.assertEquals(textError.getText(), "Your email, password, IP address or location did not match");
	        
	        Thread.sleep(3000);
	        driver.quit();
	}

}
