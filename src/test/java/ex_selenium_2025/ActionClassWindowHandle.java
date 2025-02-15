package ex_selenium_2025;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class ActionClassWindowHandle {
	
	@Test
	
	public void test_windowHandle() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");

		 WebDriver driver = new EdgeDriver(edgeOptions);
		String URL = "https://the-internet.herokuapp.com/windows";
		driver.get(URL);
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window" + parentWindow);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println("Wondow Handles: " + windowhandles);
		
		
		for (String handle:windowhandles) {
			driver.switchTo().window(handle);
			if ( driver.getPageSource().contains("New Window")) {
				System.out.println("Test Case passed");
				break;
			}
	
	}
		driver.quit();
	}

}
