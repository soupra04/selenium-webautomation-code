package ex_selenium_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Tag_name {
	
	@Test
	
	public void test_tag_name() throws InterruptedException {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);

	        // Open the VWO login page
	        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");
		
	        
	        WebElement emailField = driver.findElement(By.id("page-v1-step1-email"));
	        emailField.sendKeys("Soupra");
	        
	        Thread.sleep(3000);
	        WebElement clickCheckBox = driver.findElement(By.name("gdpr_consent_checkbox"));
	        clickCheckBox.click();
	        Thread.sleep(3000);
	        List<WebElement> freeTrialBox = driver.findElements(By.tagName("button"));
	        freeTrialBox.get(0).click();
	        
	        
	}

}
