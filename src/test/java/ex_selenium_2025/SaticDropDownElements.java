package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SaticDropDownElements {
	
	
	@Test
	public void test_staticDropdown() {
			
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
	    driver.get("https://the-internet.herokuapp.com/dropdown");
	    System.out.println(driver.getTitle());
	    
	    WebElement webElement = driver.findElement(By.id("dropdown"));
	    Select select = new Select(webElement);
	    select.selectByIndex(1);
	
	}

}
