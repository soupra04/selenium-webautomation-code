package practice;

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

public class CheckList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://computacenterplc--internalcc.sandbox.lightning.force.com/");
		
		Actions action = new Actions(driver);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.id("Login"));
		username.sendKeys("soupra.maity@computacenter.com.internalcc");
		password.sendKeys("Soupr@1234");
		submitButton.click();
		WebElement text = driver.findElement(By.xpath("//h1[normalize-space()='Enterprise Quoting'] "));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(text));
		driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
		
		WebElement newButton = driver.findElement(By.xpath("(//a[contains(@title, 'New') and contains(@class, 'forceActionLink')])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(newButton));
		WebElement opportunityButton =driver.findElement(By.xpath("//a[contains(@class, 'outputLookupLink') and @title='Test Opportunity']"));
		action.moveToElement(opportunityButton);
		
		WebElement textonOppPage = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text[normalize-space(text())='Test Opportunity']"));
		wait.until(ExpectedConditions.visibilityOf(textonOppPage));
		WebElement importBomButton = driver.findElement(By.xpath("//button[normalize-space(text())='Import BoM']"));
		action.moveToElement(importBomButton);
		

	}

}
