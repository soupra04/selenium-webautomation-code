package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
@Test
	
	public void test_draganddrop() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");

		 WebDriver driver = new EdgeDriver(edgeOptions);
		String URL = "https://the-internet.herokuapp.com/drag_and_drop";
		driver.get(URL);
		Actions actions = new Actions(driver);
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to =    driver.findElement(By.id("column-b"));
		
		
		//actions.dragAndDrop(from, to).perform();
		//--> Another way to drag
		
		actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		
}

}
