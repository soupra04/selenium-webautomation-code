package ex_selenium22_03_2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PaginationTest {
	
	@Test
	public void testPagination() {
	WebDriver driver;
	EdgeOptions edgeOptions = new EdgeOptions();
	edgeOptions.addArguments("--start-maximized");
	driver = new EdgeDriver(edgeOptions);
	driver.get("https://prwqa1-dev-ed.develop.my.salesforce.com/");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("support@renewalmanager.prwqa1.stratavar.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rafi@2024");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	WebElement textonDashbaord = driver.findElement(By.xpath("//h1[span[@title='StrataVAR PRW']]"));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	wait.until(ExpectedConditions.visibilityOf(textonDashbaord));
	
	Actions actions = new Actions(driver);
	WebElement rmConsoleTab = driver.findElement(By.xpath("//a[@title='Renewal Manager - Console']"));
	actions.moveToElement(rmConsoleTab);
	
	WebElement rmConsoleText = driver.findElement(By.xpath("//h1[normalize-space(text())='Renewal Manager - Console']"));
	wait.until(ExpectedConditions.visibilityOf(rmConsoleText));
	
	WebElement icTab = driver.findElement(By.xpath("(//li[@role='presentation'])[4]/a/div/span[normalize-space(text())='Internal Contracts']"));
	actions.moveToElement(icTab);
	
	
	
	}

}
