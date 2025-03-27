package ex_selenium22_03_2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AertsInTestNG {
	
	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		driver = new EdgeDriver(edgeOptions);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	
	@Test
	public void testPage() {
		driver.getPageSource();
		System.out.println("The current URL of this page" + driver.getCurrentUrl());
		System.out.println("The current Title of this page" + driver.getTitle());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
		
		
	}
}
