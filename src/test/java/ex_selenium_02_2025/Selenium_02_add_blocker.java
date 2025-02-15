package ex_selenium_02_2025;

import java.io.File;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium_02_add_blocker {
	
	@Test
	
	public void testmethod01() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addExtensions(new File("D:\\Java workspace\\selenium-WebAutomation\\src\\test\\java\\ex_selenium_02_2025\\AdBlocks.crx"));
		
		EdgeDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://youtube.com");
		
		
		
	}
	

}
