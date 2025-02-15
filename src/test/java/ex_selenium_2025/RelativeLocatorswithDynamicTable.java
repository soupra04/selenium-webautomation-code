package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class RelativeLocatorswithDynamicTable {
	
	@Test
	//input[@type='search' and not(@placeholder)]

	
	public void test_dyanmic_table() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");

		 WebDriver driver = new EdgeDriver(edgeOptions);
		String URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        driver.get(URL); 
        
        WebElement searchCity = driver.findElement(By.xpath("//input[@type='search' and not(@placeholder)]"));
     searchCity.sendKeys("India"+Keys.ENTER);
        
        
        
	}

}
