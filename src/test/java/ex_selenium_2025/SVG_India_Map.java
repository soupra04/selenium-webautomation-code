package ex_selenium_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

@Test
public class SVG_India_Map {
	//search tripura and click on it
	
	public void test_india_map() {
	
	EdgeOptions edgeOptions = new EdgeOptions();
	edgeOptions.addArguments("--start-maximized");
	 WebDriver driver = new EdgeDriver(edgeOptions);
      driver.get("https://www.amcharts.com/svg-maps/?map=india");
      System.out.println(driver.getTitle());
      
      
      List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']"));
      
      
      for (WebElement state : states) {
          String ariaLabel = state.getAttribute("aria-label");
          if (ariaLabel != null && ariaLabel.contains("Tripura")) {
              System.out.println("Found state: " + ariaLabel);
              state.click();
              break;
          }
      
      }
	}

}
