package ex_selenium_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Click_on_anchor_tag {
	
	@Test
	public void test_click_on_link() {
	

	EdgeOptions edgeOptions = new EdgeOptions();
	edgeOptions.addArguments("--start-maximized");
	 WebDriver driver = new EdgeDriver(edgeOptions);

        // Open the VWO login page
        driver.get("https://app.vwo.com/#/login");
        
        //Assert.assertEquals(driver.getTitle(),"Login - VWO");
        System.out.println(driver.getTitle());
        
      //  WebElement clickonlink = driver.findElement(By.linkText("Start a free trial"));
      //  clickonlink.click();

        WebElement clickonlink = driver.findElement(By.partialLinkText("free trial"));
        clickonlink.click(); 
        
}
}
