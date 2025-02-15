package ex_selenium_2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Test_Selenium03_important_commands {
	

     // Open the VWO login page
	@Test
	
	public void test_selenium_03() throws Exception {
	 
	 
	
	//verify the title and search a string in page source
	//add assert that cura health source is visible in page source
	
	
	//EdgeOptions edgeOptions = new EdgeOptions();
	//edgeOptions.addArguments("--start-maximized");
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	//maximize the window
	driver.manage().window().maximize();
	
	//TestNG assertions
	Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
	
	//asertJ
	assertThat(driver.getTitle()).isNotBlank().isNotEmpty();
	assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service");
	assertThat(driver.getCurrentUrl()).isEqualTo("");
	
	if (driver.getPageSource().contains("CURA Healthcare Service")) {
		Assert.assertTrue(true);
	} else {
		throw new Exception("heading Not Found!!");
	}
	
	driver.quit();
	
	}
	
		
}
