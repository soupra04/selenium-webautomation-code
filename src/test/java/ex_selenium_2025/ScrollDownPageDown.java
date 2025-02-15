package ex_selenium_2025;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollDownPageDown {
	
	
	@Test
	
	public void test_pageDown() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");

		 WebDriver driver = new EdgeDriver(edgeOptions);
		String URL = "https://www.makemytrip.com/";
		driver.get(URL);
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		System.out.println("page scroll");
		
	}

}
