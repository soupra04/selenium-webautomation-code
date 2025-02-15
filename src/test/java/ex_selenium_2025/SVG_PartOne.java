package ex_selenium_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SVG_PartOne {
	
	
	@Test
	public void test_flipkar_search() {
		//*[name()='svg']
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
	      driver.get("https://www.flipkart.com/");
	      System.out.println(driver.getTitle());
	
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("macmini");
			//we can find sv by using this Xpath as well --//*[local-name()='svg']
		List<WebElement> svgElements =driver.findElements(By.xpath("//*[name()='svg']"));
		svgElements.get(0).click();
		
		
		
		
	
}
	
}
