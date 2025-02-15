package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassSessionMoveElement {
	
	
	@Test
	
	public void test_move_element() {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
	      driver.get("https://www.spicejet.com/");
	      System.out.println(driver.getTitle());
		
	      WebElement inputFlight = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
	      //inputFlight.sendKeys("BLR");
	      
	    Actions actions = new Actions(driver);
	    actions.moveToElement(inputFlight).click().sendKeys("BLR").build().perform();
	      
	}

}
