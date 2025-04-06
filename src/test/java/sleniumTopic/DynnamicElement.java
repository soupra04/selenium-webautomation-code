package sleniumTopic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynnamicElement {
	static WebDriverWait wait;
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions edgeoptions = new EdgeOptions();
		edgeoptions.addArguments("--start-maximized");
		driver = new EdgeDriver(edgeoptions);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");

		WebElement dashbaordText = driver
				.findElement(By.xpath("//h3[contains(text(), 'Dynamically Loaded Page Elements')]"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(dashbaordText));

		WebElement example1 = driver
				.findElement(By.xpath("//a[normalize-space()='Example 1: Element on page that is hidden']"));
		example1.click();
		
	}

}
