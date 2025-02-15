package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class X_Patch_Axes_testCase {
	
@Test
public void test_case_01() {
	
	  EdgeOptions edgeOptions = new EdgeOptions();
	 edgeOptions.addArguments("--start-maximized");
	 WebDriver driver = new EdgeDriver(edgeOptions);
      driver.get("https://awesomeqa.com/webtable.html");
      
      WebElement google = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[1]"));
      
      System.out.println(google.getText());
      //https://awesomeqa.com/webtable.html - this is table for testing
      
      //we can find the element with the help of following-sibling -//table[@id='customers']/tbody/tr[2]/td[2]/following-sibling::td
      
      //driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]/following-sibling::td"));
	
      //driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]/preceding-sibling::td"));
      
      
}

}
