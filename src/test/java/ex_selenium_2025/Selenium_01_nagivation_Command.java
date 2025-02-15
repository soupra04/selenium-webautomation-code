package ex_selenium_2025;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium_01_nagivation_Command {
	
	@Test
	
	public void test_selenium01() throws InterruptedException {
		
		//Create an object of webdriver
		
		//FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://app.vwo.com/#/login");
		//driver.quit();
		
		//EdgeDriver driver = new EdgeDriver(); //Source code - Post Req
		//driver.get("https://app.vwo.com/#/login");
		
		//father reference with child object -- Dynamic Dispatch
		 //Webdriver hirearchy
		
		 // Initialize WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        // Open the VWO login page
        driver.get("https://www.sdetclub.com/");
		Thread.sleep(5000);
		driver.navigate().to("https://thetestingacademy.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();

		
	}

}
