package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class X_Path_axes_test_Case02 {
	
	@Test
	public void test_case_02() {
		
		EdgeOptions edgeOptions = new EdgeOptions();
		 edgeOptions.addArguments("--start-maximized");
		 WebDriver driver = new EdgeDriver(edgeOptions);
	      driver.get("https://portal.stage.opentact.org/auth/login/");
	      
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      
	      WebElement text = driver.findElement(By.xpath("//div[@class='errors']/p[text()=\"Email is a required field\"]"));
	      System.out.println(text.getText());
	      
	      
	      
		
	}

}
