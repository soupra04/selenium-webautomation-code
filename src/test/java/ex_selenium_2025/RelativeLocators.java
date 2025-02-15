package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class RelativeLocators {

	@Test
	
	//rightof
	//leftof
	//aboveof
	
	public void test_relative_locators() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");

		 WebDriver driver = new EdgeDriver(edgeOptions);
		String URL = "https://awesomeqa.com/practice.html";
		driver.get(URL); 
		
		WebElement yearsOfExp = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
	driver.findElement(with(By.id("exp-3")).toRightOf(yearsOfExp)).click();
	
		
	}
}
